package com.example.setting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PrivacySetting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacysetting)

        val mob_btn: Button = findViewById(R.id.mob_btn)
        mob_btn.setOnClickListener {
            val intent = Intent(this, Mobile::class.java)
            startActivity(intent)
        }

        val photo_btn: Button = findViewById(R.id.photo_btn)
        photo_btn.setOnClickListener {
            val intent = Intent(this, Photo::class.java)
            startActivity(intent)
        }

        val hor_btn: Button = findViewById(R.id.hor_btn)
        hor_btn.setOnClickListener {
            val intent = Intent(this, Horoscope::class.java)
            startActivity(intent)
        }

        val video_btn: Button = findViewById(R.id.video_btn)
        video_btn.setOnClickListener {
            val intent = Intent(this, VideoChat::class.java)
            startActivity(intent)
        }

        }
    }







