package com.wonchihyeon.yakbang.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wonchihyeon.yakbang.data.YakData
import com.wonchihyeon.yakbang.data.toYakDataList
import com.wonchihyeon.yakbang.repository.Category
import com.wonchihyeon.yakbang.repository.YakRepository
import kotlinx.coroutines.launch
import retrofit2.HttpException

private const val TAG = "HomeViewModel"

class HomeViewModel(private val repository: YakRepository = YakRepository()) : ViewModel() {
    private val _yakDataList = MutableLiveData<List<YakData>?>()
    val yakDataList get() = _yakDataList

    fun getYakList(category: Category, query: String) {
        viewModelScope.launch {
            runCatching {
                repository.getYakInfo(category, query)
            }.onSuccess {
                _yakDataList.value = it.toYakDataList()
            }.onFailure {
                Log.e(TAG, "getYakList() failed! : $it")
                if (it is HttpException) {
                    val errorJsonString = it.response()?.errorBody()?.string()
                    Log.e(TAG, "getYakList() failed! : $errorJsonString")
                }
            }
        }
    }
}