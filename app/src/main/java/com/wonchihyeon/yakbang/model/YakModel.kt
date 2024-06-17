package com.wonchihyeon.yakbang.model


import com.google.gson.annotations.SerializedName

data class YakModel(
    @SerializedName("body")
    val body: Body,
    @SerializedName("header")
    val header: Header
)