package com.example

/**
 * Unit为无返回值
 */
fun printMessage(message: String): Unit {
    println(message)
}

/**
 * 没有返回值（Unit）可以省略
 */
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

/**
 * 返回一个整数类型
 */
fun sum(x: Int, y: Int): Int {
    return x + y
}

/**
 * 返回整数（推断）的单表达式函数。
 */
fun multiply(x: Int, y: Int) = x * y

/**
 * ag
 */
fun main() {
/*    printMessage("Hello")
    printMessageWithPrefix("Hello","Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")  //使用命名参数改变顺序
    println(sum(1,2))
    println(multiply(4,2))*/


    infix fun Int.times(str: String) = str.repeat(this)    //必须以infix修饰 它们必须有一个参数 该参数不得接受可变数量的参数，并且不得具有默认值。
    println(2 times "bye ")

    val pair = "Ferrari" to "Katrina" to "Jack"  //使用内置函数创建一个pair(相当于java map)
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)  //to的简单实现
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia  //固定符号也适用于成员函数（方法）。


}

class Person(val name: String){
    private val  likedPeople= mutableListOf<Person>()
    infix fun likes(other:Person){likedPeople.add(other)}
}

