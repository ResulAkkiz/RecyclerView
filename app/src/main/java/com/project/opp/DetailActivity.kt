package com.project.opp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.opp.databinding.ActivityDetailBinding
import com.project.opp.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent= intent
        val selectedAdmin=intent.getSerializableExtra("admin") as Admin

        binding.nameText.text=selectedAdmin.name
        binding.ageText.text=selectedAdmin.age.toString()
        binding.imageView.setImageResource(selectedAdmin.image)


    }
}