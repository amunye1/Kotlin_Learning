package com.example.kotlinlearning.advance

import android.provider.Settings.Global
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
*
* */

fun main() {

    GlobalScope.launch(Dispatchers.IO) {

        delay(1000L)

        println("Hi -> ")

        println("Buddy!")

        println("Global Current Thread is ${Thread.currentThread().name}")

    }

    //Thread ->  Main
    //Scope -> Global
    runBlocking {
        delay(1000L)

        println("Hi -> ")

        println("Buddy!")

        println("Blocking Current Thread is ${Thread.currentThread().name}")
    }

    println("Outside the Global scope thread")
    println("Outside Current Thread is ${Thread.currentThread().name}")


}