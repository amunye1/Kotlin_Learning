package com.example.kotlinlearning.basic
fun main(){

    sumOfTwo(2,50)
    printName()
    stringOfName("abdullahi")
    //another way to run a function in a string
    println("sum of 50 +2 is ${sumOfTwo(50,2)}")

}
//regular function
fun printName(){
    println("Hello My Name Is Abdullahi")
}
//function return the sum of two numbers
fun sumOfTwo(firstNum:Int, secondNum: Int): Int{

    return firstNum + secondNum
}
//Lambda function function taks a string and returns a int of the string length
val stringOfName: (String)-> Int={input -> input.length }

fun stringLength (s:String,map:(String) -> Int):Int{
    return map(s)
}