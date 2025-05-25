package com.tugasakhir.elektropolnepmobile.ui.dosenScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.data.DosenData
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailDosenInformatikaBinding

class DetailDosenInformatikaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailDosenInformatikaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDosenInformatikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dosenAdapter = DosenAdapter(DosenData.listDosenInformatika)

        binding.rvDosen.apply {
            layoutManager = LinearLayoutManager(this@DetailDosenInformatikaActivity)
            adapter = dosenAdapter
        }

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "PROFIL DOSEN INFORMATIKA"
    }
}