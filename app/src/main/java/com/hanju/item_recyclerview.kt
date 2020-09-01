package com.hanju

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_item_recyclerview.*

class item_recyclerview : AppCompatActivity() {


    lateinit var heart : ImageView
    lateinit var heartoff : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_recyclerview)

        heart = findViewById<ImageView>(R.id.heart)
        heartoff = findViewById<ImageView>(R.id.heart)

            var i = 0

        heart.setOnClickListener {
            i = 1-i;
            if(i == 0){
                heart.setImageResource(R.drawable.heart)
            } else {
                heart.setImageResource(R.drawable.hearton)
            }
        }

        comment.setOnClickListener {
            val intent = Intent(this, Comment::class.java)
            startActivity(intent)
        }

        send.setOnClickListener {
            val intent = Intent(this, Send::class.java)
            startActivity(intent)
        }

    }
}