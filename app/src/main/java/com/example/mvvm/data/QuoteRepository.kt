package com.example.mvvm.data

import com.example.mvvm.data.network.QuoteService
import com.example.mvvm.model.QuoteModel
import com.example.mvvm.model.QuoteProvider

class QuoteRepository {

    //Instanciamos el service
    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}