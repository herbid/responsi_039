package com.example.responsi_039

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Email = findViewById<EditText>(R.id.Email)
        val Password= findViewById<EditText>(R.id.Password)

      //  val login_tombol=findViewById<Button>(R.id.login_tombol)

        login_tombol.setOnClickListener {

            val email = Email.text.toString()
            val password = Password.text.toString()

            //register
            val email_r = intent.getStringExtra("email_r")
            val nama_r = intent.getStringExtra("nama_r")
            val password_r = intent.getStringExtra("password_r")


            if (email.isEmpty()|| password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
           else if((email_r != email  )) {
                Toast.makeText(this, " Email salahh", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
           }
            else if(password !=password_r) {
                Toast.makeText(this, "pass salah ", Toast.LENGTH_SHORT).show()
               return@setOnClickListener
            }else
            intent= Intent(this,dashboard::class.java)

            intent.putExtra("nama_r",nama_r)
            intent.putExtra("email_r",email_r)
            intent.putExtra("password_r",password_r)

            intent.putExtra("Email",email)
            intent.putExtra("Password",password)

            startActivity(intent)


        }


        register_btn.setOnClickListener {
            intent =  Intent(this,register::class.java)
            startActivity(intent)
        }


    }
}
