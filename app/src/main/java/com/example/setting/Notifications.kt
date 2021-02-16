package com.example.setting

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Notifications : AppCompatActivity() {

    var deafault: TextView?=null

    private lateinit var alert_details_card_view : LinearLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)


        deafault=findViewById(R.id.Name)



        alert_details_card_view = findViewById(R.id.alert_details_card_view)


        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        alert_details_card_view.setOnClickListener {
            val intent = Intent(this, MoreAlerts::class.java)

            startActivity(intent)
        }



    }
}
