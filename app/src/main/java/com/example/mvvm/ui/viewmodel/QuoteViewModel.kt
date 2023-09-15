package com.example.mvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm.domain.GetQuotesUseCase
import com.example.mvvm.domain.GetRandomQuoteUseCase
import com.example.mvvm.model.QuoteModel
import com.example.mvvm.model.QuoteProvider
import kotlinx.coroutines.launch

//Se debe de extender a ViewModel()
class QuoteViewModel : ViewModel() {

    //LiveData para que la actividad se pueda conectar pero como sera un valor modificado debe ser una lista mutable y ese modelo de datos se encapsula el objeto al que queremos acceder
    val quoteModel = MutableLiveData<QuoteModel?>()
    var getQuotesUseCase = GetQuotesUseCase()
    val isLoading = MutableLiveData<Boolean>()
    var getRandomQuoteUseCase = GetRandomQuoteUseCase()


    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()

            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }



    fun randomQuote() {
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if(quote!=null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }
}