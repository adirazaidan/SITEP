package com.tugasakhir.elektropolnepmobile.ui.homeScreen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.tugasakhir.elektropolnepmobile.databinding.FragmentHomeBinding
import com.tugasakhir.elektropolnepmobile.ui.SejarahScreen.SejarahActivity
import com.tugasakhir.elektropolnepmobile.ui.dosenScreen.MenuProfilDosenActivity
import com.tugasakhir.elektropolnepmobile.ui.fasilitasScreen.MenuFasilitasActivity
import com.tugasakhir.elektropolnepmobile.ui.prodiScreen.MenuProdiActivity
import com.tugasakhir.elektropolnepmobile.ui.staffScreen.MenuStaffActivity
import com.tugasakhir.elektropolnepmobile.ui.visiMisiScreen.VisiMisiActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Hubungkan Toolbar ke Activity sebagai ActionBar
        val toolbar: Toolbar = binding.appBar
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)

        // Set judul Toolbar
        toolbar.title = "BERANDA"

        // Tambahkan listener pada historyBtn
        binding.historyBtn.setOnClickListener {
            val intent = Intent(requireContext(), SejarahActivity::class.java)
            startActivity(intent)
        }

        binding.visiMisiBtn.setOnClickListener {
            val intent = Intent(requireContext(), VisiMisiActivity::class.java)
            startActivity(intent)
        }

        binding.prodiBtn.setOnClickListener {
            val intent = Intent(requireContext(), MenuProdiActivity::class.java)
            startActivity(intent)
        }

        binding.fasilitasBtn.setOnClickListener {
            val intent = Intent(requireContext(), MenuFasilitasActivity::class.java)
            startActivity(intent)
        }

        binding.dosenBtn.setOnClickListener {
            val intent = Intent(requireContext(), MenuProfilDosenActivity::class.java)
            startActivity(intent)
        }

        binding.staffBtn.setOnClickListener {
            val intent = Intent(requireContext(), MenuStaffActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
