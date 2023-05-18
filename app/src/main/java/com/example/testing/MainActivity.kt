package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testing.ktp.Adapter
import com.example.testing.ktp.Ktp

class MainActivity : AppCompatActivity() {

    // buat 3 variabel untuk recyclerview, adapter dan list
    private var recyclerView: RecyclerView? = null
    private var adapter: Adapter? = null
    private var listKtp = mutableListOf<Ktp>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // buat arraylist kosong
        listKtp = ArrayList()

        // panggil fungsi dataKtp di sini
        dataKtp()
    }

    private fun dataKtp() {
        // variabel recyclerview digunakan untuk menampung id recyclerview
        recyclerView = findViewById(R.id.id_recycleview)

        // adapter untuk menampung objek class Adpter
        adapter = Adapter(this@MainActivity, listKtp)

        // menetapkan adapter ke recyclerview atau menghubungkan adapter dengan recyclerview
        // jadi adapter akan mengatur tampilan item pada recyclerview
        recyclerView!!.adapter = adapter
        data()
    }

    private fun data() {

        // isi dantanya (data class bisa dirubah rubah)
        var ktp = Ktp("12345", "Angga", 17, R.drawable.mypicture)
        listKtp.add(ktp)
        ktp =  Ktp("54321", "Anggi", 20, R.drawable.mypicture)
        listKtp.add(ktp)
    }
}