package edu.arbyfebrian.a10120241latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//Tanggal pengerjaan : 25-April-2023
//Nim : 10120241
//Nama : Arby Febrian Saputro
//Kelas : IF-6

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMulai = findViewById<Button>(R.id.bt_mulai)

        btnMulai.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }


    }
}