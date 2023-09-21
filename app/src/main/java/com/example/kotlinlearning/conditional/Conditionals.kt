package com.example.kotlinlearning.conditional

fun main(args : Array<String>){
    var inputString = readln()
    if (inputString.length < 3){
        println("this is a short length")
    }else if (inputString.length in 4..8){
        println("this is a medium string")
    }else{
        println("Congratulations you're able to make some decisions alone")
    }

    //when
    print("Enter number of the Month: ")
    var monthOfYear  = readLine()!!.toInt()
    var month= when(monthOfYear) {
            1->"January"
            2->"February"
            3->"March"
            4->"April"
            5->"May"
            6->"June"
            7->"July"
            8->"August"
            9->"September"
            10->"October"
            11->"November"
            12->"December"
            else-> "Not a month of year"
        }
    print(month)

}