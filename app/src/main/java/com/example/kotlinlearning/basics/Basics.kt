package com.example.kotlinlearning.basics

fun main(){
    //Variable
    //Var
    val age = 28
    //Val
    var myAge = 28
    //age=29
    myAge=29
    println(age)
    println(myAge)


    //Data types
    var dataTypString: String = "Jermaine"
    var dataTypeInt: Int = 9
    var dataTypeFloat: Float = 9.0f
    var dataTypeDouble: Double = 90.0
    var dataTypeBoolean: Boolean = true

    //String Interpolation – String Concatenation
    println("Hello, $dataTypString")

    //Nullability
    val dataTypeNull: Int? = null
    println(dataTypeNull)
}


