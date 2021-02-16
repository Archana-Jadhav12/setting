package com.example.setting

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AdvancedSetting : AppCompatActivity() {


    var deafault: TextView?=null

    private lateinit var call_details_card_view : LinearLayout
    private lateinit var block_details_card_view : LinearLayout
    private lateinit var ignore_details_card_view : LinearLayout




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advancedsetting)


        deafault=findViewById(R.id.Name)



        call_details_card_view = findViewById(R.id.call_details_card_view)

        block_details_card_view = findViewById(R.id.block_details_card_view)

        ignore_details_card_view = findViewById(R.id.ignore_details_card_view)




        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        call_details_card_view.setOnClickListener {
            val intent = Intent(this, CallPreferences::class.java)

            startActivity(intent)
        }

        block_details_card_view.setOnClickListener {
            val intent = Intent(this, BlockedProfiles::class.java)

            startActivity(intent)
        }

        ignore_details_card_view.setOnClickListener {
            val intent = Intent(this, IgnoredProfiles::class.java)

            startActivity(intent)
        }


    }
}