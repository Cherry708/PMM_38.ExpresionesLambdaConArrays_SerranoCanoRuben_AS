package com.example.pmm_38expresioneslambdaconarrays_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_38expresioneslambdaconarrays_serranocanoruben_as.databinding.ActivityProblema2Propuesto1Binding

class Problema2Propuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2_propuesto1)

        val binding = ActivityProblema2Propuesto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaDouble = DoubleArray(10){(1..100).random().toDouble()}
        val cantidadMenor = listaDouble.count{it < 50}
        val cantidadMayor = listaDouble.count{it >= 50}

        var lista =""
        for (double in listaDouble)
            lista += " [$double]"

        binding.tvResultado.text = lista
            .plus("\n Mayores o iguales a 50: $cantidadMayor")
            .plus("\n Menores a 50: $cantidadMenor")
    }
}