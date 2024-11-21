package com.example.elsol

import SolarAdapter
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.elsol.model.SolarProvider


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        //RecyclerView
        initRecyclerView()
    }


    //Método para inicializar el RecyclerView
    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) //Grid de 2 columnas
        recyclerView.adapter = SolarAdapter(SolarProvider.solarList)
    }

    // Método para crear el menú de opciones
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    // Método para manejar las acciones de los elementos del menú
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            (R.id.action_compararPlanetas) -> {
                val i = Intent(this, EstadisticasActivity::class.java)
                startActivity(i) ; return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}