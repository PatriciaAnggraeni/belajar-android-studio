package com.example.testing.ktp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.testing.MainActivity
import com.example.testing.R

class Adapter(
    private val mainActivity: MainActivity,
    private val  listKtp: List<Ktp>
) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    // method ini digunakan untuk membuat view holder yang mana akan digunakan untuk menampung tampilan item
    // dari recyclerview
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ktp_layout, parent, false)
        return ViewHolder(view)
    }

    // fungsi method ini akan mengambil data dari sumber (data class) dan  ditampilkan / ditaruh sesuai dengan
    // posisi elemen / posisi tertentu yang diambil idnya
    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {

        // set tulisan dari id yang diperoleh sebelumnya dengan nilai yang sesuai dengan index
        // karena ini diambil dari objek (data class) maka ambil juga property yang digunakan
        // disini variabel holder turunan dari ViewHolder, yang mana merupakan inner class dari Adapter
        holder.nama.text = listKtp[position].nama
        holder.nik.text = listKtp[position].nik
        holder.age.text = listKtp[position].umur.toString()
        holder.image.setImageResource(listKtp[position].gambar)

        // nemabahkan onclick listener, toast akan muncul dengan nama sesuai dengan yang ditekan
        val showToast = "Data milik" + listKtp[position].nama
        holder.cardview.setOnClickListener {
            Toast.makeText(mainActivity, showToast, Toast.LENGTH_LONG).show()
        }
    }

    // gunanya buat mengambil nilai dari list di property constructor
    override fun getItemCount() = listKtp.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        // buat variabel untuk menampung id yang dibutuhkan
        // variabel ini akan dipakai di method onBindViewHolder
        val nama: TextView = view.findViewById(R.id.id_name)
        val nik: TextView = view.findViewById(R.id.id_nik)
        val age: TextView = view.findViewById(R.id.id_umur)
        val image: ImageView = view.findViewById(R.id.id_image)
        val cardview: CardView = view.findViewById(R.id.id_cardview)

    }
}