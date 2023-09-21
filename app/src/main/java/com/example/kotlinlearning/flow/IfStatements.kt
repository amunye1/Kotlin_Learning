package com.example.kotlinlearning.flow

import java.util.Scanner

fun main(){
    val negativeNumber = -100

    if(negativeNumber <0 ){
        println("This number is a negative")
    }else if(negativeNumber > 0){
        println("This number is a positive")
    }

    val numberResult = if(negativeNumber <0){
        println("This is a negative number")
    }else{
        println("This is a positive number")
    }

    println(numberResult)
    val name = "abdullahi"
    val result = if(name.length > 11){
        println("This name is more than 11 character long")
    }else{
        println("${name} is ${name.length} character long ")
    }

    println(result)

    var num1:Int?= 0
    val input = Scanner(System.`in`)
    println("Please enter a number that can be tested")
    num1 = input.nextInt()
    val switch  = when(num1){
        1 -> num1.plus(1)
        2 -> num1.plus(2)
        3 -> num1.plus(3)
        else -> "the number ${num1} is not able to be added please try a lower number"

    }

    println(switch)

    println("please enter a number for the month you like")

    val month = input.nextInt();
    when(month){
        1 -> println("January")
        2 -> println("Feburary ")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else-> println("The number you enter is not a month please enter a month")
    }

    val a =1

    when(a){
        1,2,3 -> println("n is a positive integer")

        -1,-2,-3 -> println("n is a negative integer")

        else -> println("Number not valid enter a lower number like 1 or 2 or a negative number lik -1 or -2")
    }

    val b = 0


    when(b){
        in 1..10 -> println("this is between 1 and 10")
        in 10 .. 100 -> println("this is between 10 and 100")
        else -> println("The number is not with the range")
    }
}