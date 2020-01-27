package com.rongxianren.method

fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postFix: String): String {
    println();
    return separator;
}

fun main(args: Array<String>): Unit {
    var collection = listOf(1, 2, 3, 4);

    joinToString(collection, separator = ".", prefix = "(", postFix = ")");
    "asfdasd".lastChar()
}

fun String.lastChar(): Char = get(length - 1)

class MethodClass {
    fun String.lastChar(): Char = get(length - 1)
}