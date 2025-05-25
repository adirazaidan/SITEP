package com.tugasakhir.elektropolnepmobile.ui.staffScreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tugasakhir.elektropolnepmobile.R
import com.tugasakhir.elektropolnepmobile.databinding.ActivityMenuStaffBinding
import com.tugasakhir.elektropolnepmobile.ui.prodiScreen.DetailProdiElektronikaActivity
import com.tugasakhir.elektropolnepmobile.ui.prodiScreen.DetailProdiInformatikaActivity
import com.tugasakhir.elektropolnepmobile.ui.prodiScreen.DetailProdiListrikActivity

class MenuStaffActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuStaffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuStaffBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        setupClickListeners()
    }

    private fun setupToolbar() {
        binding.appBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        binding.appBar.title = "PROFIL STAFF"
    }

    private fun setupClickListeners() {
        binding.listrikBtn.setOnClickListener {
            val intent = Intent(this, DetailStaffListrikActivity::class.java)
            startActivity(intent)
        }

        binding.elektronikaBtn.setOnClickListener {
            val intent = Intent(this, DetailStaffElektronikaActivity::class.java)
            startActivity(intent)
        }

        binding.informatikaBtn.setOnClickListener {
            val intent = Intent(this, DetailStaffInformatikaActivity::class.java)
            startActivity(intent)
        }
    }
}
