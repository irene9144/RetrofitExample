package com.example.retrofit2example.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("success") val success: Boolean,
    @SerializedName("message") val message: String,
    @SerializedName("data") val dataList: List<Company>
)

data class Company (
    @SerializedName("companyId") val companyId: Int,
    @SerializedName("name") val name: String
)