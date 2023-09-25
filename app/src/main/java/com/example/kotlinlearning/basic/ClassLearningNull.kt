package com.example.kotlinlearning.basic

import java.util.Locale

open class User() {
    private var name: String? = null
    private var age: Int? = null

    fun setName(newName: String?) {
        name = newName ?: "NA"
    }

    fun getName(): String? {
        return name
    }

    fun setAge(newAge: Int?) {
        age = newAge ?: 0
    }

    fun getAge(): Int? {
        return age
    }
}

class Student: User() {

    // all the attributes and functionalities from parent
}

//Extension function -> ability to add functionality in an existing class without having to inherit it.
fun User.capitalize(name:String): String {
    //this will not change actual class code
    return name.capitalize(Locale.ROOT)
}


fun main() {
//    val user = new User();
    val user = User()
    val student = Student()
    student.setName("Peter")

    // update user from API


    var name: String? = null
    user.setName("Abdullahi")
    user.capitalize(user.getName() ?: "NA")

    user.getName()?.let {value ->
        name = value
    }

    println(name)


}
















