package com.example.elsol.model

import com.example.elsol.R

// Clase SolarProvider que contiene una lista de objetos Solar
class SolarProvider {
    companion object {
        val solarList = listOf<Solar>(
            Solar(R.drawable.corona_solar, "corona solar"),
            Solar(R.drawable.erupcionsolar, "erupción solar"),
            Solar(R.drawable.espiculas, "espículas"),
            Solar(R.drawable.filamentos, "filamentos"),
            Solar(R.drawable.magnetosfera, "magnetosfera"),
            Solar(R.drawable.manchasolar, "manchas solares")
        )
    }
}