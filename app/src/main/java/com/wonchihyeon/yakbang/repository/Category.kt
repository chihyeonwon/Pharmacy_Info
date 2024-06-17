package com.wonchihyeon.yakbang.repository

sealed class Category(val value: String) {
    object CompanyName : Category("업체명")
    object ProductName : Category("제품명")
    object ProductCode : Category("품목 기준 코드")
    object Efficacy : Category("효능")
    object UsageMethod : Category("사용법")
    object Warning : Category("경고")
    object Precautions : Category("주의사항")
    object Interactions : Category("상호작용")
    object SideEffects : Category("부작용")
    object StorageMethod : Category("보관법")
}