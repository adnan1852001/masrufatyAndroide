package com.example.masrufaty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.masrufaty.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val veiw=binding.root
        setContentView(veiw)


    }
}