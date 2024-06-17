package com.wonchihyeon.yakbang.model


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("atpnQesitm")
    val atpnQesitm: String,
    @SerializedName("atpnWarnQesitm")
    val atpnWarnQesitm: String,
    @SerializedName("bizrno")
    val bizrno: String,
    @SerializedName("depositMethodQesitm")
    val depositMethodQesitm: String,
    @SerializedName("efcyQesitm")
    val efcyQesitm: String,
    @SerializedName("entpName")
    val entpName: String,
    @SerializedName("intrcQesitm")
    val intrcQesitm: String,
    @SerializedName("itemImage")
    val itemImage: String,
    @SerializedName("itemName")
    val itemName: String,
    @SerializedName("itemSeq")
    val itemSeq: String,
    @SerializedName("openDe")
    val openDe: String,
    @SerializedName("seQesitm")
    val seQesitm: String,
    @SerializedName("updateDe")
    val updateDe: String,
    @SerializedName("useMethodQesitm")
    val useMethodQesitm: String
)