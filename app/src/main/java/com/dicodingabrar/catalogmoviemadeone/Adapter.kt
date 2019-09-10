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


class Adapter( var context:Context, var listMovie : ArrayList<MovieModels>):BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val holder: ViewHolder

        if (convertView == null) {
            holder = ViewHolder()
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.list_movie_main, null, true)

            holder.textViewTitle = convertView!!.findViewById(R.id.textViewTitle) as TextView
            holder.textViewYear = convertView!!.findViewById(R.id.textViewYear) as TextView
            holder.textViewDes = convertView!!.findViewById(R.id.textViewDesc) as TextView
            holder.imageViewPoster = convertView.findViewById(R.id.imageViewMovie) as ImageView

            convertView.tag = holder
        } else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = convertView.tag as ViewHolder
        }

        holder.textViewTitle!!.setText(listMovie[position].getTitleMovie())
        holder.imageViewPoster!!.setImageResource(listMovie[position].getImage_drawables())

        return convertView
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

    class ViewHolder{
        lateinit var imageViewPoster:ImageView
        lateinit var textViewDes:TextView
        lateinit var textViewYear:TextView
        lateinit var textViewTitle:TextView
    }


}