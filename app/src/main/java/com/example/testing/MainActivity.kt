package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // aplikasi akan dibuat atau menginisialisasikan semua yang dibutuhkan
        // akan dijalankan jika user menghapus dari recent apps dan membuka kembali aplikasi
        Toast.makeText(this, "onCreate Berhasil Dijalankan", Toast.LENGTH_LONG).show()
        Log.i("onActivity", "onCreate dijalankan")
    }

    override fun onStart() {
        super.onStart()

        // aplikasi akan dijalankan kembali saat user membukanya
        Toast.makeText(this, "onStart Berhasil Dijalankan", Toast.LENGTH_LONG).show()
        Log.i("onActivity", "onStart dijalankan")
    }

    override fun onPause() {
        super.onPause()

        // aplikasi akan dijeda saat user menekan tombol minimize / recent apps
        Toast.makeText(this, "onPuase Berhasil Dijalankan", Toast.LENGTH_LONG).show()
        Log.i("onActivity", "onPause dijalankan")
    }

    override fun onStop() {
        super.onStop()

        // hampir sama dnegan onPuse tapi hal ini akan menghentikan semua aktifitas yang diakukan sebelumnya
        Toast.makeText(this, "onStop Berhasil Dijalankan", Toast.LENGTH_LONG).show()
        Log.i("onActivity", "onStop dijalankan")
    }
}