package com.example.retrofit2example.api

import com.example.retrofit2example.model.ApiResponse
import com.example.retrofit2example.model.ApiResponseFromJson
import com.example.retrofit2example.model.ApiUserResponseFromJson
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

//Response 인경우 Call 객체로 반환
/*
interface ApiService {
    @GET("app/v1/company")
    fun getCompanyList(): Call<ApiResponse>
}
*/

// Coroutine 인경우 Response로 반환

interface ApiService {
    @GET("app/v1/company")
    suspend fun getCompanyList(): Response<ApiResponseFromJson>
    @GET("/app/v1/company/{companyId}/users")
    suspend fun getUserList(@Path("companyId") id:Int): Response<ApiUserResponseFromJson>
}
