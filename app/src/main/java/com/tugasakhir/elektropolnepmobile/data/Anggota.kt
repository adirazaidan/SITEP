package com.tugasakhir.elektropolnepmobile.data

import com.tugasakhir.elektropolnepmobile.R

data class Anggota(
    val nama: String,
    val nim: String,
    val gambarResId: Int
)

object AnggotaData {
    val listAnggota = listOf(
        Anggota("NOVAL KRISNA", "3202216140", R.drawable.placeholder),
        Anggota("RIFKI OKTAVIANSYAH", "3202216147", R.drawable.placeholder),
        Anggota("AZKAL AZKIA MUHLISIN", "32020016046", R.drawable.placeholder),
        Anggota("RIFKI ARMANSYAH", "3202216109", R.drawable.placeholder),
        Anggota("MUHAMMAD FARIQ AKBAR", "3202216127 ", R.drawable.placeholder),
        // Tambahkan anggota lainnya di sini
    )
}
