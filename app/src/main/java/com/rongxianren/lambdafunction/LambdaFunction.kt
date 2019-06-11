package com.rongxianren.lambdafunction

class LambdaFunction {

}

fun main(args: Array<String>) {
    val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
    val twoParameters: (String, Int) -> String = repeatFun // OK

    fun runTransformation(f: (String, Int) -> String): String {
        return f("hello", 3)
    }

    val result = runTransformation(repeatFun) // OK

    val result2 = runTransformation(twoParameters)

    val result3 = twoParameters("hello", 3)

    println("result1 = $result")

    println("result2 = $result2")

    println("result3 = $result3")


    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // 类扩展调用

    val sum1: (Int, Int) -> Int = { x, y -> x + y }
    val sum2 = { x: Int, y: Int -> x + y }

    run { println("...") }

    fun test(a: Int, b: (num1: Int, num2: Int) -> Int): Int {
        return a + b.invoke(3, 5)
    }

    var sum: Int = test(10, { a: Int, b: Int -> a + b })
    println("this result of sum is $sum")
}