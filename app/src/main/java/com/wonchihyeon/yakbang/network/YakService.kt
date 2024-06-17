package com.wonchihyeon.yakbang.network

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY =
    "c1ISMi%2BObOku4US5IhRtwjn5ZYQ3INLTkaqAYaOhkdArfvUx2HzAN%2Bj4w86CivGR7tUT9UJe1C9q5wEZXZW2bw%3D%3D"

interface YakService {
    @GET("getDrbEasyDrugList?serviceKey=$API_KEY")
    suspend fun getYakInfo(
        @Query("entpName") companyName: String = "", // 업체명
        @Query("itemName") productName: String = "", // 제품명
        @Query("itemSeq") productCode: String = "", // 품목기준코드
        @Query("efcyQesitm") efficacy: String = "", // 효능
        @Query("useMethodQesitm") usage: String = "", // 사용법
        @Query("atpnWarnQesitm") warning: String = "", // 주의 사항 경고
        @Query("atpnQesitm") precautions: String = "", // 주의사항
        @Query("intrcQesitm") interactions: String = "", // 상호 작용
        @Query("seQesitm") sideEffects: String = "", // 부작용
        @Query("depositMethodQesitm") storage: String = "", // 보관법
        @Query("pageNo") pageNo: Int = 1,
        @Query("numOfRows") numOfRows: Int = 10,
        @Query("type") responseType: String = "json"
    ): YakModel
}