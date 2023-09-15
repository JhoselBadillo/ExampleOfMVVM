package com.example.mvvm.domain

import com.example.mvvm.data.QuoteRepository
import com.example.mvvm.model.QuoteModel


//Se almacena aqui la logica de negocios
class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}