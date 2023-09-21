package com.example.kotlinlearning.basics

//Function
//Parameter – return type
//Named arguments

fun addTwoNums(num1:Int , num2:Int):Int{
    return num1 + num2
}
//Anonymous
val sum = {a: Int , b: Int -> a + b}

fun main(){
    println(addTwoNums(3,4))
}