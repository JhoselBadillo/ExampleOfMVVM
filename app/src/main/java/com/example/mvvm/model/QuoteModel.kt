package com.example.mvvm.model

import com.google.gson.annotations.SerializedName

/*Data Class
    Contiene solamente atributos que queremos guardar
 */
data class QuoteModel(
    @SerializedName("quote") val quote: String,
    @SerializedName("author") val author: String
)