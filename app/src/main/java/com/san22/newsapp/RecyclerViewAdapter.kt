package com.san22.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.san22.libnews.model.TopHeadlinesModel



class ArticlesRecyclerViewAdapter(val list:List<TopHeadlinesModel.Article?>?):
    RecyclerView.Adapter<ArticlesRecyclerViewAdapter.NewsViewHolder>() {


    class NewsViewHolder(view:View):RecyclerView.ViewHolder(view) {

        val textView=view.findViewById<TextView>(R.id.newsTitleTextView)
        val imageView=view.findViewById<ImageView>(R.id.newsPreviewImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return NewsViewHolder(view)
    }


    override fun getItemCount()=list!!.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

        holder.textView.text= list?.get(position)?.title
        holder.imageView.load(list?.get(position)?.urlToImage)
    }


}