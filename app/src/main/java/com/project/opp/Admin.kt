package com.project.opp

import java.io.Serializable
import java.time.LocalDate


class Admin(
    override var id: String,
    override var name: String,
    override var age: Int,

    override var image: Int
) : User, Serializable {
    fun userBanTest(userId:String){
        super.banUser(userId)
    }
    override fun banUser(userId:String){
        println("$userId banned from Admin...")
    }
}