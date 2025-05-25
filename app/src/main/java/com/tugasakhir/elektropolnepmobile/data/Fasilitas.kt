package com.tugasakhir.elektropolnepmobile.data

import com.tugasakhir.elektropolnepmobile.R

data class Fasilitas(
    val namaFasilitas: String,
    val gambarResId: Int,
)

object FasilitasData {
    val listFasilitasListrik = listOf(
        Fasilitas("Bengkel Listrik", R.drawable.bengkel_listrik1),
        Fasilitas("Kelas Listrik", R.drawable.placeholder),
        Fasilitas("Kelas Listrik", R.drawable.placeholder),
        Fasilitas("Kelas Listrik", R.drawable.placeholder),
    )

    val listFasilitasElektronika = listOf(
        Fasilitas("Workshop Elektronika", R.drawable.placeholder),
        Fasilitas("Workshop Elektronika", R.drawable.placeholder),
        Fasilitas("Workshop Elektronika", R.drawable.placeholder),
    )

    val listFasilitasInformatika = listOf(
        Fasilitas("Laboratorium Informatika", R.drawable.lab_informatika1),
        Fasilitas("Kelas Informatika", R.drawable.kelas_informatika1),

    )
}
