package com.example.setting

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Password : AppCompatActivity() {

    var deafault: TextView?=null

    private lateinit var cancel_details_card_view : LinearLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        deafault=findViewById(R.id.Name)



        cancel_details_card_view = findViewById(R.id.cancel_details_card_view)

        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        cancel_details_card_view.setOnClickListener {
            val intent = Intent(this, Account ::class.java)

            startActivity(intent)
        }



    }
}