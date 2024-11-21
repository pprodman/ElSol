package com.example.elsol.adapter

import androidx.appcompat.widget.Toolbar
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.elsol.R
import com.example.elsol.model.Solar


class SolarViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val solar: ImageView = view.findViewById<ImageView>(R.id.solarViewItem)
    val toolbar: Toolbar = view.findViewById<Toolbar>(R.id.toolbarSolar)

    fun render(img: Solar) {
        solar.setImageResource(img.imagen)
        toolbar.title = img.nombre // Mostrar el nombre en la Toolbar
    }
}
