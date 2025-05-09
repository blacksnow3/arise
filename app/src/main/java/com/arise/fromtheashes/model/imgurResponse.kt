package com.arise.fromtheashes.model

data class imgurResponse(
    val data: ImgurData,
    val success: Boolean,
    val status: Int
)
data class ImgurData(
    val link: String
)