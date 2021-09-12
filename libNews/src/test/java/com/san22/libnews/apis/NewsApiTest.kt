package com.san22.libnews.apis

import com.san22.libnews.APIclient
import kotlinx.coroutines.runBlocking
import org.junit.Test

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class NewsApiTest {

    var retrofit = Retrofit.Builder()
        .baseUrl("https://newsapi.org")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()


    val api=APIclient.api

        @Test
    fun `get Top Headlines`()
    {

        runBlocking {
            val response=api.getTopHeadlines("us",
                "47eb41c2e4094e6eb870d5531e950c2d")
                 println(response?.raw())
        }

    }

}