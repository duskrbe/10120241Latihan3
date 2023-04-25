package edu.arbyfebrian.a10120241latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//Tanggal pengerjaan : 25-April-2023
//Nim : 10120241
//Nama : Arby Febrian Saputro
//Kelas : IF-6
class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        val beres = findViewById<TextView>(R.id.tv_beres)
        val satu = intent.getStringExtra("EXTRA_SATU")

        val beresIsi = "Beres! Sekarang $satu udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)"
         beres.text = beresIsi
    }
}