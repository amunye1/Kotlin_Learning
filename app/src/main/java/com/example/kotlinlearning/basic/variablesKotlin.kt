package com.example.kotlinlearning.basic


    fun main(){

        //val -> Immutable/Static, cannot change the value
        //var-> Mutable/Variable, can change the value
        val kotlin = ":)"
        var variableKotlin = "something"
        variableKotlin = "something new"

        println("kotlin")
        println(variableKotlin)



        val dataTypeInt: Int =12
        val dataTypeDouble: Double =10.2
        val dataTypeString: String = "This is the message"
        val dataTypeBoolean: Boolean = true;

        //Nullable variable / data types -> DataType
        //?.  ->safe call, only use it if not null
        //!!  ->Force call, developer takes responsibility
        // ?; ->Elvis operator, gives an option to use alternate value in case of null
        var dataTypeIntNull: Int? =null
        println(dataTypeIntNull)
    }


