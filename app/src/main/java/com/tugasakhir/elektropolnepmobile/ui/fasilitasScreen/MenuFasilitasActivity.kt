package com.tugasakhir.elektropolnepmobile.ui.fasilitasScreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tugasakhir.elektropolnepmobile.databinding.ActivityMenuFasilitasBinding
import com.tugasakhir.elektropolnepmobile.ui.dosenScreen.DetailDosenElektronikaActivity
import com.tugasakhir.elektropolnepmobile.ui.dosenScreen.DetailDosenInformatikaActivity
import com.tugasakhir.elektropolnepmobile.ui.dosenScreen.DetailDosenListrikActivity

class MenuFasilitasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuFasilitasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuFasilitasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        setupClickListeners()
    }

    private fun setupToolbar() {
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        binding.appBar.title = "FASILITAS"
    }

    private fun setupClickListeners() {
        binding.listrikBtn.setOnClickListener {
            val intent = Intent(this, DetailFasilitasListrikActivity::class.java)
            startActivity(intent)
        }

        binding.elektronikaBtn.setOnClickListener {
            val intent = Intent(this, DetailFasilitasElektronikaActivity::class.java)
            startActivity(intent)
        }

        binding.informatikaBtn.setOnClickListener {
            val intent = Intent(this, DetailFasilitasInformatikaActivity::class.java)
            startActivity(intent)
        }
    }
}