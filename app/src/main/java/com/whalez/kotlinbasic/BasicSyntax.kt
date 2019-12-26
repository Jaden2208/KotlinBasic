package com.whalez.kotlinbasic

fun main() {
    println("Hello world!")

    println(sum(2, 3))

    println(simpleSum(2, 3))

    printSum(2, 3)

    /*
     Variables
    */
    // val : assigned a value only once.
    val a: Int = 1 // immediate assignment
    val b = 2 // 'Int' type is inferred
    val c: Int // Type required when no initializer is provided
    c = 3 //  deferred assignment

    // var : can be reassigned
    var x = 5 // 'Int' type is inferred
    x += 1

    /*
     String templates
     */
    var d = 1
    val s1 = "d is %d"
    println(s1)
}

/*
 Functions
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun simpleSum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit { // Unit: java에서 void 타입을 의미, 생략 가능
    println("sum of $a and $b is ${a + b}")
}

