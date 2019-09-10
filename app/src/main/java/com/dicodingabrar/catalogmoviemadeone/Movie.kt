package com.dicodingabrar.catalogmoviemadeone

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (
    var title:String,
    var poster:String,
    var year:String,
    var overview:String,
    var release:String,
    var userScore:String,
    var director:String
):Parcelable{
    companion object {
        fun getListMovie():List<Movie>{
            val listMovie = ArrayList<Movie>()
            listMovie.clear()

            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            listMovie.add(Movie("Bumble B","${R.drawable.poster_bumblebee}","2019","askasaj","2019","89","bagag"))
            return listMovie
        }
    }
}



