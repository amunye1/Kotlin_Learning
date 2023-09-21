package com.example.kotlinlearning.flow

fun main (args: Array<String>){
    //print 1 through 3
    for (i in 1..3)
        println(i)
    //This syntax does not work
    //I want it to count down from 5 to 1
    for (i in 5..1) print(i)

    //prints 5 through 1 going down from 5
    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) println(i)

    println("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) println(i)

    val language = arrayOf("Ruby", "Java", "Python", "Kotlin", "PHP")
    //prints out all the languages in my language array
    for(i in language){
        println(i)
    }
    //prints out the element only if the remainder of the index is 0
    for(items in language.indices){
        if(items%2==0){
            println(items)
        }
    }

}