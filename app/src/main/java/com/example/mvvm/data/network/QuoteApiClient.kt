package com.example.mvvm.data.network

import com.example.mvvm.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET


//Consumi de API's
interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}