package com.dicodingabrar.catalogmoviemadeone

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.list_movie_main.view.*
import kotlinx.android.synthetic.main.list_movie_main.view.imageViewMovie
import kotlinx.android.synthetic.main.list_movie_main.view.textViewTitle
import kotlinx.android.synthetic.main.list_movie_main.view.textViewYear


class Adapter( var context:Context, var listMovie : List<Movie>):BaseAdapter() {

    override fun getView(position: Int, convertView: View, parent: ViewGroup?): View? {
        var view = convertView
        var viewHolder = ViewHolder()

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_movie_main, null)

            viewHolder.imageViewPoster = view.imageViewMovie
            viewHolder.textViewTitle = view.textViewTitle
            viewHolder.textViewYear = view.textViewYear
            viewHolder.textViewDes = view.textViewDesc

            view.tag = viewHolder
        } else {
            viewHolder = view.tag as ViewHolder
        }
        val movie = listMovie[position]

        viewHolder.textViewTitle.text = "${movie.title}"
        viewHolder.textViewYear.text = "${movie.year}"
        viewHolder.textViewDes.text = "${movie.overview}"
        viewHolder.imageViewPoster.setImageDrawable(getImageDrawable(movie.poster))

        return view
    }

    override fun getItem(position: Int): Any {
        return listMovie[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return listMovie.size
    }

    private fun getImageDrawable(poster:String):Drawable{
        val id = context.resources.getIdentifier(poster, "drawable", context.packageName)
        return context.resources.getDrawable(id)
    }

    class ViewHolder{
        lateinit var imageViewPoster:ImageView
        lateinit var textViewDes:TextView
        lateinit var textViewYear:TextView
        lateinit var textViewTitle:TextView
    }


}