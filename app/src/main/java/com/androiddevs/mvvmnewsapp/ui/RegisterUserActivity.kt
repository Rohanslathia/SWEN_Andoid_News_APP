package com.androiddevs.mvvmnewsapp.ui

import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androiddevs.mvvmnewsapp.R
import kotlinx.android.synthetic.main.activity_register_user.*

class RegisterUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        btn_register.setOnClickListener {
            if (edt_name.text.toString().isEmpty()) {
                edt_name.error = "Required"
                edt_name.requestFocus()
            } else if (edt_email.text.toString().isEmpty()) {
                edt_email.error = "Required"
                edt_email.requestFocus()
            } else if (edt_password.text.toString().isEmpty()) {
                edt_password.error = "Required"
                edt_password.requestFocus()
            } else if (edt_confirmPassword.text.toString().isEmpty()) {
                edt_confirmPassword.error = "Required"
                edt_confirmPassword.requestFocus()
            } else if (!edt_email.text.toString().matches(Patterns.EMAIL_ADDRESS.toRegex())) {
                Toast.makeText(this, "Invalid Email Address", Toast.LENGTH_LONG).show()
            } else if (edt_password.text.toString() != edt_confirmPassword.text.toString()) {
                Toast.makeText(
                    this,
                    "Password and Confirm Password should match",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "Register Successful",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}