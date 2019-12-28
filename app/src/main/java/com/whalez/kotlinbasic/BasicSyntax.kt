package com.whalez.kotlinbasic

fun main() {
//    println("Hello world!")
//
//    println(sum(2, 3))
//
//    println(simpleSum(2, 3))
//
//    printSum(2, 3)
//
//    /*
//     Variables
//    */
//    // val : assigned a value only once.
//    val a: Int = 1 // immediate assignment
//    val b = 2 // 'Int' type is inferred
//    val c: Int // Type required when no initializer is provided
//    c = 3 //  deferred assignment
//
//    // var : can be reassigned
//    var x = 5 // 'Int' type is inferred
//    x += 1
//
//    /*
//     String templates
//     */
//    var d = 1
//    val s1 = "d is $d"
//    println(s1)
//    print("1 is " + describe(1))

    collections()

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

/*
 when expression
 */
fun describe(obj: Any): String =
    when (obj) {
        1           -> "One"
        "Hello"     -> "Greeting"
        is Long     -> "Long"
        !is String  -> "Not a string"
        else        -> "Unknown"
    }

/*
 Ranges
 */
fun ranges(){

    // Check if a number is within a range using in operator
    val x = 10
    val y = 9
    if (x in 1..y+1){ // x가 1 에서 y+1 사이의 수인 경우,
        println("fits in range")
    }

    // Check if a number is out of range
    val list = listOf("a", "b", "c")
    if(-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
    if(list.size !in list.indices){
        println("list size is out of valid list indices range, too")
    }

    // Iterating over a range
    for(x in 1..5){
        print(x)
    }

    // Iterating over a range, having step
    for(x in 1..10 step 2){
        print(x)
    }
    println()
    for(x in 9 downTo 0 step 3){
        print(x)
    }

}

/*
 Collections
 */
fun collections(){
    // Iterating over a collection
    val items = listOf("A", "B", "C")
    for (item in items){
        println(item)
    }

    // Checking if a collection contains an object using in operator
    when{
        "A" in items -> println("aye")
        "B" in items -> println("bee")
    }

    // Using lambda expressions to filter and map collections
    val fruits = listOf("banana", "abocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}

/*
 Creating basic classes and their instances
 */
fun createClass(){
    val rectangle = Rectangle(5.0, 2.0)
    val triangle = Triangle(3.0, 4.0, 5.0)
}

class Rectangle(d: Double, d1: Double) {}
class Triangle(d: Double, d1: Double, d2: Double) {}




