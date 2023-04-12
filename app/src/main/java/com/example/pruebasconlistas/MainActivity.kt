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
            println("Elementos en daysOfWeek: ${daysOfWeek.toString()}")
        }

        println(daysOfWeek.filter {it.contains('a')})

        val daysOfWeek2 : MutableList<String> = mutableListOf()

        for (elements in daysOfWeek.indices) {

            daysOfWeek2.add(daysOfWeek[elements])

        }
        println("Elementos en daysOfWeek2: ${daysOfWeek2.toString()}")


        val daysOfWeek3 = daysOfWeek.toSet()

        daysOfWeek.add(1,"Daniel")

        println("Elementos en daysOfWeek3: ${daysOfWeek3.toString()}")

        val numbersOfWeek : MutableList<Int> = mutableListOf(7,6,5,4,3,2,1,0)

        println("Elementos en numbersOfWeek: ${numbersOfWeek.toString()}")


        numbersOfWeek.add(8,8)

        println("Elementos en numbersOfWeek: ${numbersOfWeek.toString()}")
        println("Elementos ordenados en numbersOfWeek: ${numbersOfWeek.toSortedSet()}")

    }

    fun convertToSet(){




    }



}


