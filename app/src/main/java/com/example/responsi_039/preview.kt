package com.example.responsi_039

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_preview.*

class preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val intent = intent
        val nama_r = intent.getStringExtra("nama_r")
        val email_r = intent.getStringExtra("email_r")
        val password_r = intent.getStringExtra("password_r")

        val hasil_regis = findViewById<TextView>(R.id.hasil_regis)
        hasil_regis.text = "nama         : "+nama_r+"\nemail      : " + email_r+"\npassword   :" + password_r

        back.setOnClickListener {

            val intent =  Intent(this,register::class.java)
            startActivity(intent)
        }
        login_pre.setOnClickListener {

            val intent =  Intent(this,MainActivity::class.java)
            intent.putExtra("nama_r", nama_r)
            intent.putExtra("email_r", email_r)
            intent.putExtra("password_r", password_r)
            startActivity(intent)
        }
    }
}

