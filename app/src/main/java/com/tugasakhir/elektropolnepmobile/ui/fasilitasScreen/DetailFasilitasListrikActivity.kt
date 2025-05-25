package com.tugasakhir.elektropolnepmobile.ui.fasilitasScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.data.FasilitasData
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailFasilitasListrikBinding

class DetailFasilitasListrikActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailFasilitasListrikBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityDetailFasilitasListrikBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fasilitasAdapter = FasilitasAdapter(FasilitasData.listFasilitasListrik)

        binding.rvFasilitas.apply {
            layoutManager = LinearLayoutManager(this@DetailFasilitasListrikActivity)
            adapter = fasilitasAdapter
        }

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "FASILITAS LISTRIK"

    }
}