package com.nerostarx.milkystore.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nerostarx.milkystore.R
import com.nerostarx.milkystore.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MilkyStore)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}