package com.dicodingabrar.catalogmoviemadeone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        val intent:Intent = intent
        var data:MainActivity = intent.getParcelableExtra("tes")
    }
}
