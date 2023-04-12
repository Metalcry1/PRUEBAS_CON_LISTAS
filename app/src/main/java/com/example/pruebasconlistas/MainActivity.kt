package com.example.pruebasconlistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daysOfWeek  = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado", "Domingo")

        val daysOfWeek2 : MutableList<String> = mutableListOf()

     listillas(daysOfWeek  = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado", "Domingo"))
    // convertToSet(daysOfWeek2 = mutableListOf())

    }

    fun listillas (daysOfWeek: List<String>){



        daysOfWeek.add(0,"Daniel")

        daysOfWeek.forEach { println(it) }
        println(daysOfWeek.toString())

        if (daysOfWeek.isEmpty()){

            println("Esta vacio")


        }else{
            println("contiene: ${daysOfWeek.toString()}")
        }

        println(daysOfWeek.filter {it.contains('a')})
    }
/*
    fun convertToSet(daysOfWeek2: List<String>){



        for (elements in daysOfWeek.indices) {

            daysOfWeek2.add(daysOfWeek[elements])

        }
        println("Elementos en daysOfWeek2: ${daysOfWeek2.toString()}")


    }

*/

}


