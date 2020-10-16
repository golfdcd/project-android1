package com.example.pargolf2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {
            val username = username_login.text.toString()
            val password = password_login.text.toString()
            if (username == null || password == null) {


                Toast.makeText(applicationContext, "$username,$password", Toast.LENGTH_LONG).show()
            }
            if (username == "g@gmail.com" && password == "1234") {

                Toast.makeText(
                    applicationContext,
                    "$username,$password,successful",
                    Toast.LENGTH_LONG
                ).show()
                val intent = Intent(applicationContext, HomeActivity2::class.java)
                startActivity(intent)
                finish()
            }
            Toast.makeText(applicationContext, "$username,$password,false", Toast.LENGTH_LONG)
                .show()
        }
    }