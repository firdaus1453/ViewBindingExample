package com.example.viewbindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_find_my_age.*
import java.util.*

class FindMyAgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_my_age)

        val edtTahunLahirKtx = edtTahunLahir
        val txtUmurKtx = txtUmur
        val btnHitungKtx = btnHitung

        btnHitungKtx.setOnClickListener {
            val tahunLahir = edtTahunLahirKtx.text.toString().toIntOrNull()

            if (tahunLahir != null) {    // Apabila tahunLahir ada isinya maka jalankan perintah dibawah ini
                val age = Calendar.getInstance().get(Calendar.YEAR) - tahunLahir
                txtUmurKtx.text = age.toString()
            } else { // Apabila year tidak ada isinya
                edtTahunLahirKtx.error = "Masukkan tahun lahir"
            }
        }
    }
}
