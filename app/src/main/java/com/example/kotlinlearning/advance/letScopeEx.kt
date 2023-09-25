package com.example.kotlinlearning.advance



    class Car(make: String, model: String, year: Int) {
        var make: String = make
        var model: String = model
        var year: Int = year
    }





fun main(args:Array<String>){
    var honda = Car("Toyota", "Accord", 1996)


   honda.let {
        println("make ${it.make}")
        println("model ${it.model}")
        println("Year ${it.year}")
    }
}