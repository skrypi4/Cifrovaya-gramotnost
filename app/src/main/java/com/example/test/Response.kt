package com.example.test

import com.google.gson.annotations.SerializedName

//ОШИБКА
data class Error(
    @SerializedName("code")
    val code:Int?,

    @SerializedName("message")
    val message:String?

//    @SerializedName("errors")
//    val erros:String?
)

data class Response<T>(
    @SerializedName("data")
    val data:T?,

    @SerializedName("error")
    val error:Error?
)
//ДЛЯ АВТОРИЗАЦИИ
data class UserFiles(
    @SerializedName("login")
    val login:String?,

    @SerializedName("password")
    val password:String?
)
//ДЛЯ ТОКЕНАФ
data class TokenResponse(
    @SerializedName("token")
    val token:String?
)