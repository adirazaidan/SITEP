package com.tugasakhir.elektropolnepmobile.ui.fasilitasScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.data.FasilitasData
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailFasilitasElektronikaBinding

class DetailFasilitasElektronikaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailFasilitasElektronikaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailFasilitasElektronikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fasilitasAdapter = FasilitasAdapter(FasilitasData.listFasilitasElektronika)

        binding.rvFasilitas.apply {
            layoutManager = LinearLayoutManager(this@DetailFasilitasElektronikaActivity)
            adapter = fasilitasAdapter
        }

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "FASILITAS ELEKTRONIKA"

    }

}