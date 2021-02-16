package com.example.setting

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MARATHIMATRIMONY : AppCompatActivity() {


    var sp1: Spinner? = null
    var sp2: Spinner? = null
    var sp3: Spinner? = null


    lateinit var marriage: String
    lateinit var married: String
    lateinit var reasons: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marathimatrimony)


        sp1 = findViewById(R.id.spin_marry)

        sp2 = findViewById(R.id.spin_married)
        sp3 = findViewById(R.id.spin_reasons)

        sp1?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                marriage = sp1?.getItemAtPosition(position).toString()


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        sp2?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                married = sp2?.getItemAtPosition(position).toString()


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        sp3?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                reasons = sp3?.getItemAtPosition(position).toString()


                //database logic here to store

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}



