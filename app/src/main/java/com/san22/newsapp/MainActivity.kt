package com.san22.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.san22.libnews.model.TopHeadlinesModel
import com.san22.newsapp.Data.TopHeadlinesFeed
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          val repo=TopHeadlinesFeed()
        var list:List<TopHeadlinesModel.Article?>?=null
        val recyclerView=findViewById<RecyclerView>(R.id.RecyclerView)


        runBlocking {
            list=repo.getTopHeadlines()
        }

        val adapter=ArticlesRecyclerViewAdapter(list)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this)
        adapter.notifyDataSetChanged()






        

    }
}