package com.dicodingabrar.catalogmoviemadeone

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.list_movie_main.*
import androidx.core.content.res.TypedArrayUtils.getResourceId
import androidx.core.content.res.TypedArrayUtils.getResourceId
import androidx.core.content.res.TypedArrayUtils.getResourceId
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.activity_main.*

@Parcelize
class MainActivity : AppCompatActivity(),Parcelable {

    private var movieAdapter:Adapter? = null
    private var listViewMovie:ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listViewMovie = findViewById(R.id.listViewMovie)

        val movieModelsArrayList = ArrayList<Movie>()
        movieModelsArrayList?.addAll(Movie.getMovie())
        Log.d("data", movieModelsArrayList?.size.toString() + "")

        movieAdapter = Adapter(this, movieModelsArrayList)
        listViewMovie?.adapter = movieAdapter

        listViewMovie?.setOnItemClickListener { parent, view, position, id ->
            val listElement = parent.getItemAtPosition(position)
            val data = MainActivity()

            val intent = Intent(this, DetailMovieActivity::class.java)
            intent.putExtra("tes",data)
            startActivity(intent)
        }
    }
}


