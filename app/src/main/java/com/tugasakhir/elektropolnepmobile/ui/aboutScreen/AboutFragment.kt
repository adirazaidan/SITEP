package com.tugasakhir.elektropolnepmobile.ui.aboutScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugasakhir.elektropolnepmobile.databinding.FragmentAboutBinding // Tambahkan binding
import com.tugasakhir.elektropolnepmobile.data.AnggotaData

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Tombol kembali
        binding.appBar.setNavigationOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }

        binding.appBar.title = "TENTANG KAMI"

        val anggotaAdapter = AnggotaAdapter(AnggotaData.listAnggota)

        binding.rvAnggota.apply {
            layoutManager = LinearLayoutManager(requireContext()) // atau GridLayoutManager jika perlu
            adapter = anggotaAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
