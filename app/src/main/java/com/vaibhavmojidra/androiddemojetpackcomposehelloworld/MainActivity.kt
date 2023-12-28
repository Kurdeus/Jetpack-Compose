package com.vaibhavmojidra.androiddemojetpackcomposehelloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.vaibhavmojidra.androiddemojetpackcomposehelloworld.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}

