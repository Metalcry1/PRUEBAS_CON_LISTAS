package com.example.pruebasconlistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    listillas()

    }

    fun listillas (){


        val daysOfWeek  = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado", "Domingo")

        daysOfWeek.add(0,"Daniel")

        daysOfWeek.forEach { println(it) }
        println(daysOfWeek.toString())

        if (daysOfWeek.isEmpty()){

            println("Esta vacio")


        }else{
            println("contiene: ${daysOfWeek.toString()}")
        }

        println(daysOfWeek.filter {it.contains('a')})

        val daysOfWeek2 : MutableList<String> = mutableListOf()

        for (elements in daysOfWeek.indices) {

            daysOfWeek2.add(daysOfWeek[elements])

        }
        println("Elementos en daysOfWeek2: ${daysOfWeek2.toString()}")
    }

    fun convertToSet(){




    }



}


