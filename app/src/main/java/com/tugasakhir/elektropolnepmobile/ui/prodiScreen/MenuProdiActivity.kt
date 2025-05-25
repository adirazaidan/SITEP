package com.tugasakhir.elektropolnepmobile.ui.prodiScreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tugasakhir.elektropolnepmobile.databinding.ActivityMenuProdiBinding

class MenuProdiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuProdiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuProdiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        setupClickListeners()
    }

    private fun setupToolbar() {
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        binding.appBar.title = "PROGRAM STUDI"
    }

    private fun setupClickListeners() {
        binding.listrikBtn.setOnClickListener {
            val intent = Intent(this, DetailProdiListrikActivity::class.java)
            startActivity(intent)
        }

        binding.elektronikaBtn.setOnClickListener {
            val intent = Intent(this, DetailProdiElektronikaActivity::class.java)
            startActivity(intent)
        }

        binding.informatikaBtn.setOnClickListener {
            val intent = Intent(this, DetailProdiInformatikaActivity::class.java)
            startActivity(intent)
        }
    }
}
