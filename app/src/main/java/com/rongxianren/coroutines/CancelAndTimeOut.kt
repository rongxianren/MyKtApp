package com.rongxianren.coroutines

import kotlinx.coroutines.*

class CancelAndTimeOut {

}

fun main() = function2()


fun function1() = runBlocking {
    val job = launch {
        repeat(1000) { i ->
            println("job I'm sleeping $i")
            delay(500)
        }
    }

    delay(1500L)
    println("main: I'm tired of waiting")
    job.cancel()
    job.join()
    print("main : Now Iam can quit")
}

fun function2() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (isActive) { // 可以被取消的计算循环
            // 每秒打印消息两次
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }

    delay(1300L) // 等待一段时间
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // 取消该作业并等待它结束
//    job.cancel()
//    job.join()
    println("main: Now I can quit.")
}