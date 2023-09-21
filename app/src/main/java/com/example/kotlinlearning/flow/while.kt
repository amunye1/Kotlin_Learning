package com.example.kotlinlearning.flow

import java.util.Scanner

fun main(){
    var i=0
    while(i <10 ){

        if(i<10){
        println("You are awesome "+ i )
        i++}
         if(i==10)println("cool it")
    }
////////////////////


    do{
        println("enter a name to be printed out until you type quit or q")
        var name= readLine()
        println("The name you have entered is ${name}")
    }while(!(name == "quit" || name =="q") )

}

