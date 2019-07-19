package com.example.easycarpool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // changing title of activity
        supportActionBar?.title = "Login"
    }

    // login function
    fun login(view: View) {

        // validating that use has entered in input
        if (loginEmailText.text.toString().isEmpty()) {
            loginEmailText.error = "Email Required!"
        }
        else if (loginPasswordText.text.toString().isEmpty()) {
            loginPasswordText.error = "Password Required!"
        }
        else {
            // intent: to go on another activty
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }

    // signup function to take user to sign up activity
    fun signup(view: View) {
        // intent: to go on another activty
        val intent = Intent(applicationContext, SignupActivity::class.java)
        startActivity(intent)
    }
}
