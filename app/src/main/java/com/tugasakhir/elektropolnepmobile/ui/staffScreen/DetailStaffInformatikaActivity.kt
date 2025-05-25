package com.tugasakhir.elektropolnepmobile.ui.staffScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.data.StaffData
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailStaffInformatikaBinding

class DetailStaffInformatikaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailStaffInformatikaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailStaffInformatikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val staffAdapter = StaffAdapter(StaffData.listStaffInformatika)

        binding.rvStaff.apply {
            layoutManager = LinearLayoutManager(this@DetailStaffInformatikaActivity)
            adapter = staffAdapter
        }

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "PROFIL STAFF INFORMATIKA"

    }
}