package com.example.responsi_039

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val nama_r = findViewById<EditText>(R.id.nama_r)
        val email_r = findViewById<EditText>(R.id.email_r)
        val password_r = findViewById<EditText>(R.id.password_r)

        val preview_btn = findViewById<Button>(R.id.preview_btn)


        preview_btn.setOnClickListener {
            val nama_r = nama_r.text.toString()
            val email_r = email_r.text.toString()
            val password_r = password_r.text.toString()

            intent = Intent(this,preview::class.java)
            intent.putExtra("nama_r", nama_r)
            intent.putExtra("email_r", email_r)
            intent.putExtra("password_r", password_r)
            //  intent.putExtra("keterangan", keterangan)
            startActivity(intent)

        }
        login_btn.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}