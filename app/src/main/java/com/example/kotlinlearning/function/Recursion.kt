package com.example.kotlinlearning.function

fun main (args:Array<String>){

    println(addition(15))
}

fun addition(number:Int): Int {

    if(number == 1){return number
    }else{

        return number+addition(number-1)
    }

}


