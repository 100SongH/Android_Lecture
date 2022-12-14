 package com.example.c95

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.c95.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener {
            when(binding.fab.isExtended) {
                true -> binding.fab.shrink()
                false -> binding.fab.extend()
            }
        }
    }
}