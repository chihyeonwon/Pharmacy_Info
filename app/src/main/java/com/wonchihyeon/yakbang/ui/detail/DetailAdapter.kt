package com.wonchihyeon.yakbang.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wonchihyeon.yakbang.databinding.DetailItemLayoutBinding

class DetailAdapter(val detailList: List<String>) : RecyclerView.Adapter<DetailAdapter.ItemViewHolder>() {

    override fun getItemCount(): Int {
        return detailList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            DetailItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.detailText.text = detailList[position]
    }

    inner class ItemViewHolder(binding: DetailItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val detailText = binding.detailInfo
    }
}