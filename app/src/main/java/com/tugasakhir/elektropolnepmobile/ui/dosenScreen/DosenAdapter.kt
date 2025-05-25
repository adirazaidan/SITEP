package com.tugasakhir.elektropolnepmobile.ui.dosenScreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tugasakhir.elektropolnepmobile.data.Dosen
import com.tugasakhir.elektropolnepmobile.databinding.CardDosenBinding

class DosenAdapter(private val listDosen: List<Dosen>) :
    RecyclerView.Adapter<DosenAdapter.DosenViewHolder>() {

    inner class DosenViewHolder(val binding: CardDosenBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DosenViewHolder {
        val binding = CardDosenBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DosenViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DosenViewHolder, position: Int) {
        val dosen = listDosen[position]
        holder.binding.tvNamaDosen.text = dosen.nama
        holder.binding.tvNipDosen.text = dosen.nip
        holder.binding.ivGambarDosen.setImageResource(dosen.gambarResId)
    }

    override fun getItemCount(): Int = listDosen.size
}



