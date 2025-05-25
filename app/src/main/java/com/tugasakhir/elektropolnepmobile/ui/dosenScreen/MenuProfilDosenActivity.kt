package com.tugasakhir.elektropolnepmobile.ui.dosenScreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tugasakhir.elektropolnepmobile.databinding.ActivityMenuProfilDosenBinding

class MenuProfilDosenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuProfilDosenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuProfilDosenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        setupClickListeners()

    }
    private fun setupToolbar() {
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        binding.appBar.title = "PROFIL DOSEN"
    }

    private fun setupClickListeners() {
        binding.listrikBtn.setOnClickListener {
            val intent = Intent(this, DetailDosenListrikActivity::class.java)
            startActivity(intent)
        }

        binding.elektronikaBtn.setOnClickListener {
            val intent = Intent(this, DetailDosenElektronikaActivity::class.java)
            startActivity(intent)
        }

        binding.informatikaBtn.setOnClickListener {
            val intent = Intent(this, DetailDosenInformatikaActivity::class.java)
            startActivity(intent)
        }
    }

}