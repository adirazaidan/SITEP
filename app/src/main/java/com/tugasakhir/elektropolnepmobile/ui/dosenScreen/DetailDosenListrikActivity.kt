package com.tugasakhir.elektropolnepmobile.ui.dosenScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.data.DosenData
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailDosenListrikBinding

class DetailDosenListrikActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailDosenListrikBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDosenListrikBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dosenAdapter = DosenAdapter(DosenData.listDosenListrik)

        binding.rvDosen.apply {
            layoutManager = LinearLayoutManager(this@DetailDosenListrikActivity)
            adapter = dosenAdapter
        }

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "PROFIL DOSEN LISTRIK"
    }
}

