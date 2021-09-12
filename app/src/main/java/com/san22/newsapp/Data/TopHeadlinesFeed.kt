package com.san22.newsapp.Data

import com.san22.libnews.APIclient
import com.san22.libnews.model.TopHeadlinesModel

class TopHeadlinesFeed {

    private val api=APIclient.api

    suspend fun getTopHeadlines(): List<TopHeadlinesModel.Article?>?
    {
          val feed=api.getTopHeadlines("us",
              "47eb41c2e4094e6eb870d5531e950c2d")?.body()?.articles

        return feed

    }
}