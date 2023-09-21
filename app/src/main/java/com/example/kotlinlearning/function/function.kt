package com.example.kotlinlearning.function

fun main(args: Array<String>){
    regularFunction()
    var result = addString("Awesome", "Developer")
    println(result)
}

fun regularFunction(){
    println("I am a regular function")
    println("I am able to be called easily")
}

fun addString(string1:String, string2:String):String{
    println("Simply adding two string together")
    return string1 + " " + string2
}