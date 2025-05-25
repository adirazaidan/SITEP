package com.tugasakhir.elektropolnepmobile.ui.visiMisiScreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tugasakhir.elektropolnepmobile.databinding.ActivityVisiMisiBinding

private lateinit var binding: ActivityVisiMisiBinding

class VisiMisiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVisiMisiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Set judul Toolbar
        binding.appBar.title = "VISI DAN MISI TEKNIK ELEKTRO"
    }

}
