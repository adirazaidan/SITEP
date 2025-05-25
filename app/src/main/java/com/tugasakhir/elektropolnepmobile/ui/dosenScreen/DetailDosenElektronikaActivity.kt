package com.tugasakhir.elektropolnepmobile.ui.dosenScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.data.DosenData
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailDosenElektronikaBinding

class DetailDosenElektronikaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailDosenElektronikaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDosenElektronikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dosenAdapter = DosenAdapter(DosenData.listDosenElektronika)

        binding.rvDosen.apply {
            layoutManager = LinearLayoutManager(this@DetailDosenElektronikaActivity)
            adapter = dosenAdapter
        }

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "PROFIL DOSEN ELEKTRONIKA"
    }

}