package com.tugasakhir.elektropolnepmobile.data

import com.tugasakhir.elektropolnepmobile.R

data class Staff(
    val namaStaff: String,
    val keterangan: String,
    val gambarResId: Int
)

object StaffData {
    val listStaffListrik = listOf(
        Staff("Windy Alvia Febrianty, A.Md A.K", "Administrasi Prodi Teknik Listrik", R.drawable.placeholder),
        Staff("Syarif Yusuf", "Teknisi Lab Prodi Listri", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
    )

    val listStaffElektronika = listOf(
        Staff("Siti Aisyah, A.Md", "Administrasi Prodi Teknik Elektronika", R.drawable.placeholder),
        Staff("Dr. Ari Wibowo, ST., MT", "Teknisi Bengkel Prodi Teknologi Rekayasa Sistem Elektronika", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
    )

    val listStaffInformatika = listOf(
        Staff("Sulihin", "Administrasi Jurusan", R.drawable.placeholder),
        Staff("Siti Sarah, S.M", "Administrasi Prodi Teknik Informatika", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
        Staff("Tidak Ada", "Tidak ada", R.drawable.placeholder),
    )
}
