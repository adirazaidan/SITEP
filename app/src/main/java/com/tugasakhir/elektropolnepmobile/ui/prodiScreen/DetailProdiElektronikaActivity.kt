package com.tugasakhir.elektropolnepmobile.ui.prodiScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tugasakhir.elektropolnepmobile.databinding.ActivityDetailProdiElektronikaBinding

class DetailProdiElektronikaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailProdiElektronikaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailProdiElektronikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "TEKNIK ELEKTRONIKA"
    }
}
