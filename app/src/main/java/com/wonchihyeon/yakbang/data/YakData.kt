package com.wonchihyeon.yakbang.data

import android.os.Parcelable
import com.wonchihyeon.yakbang.model.Item
import com.wonchihyeon.yakbang.model.YakModel
import kotlinx.parcelize.Parcelize


@Parcelize
data class YakData(
    val precautions: String?, // 주의사항
    val warning: String?, // 경고
    val businessNumber: String?, // 사업자 번호
    val storageMethod: String?, // 보관 방법
    val efficacy: String?, // 효능
    val companyName: String?, // 회사 이름
    val interactions: String?, // 상호 작용
    val imageUrl: String?, // 이미지 URL
    val productName: String?, // 제품 이름
    val productCode: String?, // 제품 코드
    val registrationDate: String?, // 등록 날짜
    val sideEffects: String?, // 부작용
    val updateDate: String?, // 업데이트 날짜
    val usage: String? // 사용법
) : Parcelable

fun Item.toYakData() = YakData(
    precautions = this.atpnQesitm,
    warning = this.atpnWarnQesitm,
    businessNumber = this.bizrno,
    storageMethod = this.depositMethodQesitm,
    efficacy = this.efcyQesitm,
    companyName = this.entpName,
    interactions = this.intrcQesitm,
    imageUrl = this.itemImage,
    productName = this.itemName,
    productCode = this.itemSeq,
    registrationDate = this.openDe,
    sideEffects = this.seQesitm,
    updateDate = this.updateDe,
    usage = this.useMethodQesitm
)

fun YakModel.toYakDataList(): List<YakData>? {
    return body.items?.map { it.toYakData() }?.toList()
}