package com.example.terserah.Api

import com.example.terserah.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET
interface ApiServices {
        @GET("character")
        fun getMorty () : Call<ResponseMorty>
}