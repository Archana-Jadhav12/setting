package com.example.setting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var deafault: TextView?=null

    private lateinit var notification_details_card_view :LinearLayout
    private lateinit var account_details_card_view :LinearLayout
    private lateinit var privacy_details_card_view :LinearLayout
    private lateinit var advanced_details_card_view :LinearLayout




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        deafault=findViewById(R.id.Name)



        notification_details_card_view = findViewById(R.id.notification_details_card_view)

        account_details_card_view = findViewById(R.id.account_details_card_view)

        privacy_details_card_view = findViewById(R.id.privacy_details_card_view)

        advanced_details_card_view = findViewById(R.id.advanced_details_card_view)





        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        notification_details_card_view.setOnClickListener {
            val intent = Intent(this, Notifications::class.java)

            startActivity(intent)
        }

        account_details_card_view.setOnClickListener {
            val intent = Intent(this, Account::class.java)

            startActivity(intent)
        }

        privacy_details_card_view.setOnClickListener {
            val intent = Intent(this, PrivacySetting::class.java)

            startActivity(intent)
        }

        advanced_details_card_view.setOnClickListener {
            val intent = Intent(this, AdvancedSetting::class.java)

            startActivity(intent)
        }

    }
}
