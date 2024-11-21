package com.example.elsol

import com.example.elsol.model.Planeta
import com.example.elsol.model.Solar
import org.junit.Test

import org.junit.Assert.*

class SolarTest {

    @Test
    fun `should create a user with correct values`() {
        val solar = Solar(R.drawable.corona_solar, "solar")
        assertEquals(R.drawable.corona_solar, solar.imagen)
        assertEquals("solar", solar.nombre)
    }
}
