package com.example.pakzulka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pakzulka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // lateinit : telat memberikan nilai , jadi binding nya itu bisa dipanggil di fun baru juga
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)

        binding = ActivityMainBinding.inflate(layoutInflater)


        binding.btnPlus.setOnClickListener(){
            tambah()
        }
        binding.btnMin.setOnClickListener(){
            kurang()
        }
        binding.btnKali.setOnClickListener(){
            kali()
        }
        binding.btnBagi.setOnClickListener(){
            bagi()
        }
        binding.btnClr.setOnClickListener(){
            clear()
        }
        setContentView(binding.root)
    }
    private fun clear(){
        binding.etPertama.text.clear()
        binding.etKedua.text.clear()
        binding.btnHasil.text="Hasil"
    }
    private fun tambah()
    {
        var angka1 = binding.etPertama.text.toString().toInt()
        var angka2 = binding.etKedua.text.toString().toInt()
        var angka3 = angka1+angka2
        var hasil = "$angka1 + $angka2 = $angka3"
        binding.btnHasil.text = hasil.toString()
    }
    private fun kurang()
    {
        var angka1 = binding.etPertama.text.toString().toInt()
        var angka2 = binding.etKedua.text.toString().toInt()
        var angka3 = angka1-angka2
        var hasil1 = "$angka1 - $angka2 = $angka3"
        binding.btnHasil.text = hasil1.toString()
    }
    private fun kali()
    {
        var angka1 = binding.etPertama.text.toString().toInt()
        var angka2 = binding.etKedua.text.toString().toInt()
        var angka3 = angka1*angka2
        var hasil2 = "$angka1 * $angka2 = $angka3"
        binding.btnHasil.text = hasil2.toString()
    }
    private fun bagi()
    {
        var angka1 = binding.etPertama.text.toString().toInt()
        var angka2 = binding.etKedua.text.toString().toInt()
        var angka3 = angka1/angka2
        var hasil3 = "$angka1 / $angka2 = $angka3"
        binding.btnHasil.text = hasil3.toString()
    }

}