package com.example.retrofit2example.api

import com.example.retrofit2example.model.ApiResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

//interface ApiService {
//    @GET("app/v1/company")
//    suspend fun getCompanyList(): Response<ApiResponse>
//}

interface ApiService {
    @GET("app/v1/company")
    fun getCompanyList(): Call<ApiResponse>
}
