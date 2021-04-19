package com.androiddevs.mvvmnewsapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androiddevs.mvvmnewsapp.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            if (edt_email.text.toString().isEmpty()) {
                edt_email.error = "Required"
                edt_email.requestFocus()
            } else if (edt_password.text.toString().isEmpty()) {
                edt_password.error = "Required"
                edt_password.requestFocus()
            } else if (!edt_email.text.toString().matches(Patterns.EMAIL_ADDRESS.toRegex())) {
                Toast.makeText(this, "Invalid Email Address", Toast.LENGTH_LONG).show()
            } else if (edt_email.text.toString() == "official.nishant1115@gmail.com" && edt_password.text.toString() == "123456789") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
                startActivity(Intent(this, NewsActivity::class.java))
            } else {
                Toast.makeText(this, "New to SWEN? Register Now", Toast.LENGTH_LONG).show()
            }
        }

        btn_registerHere.setOnClickListener {
            startActivity(Intent(this, RegisterUserActivity::class.java))
        }
    }
}