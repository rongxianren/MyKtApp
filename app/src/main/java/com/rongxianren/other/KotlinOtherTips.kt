package com.rongxianren.other

class KotlinOtherTips {

    
}

fun main(args: Array<String>) {
    var b: String? = "abc"
    println(b)
    b = null // ok
    println(b)

    var item = "asdfasd"
    item?.let { println(it) }

    var d:String?=null
    val l = d?.length
    println(l)
}