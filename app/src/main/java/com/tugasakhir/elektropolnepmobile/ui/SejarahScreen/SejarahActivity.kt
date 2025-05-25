package com.tugasakhir.elektropolnepmobile.ui.SejarahScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tugasakhir.elektropolnepmobile.databinding.ActivitySejarahBinding

class SejarahActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySejarahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySejarahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "SEJARAH TEKNIK ELEKTRO"
    }
}
