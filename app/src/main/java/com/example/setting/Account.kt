package com.example.setting

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Account : AppCompatActivity() {


    var deafault: TextView?=null

    private lateinit var pass_details_card_view : LinearLayout
    private lateinit var delaccount_details_card_view : LinearLayout
    private lateinit var logout_details_card_view : LinearLayout




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        deafault=findViewById(R.id.Name)



        pass_details_card_view = findViewById(R.id.pass_details_card_view)

        delaccount_details_card_view = findViewById(R.id.delaccount_details_card_view)

        logout_details_card_view = findViewById(R.id.logout_details_card_view)




        var msg=intent.getStringExtra("Message")
        deafault?.text = ":$msg"


        pass_details_card_view.setOnClickListener {
            val intent = Intent(this, Password ::class.java)

            startActivity(intent)
        }

        delaccount_details_card_view.setOnClickListener {
            val intent = Intent(this, MARATHIMATRIMONY ::class.java)

            startActivity(intent)
        }

        logout_details_card_view.setOnClickListener {
            val intent = Intent(this, Logout ::class.java)

            startActivity(intent)
        }




    }
}



