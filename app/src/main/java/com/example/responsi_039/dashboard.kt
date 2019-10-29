package com.example.responsi_039

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_main.*

class dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var intent = intent
        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")
        val nama_r=intent.getStringExtra("nama_r")
        val password_r=intent.getStringExtra("password_r")
        val email_r=intent.getStringExtra("email_r")


        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text ="Nama Anda : "+nama_r+"\nemail : "+ email_r+"\npassword  : "+ password_r

        back_tmbl.setOnClickListener {
            intent =  Intent(this,MainActivity::class.java)
            startActivity(intent)
    }
}
}

