package com.rongxianren.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async { doSomeThingUsefulOne() }
        val two = async { doSomeThingUsefulTwo() }
        println("The answer is ${one.await() + two.await()}")
    }

    println("the complete time is $time ms")
}

suspend fun doSomeThingUsefulOne(): Int {
    delay(1000L)
    return 13
}

suspend fun doSomeThingUsefulTwo(): Int {
    delay(1000L)
    return 23
}