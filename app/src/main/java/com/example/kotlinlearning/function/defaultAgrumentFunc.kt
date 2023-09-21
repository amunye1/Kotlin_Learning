package com.example.kotlinlearning.function

fun main(args:Array<String>){
displayBorder()

}

fun displayBorder(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}