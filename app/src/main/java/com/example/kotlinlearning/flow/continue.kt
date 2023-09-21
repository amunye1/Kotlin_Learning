package com.example.kotlinlearning.flow

fun main(){

    val language = arrayOf("Java", "Kotlin","Pascal", "PHP")

    for(items in language){

        if(items == "Pascal"){

            println("The code below was skipped because the language is Pascal")
            continue
        }
        println("${items} is the language")
    }

    for(n in 1..5 step 2){
        if(n in 2..4){
            println("The continue statement is running right now")
            continue
        }
        println("The continue statement did not run")
    }
}