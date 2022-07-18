package com.example.cardviewinreclyverview.Adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cardviewinreclyverview.Perros
import com.example.cardviewinreclyverview.R
import com.example.cardviewinreclyverview.databinding.ItemPerrosBinding

class PerrosViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val b = ItemPerrosBinding.bind(view)
    fun render(PerrosModel: Perros){
        b.tvRaza.text = PerrosModel.raza
        b.tvNombre.text = PerrosModel.nombre
        b.tvEdad.text = PerrosModel.edad.toString().plus(   "   Años")
        b.tvEster.text =  if (PerrosModel.esterilizado) {
            "Si"
        } else {
            "No"
        }
        b.tvChip.text =  if (PerrosModel.chip) {
            "Si"
        } else {
            "No"
        }
        b.tvSexo.text = if (PerrosModel.sexo) {
            "Macho"
        } else {
            "Hembra"
        }
        Glide.with(b.ivPerro.context)
            .load(PerrosModel.foto)
            .error(R.drawable.perro)
            .into(b.ivPerro)
        b.ivPerro.setOnClickListener {
            Toast.makeText(b.ivPerro.context, PerrosModel.nombre, Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(b.ivPerro.context, PerrosModel.raza, Toast.LENGTH_SHORT).show()
        }
    }
}