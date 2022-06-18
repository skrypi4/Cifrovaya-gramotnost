package com.example.test

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Service {
    @GET("api/login")
        fun logIn(@Query("login") login: String,
                  @Query("password") password: String): Call<Response<TokenResponse>>

    @POST ("/api/register/")
        fun TokenResponse(): Call<TokenResponse>

    @GET ("api/user")
    fun UserFiles(): Call<Error>

}