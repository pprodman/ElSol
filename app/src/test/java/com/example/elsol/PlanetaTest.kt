package com.example.elsol

import com.example.elsol.model.Planeta
import org.junit.Test

import org.junit.Assert.*

class PlanetaTest {

    @Test
    fun `should create a user with correct values`() {
        val planeta = Planeta("Tierra", "1", "1", "5520")
        assertEquals("Tierra", planeta.nombre)
        assertEquals(1, planeta.diametro)
        assertEquals(1, planeta.distanciaAlSol)
    }
}