package com.example.actpertemuan7

import android.app.Application
import com.example.actpertemuan7.dependenciesinjection.ContainerApp

class KrsApp : Application(){
    //Untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate(){
        super.onCreate()
        //Membuat Instance ContainerApp
        containerApp = ContainerApp(this)
        //Instance adalah object yang dibuat dari class
    }
}