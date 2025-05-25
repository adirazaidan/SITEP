package com.tugasakhir.elektropolnepmobile.data

import com.tugasakhir.elektropolnepmobile.R

data class Dosen(
    val nama: String,
    val nip: String,
    val gambarResId: Int
)

object DosenData {
    val listDosenListrik = listOf(
        Dosen("Ramli, ST., MT", "196201261989031003", R.drawable.placeholder),
        Dosen("Achmad Marzuki R., ST., MT", "196405201989031004", R.drawable.placeholder),
        Dosen("Ir. Taufik Muzakkir, MT", "196204301990111001", R.drawable.placeholder),
    )

    val listDosenElektronika = listOf(
        Dosen("Dr. Budi Santoso, ST., MT", "197305152000121001", R.drawable.placeholder),
        Dosen("Dr. Ari Wibowo, ST., MT", "197510182001122002", R.drawable.placeholder),
    )

    val listDosenInformatika = listOf(
        Dosen("Prof. Dr. Indra, ST., MT", "196801101992031002", R.drawable.placeholder),
        Dosen("Dr. Siti Aminah, ST., MT", "197204202000121003", R.drawable.placeholder),
    )
}
