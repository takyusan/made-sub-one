package com.dicodingabrar.catalogmoviemadeone

class MovieModels {
    var title: String? = null
    var year:String? = null
    var description: String? = null
    var poster_drawable: Int = 0

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