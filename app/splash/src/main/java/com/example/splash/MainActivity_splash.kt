package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.inputmethod.InputBinding

class MainActivity_splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splash)
        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this,::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}
