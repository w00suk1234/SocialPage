package com.hanju

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_item_recyclerview.*

class Reply : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reply)



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