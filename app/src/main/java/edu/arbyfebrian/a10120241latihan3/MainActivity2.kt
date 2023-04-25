package edu.arbyfebrian.a10120241latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//Tanggal pengerjaan : 25-April-2023
//Nim : 10120241
//Nama : Arby Febrian Saputro
//Kelas : IF-6

class MainActivity2 : AppCompatActivity() {


    lateinit var etIsi: EditText
    lateinit var btnMasuk : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        init()

        btnMasuk.setOnClickListener {
            if(etIsi.text.toString().isEmpty()){
                Toast.makeText(this,"Kode tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }
            else if (!etIsi.text.toString().equals("A1B2C3")){
                Toast.makeText(this,"Kode salah!", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, MainActivity3::class.java).also {
                startActivity(it)}
            }
        }

    }
    private fun init(){
        etIsi = findViewById(R.id.et_isi)
        btnMasuk = findViewById(R.id.bt_masuk)
    }
}