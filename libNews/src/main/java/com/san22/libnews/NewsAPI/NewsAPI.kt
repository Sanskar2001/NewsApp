package com.san22.libnews.NewsAPI

import com.san22.libnews.model.TopHeadlinesModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("/v2/top-headlines")
    suspend fun getTopHeadlines(@Query("country")country:String,
                                @Query("apiKey")apiKey:String):Response<TopHeadlinesModel>

}