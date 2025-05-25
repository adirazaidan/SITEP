package com.tugasakhir.elektropolnepmobile.ui.staffScreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tugasakhir.elektropolnepmobile.data.Staff
import com.tugasakhir.elektropolnepmobile.databinding.CardStaffBinding

class StaffAdapter(private val listStaff: List<Staff>) :
    RecyclerView.Adapter<StaffAdapter.StaffViewHolder>() {

    inner class StaffViewHolder(val binding: CardStaffBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StaffViewHolder {
        val binding = CardStaffBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StaffViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StaffViewHolder, position: Int) {
        val staff = listStaff[position]
        holder.binding.tvNamaStaff.text = staff.namaStaff
        holder.binding.tvKeteranganStaff.text = staff.keterangan
        holder.binding.ivGambarStaff.setImageResource(staff.gambarResId)
    }

    override fun getItemCount(): Int = listStaff.size
}