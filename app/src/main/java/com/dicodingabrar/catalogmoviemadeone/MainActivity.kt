package com.dicodingabrar.catalogmoviemadeone

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

    private var movieAdapter:Adapter? = null
    private var listViewMovie:ListView? = null
    private var movieModelsArrayList:ArrayList<MovieModels>? = null
    private val listPoster = intArrayOf(R.drawable.poster_aquaman, R.drawable.poster_a_star, R.drawable.poster_avengerinfinity, R.drawable.poster_birdbox, R.drawable.poster_bohemian, R.drawable.poster_bumblebee, R.drawable.poster_creed, R.drawable.poster_deadpool, R.drawable.poster_dragon, R.drawable.poster_dragonball, R.drawable.poster_glass)
    private val listTitle = arrayListOf("Aquaman", "A Star", "Avengers", "Birdbox", "Bohemian","Bumblebee","Creed", "Deadpool","Dragon", "Dragon Ball","Glass")
    private val listYear = arrayListOf("2019","2019","2019","2019","2019","2019","2018","2018","2018","2018","2018")
    private val lisDescription = arrayListOf(R.string.aquaman.toString(), R.string.astarisborn.toString(), R.string.avengers, R.string.birdbox, R.string.bohemian, R.string.bumblebee, R.string.creed, R.string.deadpool, R.string.dragonprice, R.string.dragonball, R.string.glass)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listViewMovie = findViewById(R.id.listViewMovie)
        movieModelsArrayList = getMovie()
        Log.d("data", movieModelsArrayList!!.size.toString() + "")
        //Log.d("datanya",movieModelsArrayList!!.get().description.toString())
        movieAdapter = Adapter(this, movieModelsArrayList!!)
        listViewMovie!!.adapter = movieAdapter

    }

    fun getMovie():ArrayList<MovieModels>{
        val movie = ArrayList<MovieModels>()

        for (i in 0..10){
            val model = MovieModels()
            model.setTitleMovie(listTitle[i])
            model.setMovieYear(listYear[i])
            model.setDescMovie(lisDescription[i].toString())
            model.setImage_drawables(listPoster[i])

            movie.add(model)
        }

        return movie
    }




}


