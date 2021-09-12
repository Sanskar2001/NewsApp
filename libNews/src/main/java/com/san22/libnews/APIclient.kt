package com.san22.libnews

import com.san22.libnews.NewsAPI.NewsAPI
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object APIclient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://newsapi.org")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val api = retrofit.create(NewsAPI::class.java)
}