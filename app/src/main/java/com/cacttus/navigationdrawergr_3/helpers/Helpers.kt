package com.cacttus.navigationdrawergr_3.helpers

import com.cacttus.navigationdrawergr_3.api.ServiceApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Helpers {
    fun provideRetrofit(): ServiceApi {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ServiceApi::class.java)
    }
}