package com.example.elsol.model

// Clase PlanetaProvider que contiene una lista de objetos Planeta
class PlanetaProvider {
    companion object {
        val planetaList = listOf<Planeta>(
            Planeta("Mercurio", "0.382", "0.387", "5400"),
            Planeta("Venus", "0.949", "0.723", "5250"),
            Planeta("Tierra", "1", "1", "5520"),
            Planeta("Marte", "0.532", "1.542", "3960"),
            Planeta("Júpiter", "11.2", "5.203", "1350"),
            Planeta("Saturno", "9.41", "9.539", "700"),
            Planeta("Urano", "3.38", "19.81", "1200"),
            Planeta("Neptuno", "3.81", "30.07", "1500"),
            Planeta("Plutón", "???", "39.44", "5?")
        )
    }
}



