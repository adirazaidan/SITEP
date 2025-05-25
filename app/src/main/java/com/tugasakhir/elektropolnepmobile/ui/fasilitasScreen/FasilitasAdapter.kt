package com.tugasakhir.elektropolnepmobile.ui.fasilitasScreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tugasakhir.elektropolnepmobile.data.Fasilitas
import com.tugasakhir.elektropolnepmobile.databinding.CardFasilitasBinding

class FasilitasAdapter(private val listFasilitas: List<Fasilitas>) :
    RecyclerView.Adapter<FasilitasAdapter.FasilitasViewHolder>() {

    inner class FasilitasViewHolder(val binding: CardFasilitasBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FasilitasViewHolder {
        val binding = CardFasilitasBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FasilitasViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FasilitasViewHolder, position: Int) {
        val fasilitas = listFasilitas[position]
        holder.binding.tvNamaFasilitas.text = fasilitas.namaFasilitas
        holder.binding.ivGambarFasilitas.setImageResource(fasilitas.gambarResId)
    }

    override fun getItemCount(): Int = listFasilitas.size
}