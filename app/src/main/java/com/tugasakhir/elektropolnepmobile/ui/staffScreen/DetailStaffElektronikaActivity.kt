package com.tugasakhir.elektropolnepmobile.ui.staffScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.data.StaffData
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailStaffElektronikaBinding

class DetailStaffElektronikaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailStaffElektronikaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityDetailStaffElektronikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val staffAdapter = StaffAdapter(StaffData.listStaffElektronika)

        binding.rvStaff.apply {
            layoutManager = LinearLayoutManager(this@DetailStaffElektronikaActivity)
            adapter = staffAdapter
        }

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "PROFIL STAFF ELEKTRONIKA"

    }
}