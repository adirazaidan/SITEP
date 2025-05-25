package com.tugasakhir.elektropolnepmobile.ui.fasilitasScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.data.FasilitasData
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailFasilitasInformatikaBinding

class DetailFasilitasInformatikaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailFasilitasInformatikaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityDetailFasilitasInformatikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fasilitasAdapter = FasilitasAdapter(FasilitasData.listFasilitasInformatika)

        binding.rvFasilitas.apply {
            layoutManager = LinearLayoutManager(this@DetailFasilitasInformatikaActivity)
            adapter = fasilitasAdapter
        }

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "FASILITAS INFORMATIKA"

    }

}