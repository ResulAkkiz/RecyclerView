package com.project.opp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.opp.databinding.ActivityMainBinding
import java.time.LocalDate
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adminList= ArrayList<Admin>()
        adminList.add(Admin("1","Admin1",1,R.drawable.admin ))
        adminList.add(Admin("2","Admin2",2,R.drawable.admin2 ))
        adminList.add(Admin("3","Admin3",3,R.drawable.admin3 ))
        adminList.add(Admin("4","Admin4",4,R.drawable.admin4 ))

        val adminAdapter=ViewAdapter(adminList)
        binding.recyclerView.adapter=adminAdapter
        binding.recyclerView.layoutManager=LinearLayoutManager(this)


    }
}