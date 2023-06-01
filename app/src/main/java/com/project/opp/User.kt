package com.project.opp

import java.time.LocalDate
import java.util.Date

interface User {
    val id:String
    val name:String
    val age:Int

    val image:Int
    fun banUser(userId:String){
        println("$userId banned...")
    }
}