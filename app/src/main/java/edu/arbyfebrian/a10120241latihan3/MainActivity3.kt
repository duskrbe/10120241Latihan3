package edu.arbyfebrian.a10120241latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

//Tanggal pengerjaan : 25-April-2023
//Nim : 10120241
//Nama : Arby Febrian Saputro
//Kelas : IF-6
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val etSatu = findViewById<EditText>(R.id.et_satu)
        val btnSelanjutnya = findViewById<Button>(R.id.bt_selanjutnya)

        btnSelanjutnya.setOnClickListener {
            val satu = etSatu.text.toString()

            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_SATU", satu)
                startActivity(it)
            }
        }
    }
}