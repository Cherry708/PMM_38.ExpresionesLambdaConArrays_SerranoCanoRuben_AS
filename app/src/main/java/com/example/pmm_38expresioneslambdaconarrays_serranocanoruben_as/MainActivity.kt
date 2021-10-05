package com.example.pmm_38expresioneslambdaconarrays_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_38expresioneslambdaconarrays_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaEnteros = IntArray(20){(0..10).random()}
        val lista0 = listaEnteros.count{it <= 5}
        val lista1 = listaEnteros.count{it <= 9}
        val lista2 = listaEnteros.count{it == 10}

        var enteros = ""
        for (integer in listaEnteros){
           enteros += " $integer"
        }

        binding.tvResultado0.text = enteros
        binding.tvResultado1.text = lista0.toString()
        binding.tvResultado2.text = lista1.toString()
        binding.tvResultado3.text = lista2.toString()
    }

}