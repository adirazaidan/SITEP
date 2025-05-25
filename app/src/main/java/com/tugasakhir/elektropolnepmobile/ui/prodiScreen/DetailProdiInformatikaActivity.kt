package com.tugasakhir.elektropolnepmobile.ui.prodiScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailProdiInformatikaBinding

class DetailProdiInformatikaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailProdiInformatikaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailProdiInformatikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "TEKNIK INFORMATIKA"

    }
}