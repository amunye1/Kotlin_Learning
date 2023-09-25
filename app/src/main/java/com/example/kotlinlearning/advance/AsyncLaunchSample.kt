package com.example.kotlinlearning.advance

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    /*
    Launch -> synchronous, execute one by one, it will wait for first task to finish before moving to the next one
    Async -> asynchronous, execute all at once/parallel, keep executing tasks without worrying of completion, to track the progress it comes with default function of AWAIT() and AWAITALL()
    */

    runBlocking {

        val job1 = GlobalScope.launch { //linear execution
            delay(2000L)
            println("BUDDY!")
        }

        val job2 = GlobalScope.async {// parallel execution
            delay(1000L)
            println("Hi ")
        }.await()

        val job3 = runBlocking {
            delay(3000L)
            println("BLOCKED!")
        }

        println("Hello Outside. . .")
    }
}