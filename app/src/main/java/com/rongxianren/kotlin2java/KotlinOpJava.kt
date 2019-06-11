package com.rongxianren.kotlin2java

class KotlinOpJava {
    fun demo(source: List<Int>) {
        val list = ArrayList<Int>()
        for (item in source) {
            list.add(item)
        }
    }
}

fun main(args: Array<String>) {
    val javaObj = JavaArrayExample()
    val array = intArrayOf(0, 1, 2, 3)
    javaObj.removeIndices(array)  // 将 int[] 传给方法

    val clazz = javaObj.javaClass
}