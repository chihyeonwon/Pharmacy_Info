package com.wonchihyeon.yakbang.repository

import com.wonchihyeon.yakbang.model.YakModel
import com.wonchihyeon.yakbang.network.RetrofitInstance
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

class YakRepository {
    suspend fun getYakInfo(category: Category, query: String): YakModel = withContext(IO) {
        when (category) {
            is Category.CompanyName -> RetrofitInstance.service.getYakInfo(companyName = query)
            is Category.ProductName -> RetrofitInstance.service.getYakInfo(productName = query)
            is Category.Precautions -> RetrofitInstance.service.getYakInfo(precautions = query)
            is Category.Warning -> RetrofitInstance.service.getYakInfo(warning = query)
            is Category.StorageMethod -> RetrofitInstance.service.getYakInfo(storage = query)
            is Category.Efficacy -> RetrofitInstance.service.getYakInfo(efficacy = query)
            is Category.Interactions -> RetrofitInstance.service.getYakInfo(interactions = query)
            is Category.ProductCode -> RetrofitInstance.service.getYakInfo(productCode = query)
            is Category.SideEffects -> RetrofitInstance.service.getYakInfo(sideEffects = query)
            is Category.UsageMethod -> RetrofitInstance.service.getYakInfo(usage = query)
        }
    }
}