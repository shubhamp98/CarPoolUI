package com.example.easycarpool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // change title bar details
        supportActionBar?.title = "Signup"
    }

    fun cancelSignup(view: View) {
        // intent: to go on another activty
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
    }
}
