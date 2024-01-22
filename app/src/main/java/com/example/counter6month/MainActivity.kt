package com.example.counter6month

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.counter6month.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.tvCount.observe(this) { result ->
            binding.tvCount.text = result.toString()
        }

        with(binding) {
            btnDec.setOnClickListener {
                viewModel.dec()
            }
            btnInc.setOnClickListener {
                viewModel.inc()
            }
        }
    }
}