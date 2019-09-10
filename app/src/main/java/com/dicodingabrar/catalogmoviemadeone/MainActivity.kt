package com.dicodingabrar.catalogmoviemadeone

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.list_movie_main.*
import androidx.core.content.res.TypedArrayUtils.getResourceId
import androidx.core.content.res.TypedArrayUtils.getResourceId
import androidx.core.content.res.TypedArrayUtils.getResourceId
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getMovie()

    }

    fun getMovie(){
        val movie = ArrayList<Movie>()
        movie.addAll(Movie.getListMovie())
        val listView = findViewById<ListView>(R.id.listViewMovie)
        listView.adapter = Adapter(this, movie)
    }






}


