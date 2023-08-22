package com.example.startup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.startup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val text = binding.nama.text
        binding.signupButton.setOnClickListener { view ->
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
        setContentView(binding.root)
    }
}