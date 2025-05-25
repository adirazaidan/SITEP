package com.tugasakhir.elektropolnepmobile.ui.aboutScreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tugasakhir.elektropolnepmobile.data.Anggota
import com.tugasakhir.elektropolnepmobile.databinding.CardAnggotaBinding

class AnggotaAdapter(private val listAnggota: List<Anggota>) :
    RecyclerView.Adapter<AnggotaAdapter.AnggotaViewHolder>() {

    inner class AnggotaViewHolder(val binding: CardAnggotaBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnggotaViewHolder {
        val binding = CardAnggotaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnggotaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnggotaViewHolder, position: Int) {
        val anggota = listAnggota[position]
        holder.binding.tvNamaAnggota.text = anggota.nama
        holder.binding.tvNimAnggota.text = anggota.nim
        holder.binding.ivGambarAnggota.setImageResource(anggota.gambarResId)
    }

    override fun getItemCount(): Int = listAnggota.size
}
