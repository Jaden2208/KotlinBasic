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
    val s1 = "d is $d"
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

/*
 Conditional expressions
 */
fun maxOf(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}

fun simpleMaxOf(a: Int, b: Int) = if (a > b) a else b

/*
 Nullable values and null checks
  : A reference must be explicitly marked as nullable when null value
    is possible.
 */
fun parseInt(str: String): Int? {
    return null
}

/*
 Type checks and automatic casts
 */
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    else if(obj !is Int) {
        return null
    }
    return null
}

/*
 for loop
 */
fun forLoop1(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun forLoop2(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

/*
 while loop
 */
fun whileLoop(){
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
}