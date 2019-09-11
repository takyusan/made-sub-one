package com.dicodingabrar.catalogmoviemadeone

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (
    var title: String? = null,
    var year:String? = null,
    var description: String? = null,
    var poster_drawable: Int = 0
):Parcelable{
    companion object{
        private val listPoster = intArrayOf(R.drawable.poster_aquaman, R.drawable.poster_a_star, R.drawable.poster_avengerinfinity, R.drawable.poster_birdbox, R.drawable.poster_bohemian, R.drawable.poster_bumblebee, R.drawable.poster_creed, R.drawable.poster_deadpool, R.drawable.poster_dragon, R.drawable.poster_dragonball, R.drawable.poster_glass)
        private val listTitle = arrayListOf("Aquaman", "A Star", "Avengers", "Birdbox", "Bohemian","Bumblebee","Creed", "Deadpool","Dragon", "Dragon Ball","Glass")
        private val listYear = arrayListOf("2019","2019","2019","2019","2019","2019","2018","2018","2018","2018","2018")
        private val lisDescription = arrayListOf(R.string.aquaman.toString(), R.string.astarisborn.toString(), R.string.avengers, R.string.birdbox, R.string.bohemian, R.string.bumblebee, R.string.creed, R.string.deadpool, R.string.dragonprice, R.string.dragonball, R.string.glass)

        fun getMovie():ArrayList<Movie>{
        val movie = ArrayList<Movie>()

        for (i in 0..10){
                val model = Movie()
                model.setTitleMovie(listTitle[i])
                model.setMovieYear(listYear[i])
                model.setDescMovie(lisDescription[i].toString())
                model.setImage_drawables(listPoster[i])

                movie.add(model)
            }

            return movie
        }

    }

    fun getTitleMovie(): String {
        return title.toString()
    }

    fun setTitleMovie(name: String) {
        this.title = name
    }

    fun getMovieYear():String{
        return year.toString()
    }

    fun setMovieYear(year: String) {
        this.year = year
    }

    fun getDescMovie():String{
        return description.toString()
    }

    fun setDescMovie(desc:String){
        this.description = desc
    }

    fun getImage_drawables(): Int {
        return poster_drawable
    }

    fun setImage_drawables(image_drawable: Int) {
        this.poster_drawable = image_drawable
    }

}