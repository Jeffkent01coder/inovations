package com.example.inovations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.inovations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding get() = _binding!!
    private var _binding:ActivityMainBinding? = null
    private val personAdapter = Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerview.apply{
            adapter = personAdapter
        }
    }
}