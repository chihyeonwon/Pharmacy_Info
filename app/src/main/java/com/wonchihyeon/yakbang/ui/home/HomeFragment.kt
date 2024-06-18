package com.wonchihyeon.yakbang.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wonchihyeon.yakbang.DataListAdapter
import com.wonchihyeon.yakbang.R
import com.wonchihyeon.yakbang.databinding.FragmentHomeBinding
import com.wonchihyeon.yakbang.repository.Category
import com.wonchihyeon.yakbang.ui.detail.DetailFragment

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val adapter by lazy {
        DataListAdapter { data ->
            detailFragment.arguments = Bundle().apply { putParcelable("yak_data", data) }
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, detailFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
    private val viewModel by viewModels<HomeViewModel>()
    private val detailFragment by lazy { DetailFragment() }
    private val categoryMap = mapOf(
        R.id.chip_product_name to Category.ProductName,
        R.id.chip_company to Category.CompanyName,
        R.id.chip_effect to Category.Efficacy,
        R.id.chip_side_effect to Category.SideEffects,
        R.id.chip_interaction to Category.Interactions
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        with(binding) {
            // 초기화
            yakList.adapter = adapter
            chipProductName.isChecked = true
            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    // query가 검색 문자열
                    query ?: return true
                    val queryCategory =
                        // chip 에 선택된 항목으로 검색
                        categoryMap.get(chipGroup.checkedChipId) ?: Category.ProductName
                    viewModel.getYakList(queryCategory, query)
                    searchView.hideKeyboard()
                    return true
                }

                override fun onQueryTextChange(newText: String?) = true
            })
        }
        // 이 밑 세줄은 코드가 비슷함, 데이터 명만 달라짐
        viewModel.getYakList(Category.Efficacy, "감기")
        viewModel.yakDataList.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
}