package com.example

import java.util.StringJoiner

//顶层变量：
//val PI = 3.14
//var x = 0
//fun increment() {
//    x += 1
//}
//
//fun main() {
//    println("x = $x ; PI = $PI")
//    increment()
//    println("increment()")
//    println("x = $x ; PI = $PI")
//}

/*//字符串模板
fun main() {
    var a = 1
//    模板中简单的名称
    val s1 = "num is $a"

    a = 2
    // 模版中的任意表达式
    val s2 = "${s1.replace("is", "was")},but now is $a"
    println(s2)

}*/

//条件表达式
/*fun maxOf(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}
fun main(){
    println("max of 0 and 42 is ${maxOf(0,42)}")
}*/

/*
fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun main(){
    println("max of 0 and 42 is ${maxOf(0,42)}")
}*/

/*
//空值与null检测
fun paresInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = paresInt(arg1)
    val y = paresInt(arg2)
//    直接使用`x * y`会导致编译错误，因为他们可能为空
    if (x != null && y != null) {
        // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
        println(x * y)
    } else {
        println("$arg1 or $arg2 is not a number")
    }
}

fun main() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("b", "你")

}
*/

// 类型检测与自动类型转换
/*fun getStringLength(obj: Any): Int? {
    return if (obj is String) {
        obj.length
    } else {
        null
    }
}

fun main() {
    fun printLength(obj: Any) {
//        ?: 如果前面一个值为空则返回后面一个
        println("$obj string length is ${getStringLength(obj) ?: ".. error,not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
    printLength("")
}*/


//for 循环
/*
fun main() {
    val items = listOf<String>("apple", "banana", "kiwifruit")
    println(items.indices)  //items 索引范围
    for (item in items) {
        println(item)
    }
}
*/

//while循环
/*fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}*/
















































