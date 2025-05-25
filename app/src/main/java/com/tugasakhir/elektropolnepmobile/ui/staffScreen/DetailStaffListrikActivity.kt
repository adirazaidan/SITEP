package com.tugasakhir.elektropolnepmobile.ui.staffScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.R
import com.tugasakhir.elektropolnepmobile.data.DosenData
import com.tugasakhir.elektropolnepmobile.data.StaffData
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailStaffListrikBinding

class DetailStaffListrikActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailStaffListrikBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailStaffListrikBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val staffAdapter = StaffAdapter(StaffData.listStaffListrik)

        binding.rvStaff.apply {
            layoutManager = LinearLayoutManager(this@DetailStaffListrikActivity)
            adapter = staffAdapter
        }

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "PROFIL STAFF LISTRIK"
    }
}
