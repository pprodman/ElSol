package com.example.elsol

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.elsol.model.PlanetaProvider

class EstadisticasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)

        // Configurar AutoCompleteTextViews y TextViews
        val autoComplete1 = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView1)
        val autoComplete2 = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView2)
        val tvDiametro1 = findViewById<TextView>(R.id.tvDiametro1)
        val tvDiametro2 = findViewById<TextView>(R.id.tvDiametro2)
        val tvDistancia1 = findViewById<TextView>(R.id.tvDistancia1)
        val tvDistancia2 = findViewById<TextView>(R.id.tvDistancia2)
        val tvDensidad1 = findViewById<TextView>(R.id.tvDensidad1)
        val tvDensidad2 = findViewById<TextView>(R.id.tvDensidad2)

        // Obtener lista de planetas
        val planetas = PlanetaProvider.planetaList

        // Crear lista de nombres de planetas
        val nombresPlanetas = planetas.map { it.nombre }

        // Crear adaptador para el AutoCompleteTextView
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, nombresPlanetas)

        // Configurar adaptadores para los AutoCompleteTextView
        autoComplete1.setAdapter(adapter)
        autoComplete2.setAdapter(adapter)

        // Asignar lógica al primer selector
        autoComplete1.setOnItemClickListener { _, _, _, _ ->
            val nombreSeleccionado = autoComplete1.text.toString()
            val planeta = planetas.find { it.nombre == nombreSeleccionado }
            if (planeta != null) {
                tvDiametro1.text = planeta.diametro
                tvDistancia1.text = planeta.distanciaAlSol
                tvDensidad1.text = planeta.densidad
            }
        }

        // Asignar lógica al segundo selector
        autoComplete2.setOnItemClickListener { _, _, _, _ ->
            val nombreSeleccionado = autoComplete2.text.toString()
            val planeta = planetas.find { it.nombre == nombreSeleccionado }
            if (planeta != null) {
                tvDiametro2.text = planeta.diametro
                tvDistancia2.text = planeta.distanciaAlSol
                tvDensidad2.text = planeta.densidad
            }
        }
    }
}
