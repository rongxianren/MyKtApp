package com.rongxianren.mykt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview.text = "this is kotlin TextView"
    }


}

fun main(args: Array<String>) {


    val a: Int = 1 // 一个装箱的 Int (java.lang.Integer)
    val b: Long = a.toLong() // 隐式转换产生一个装箱的 Long (java.lang.Long)
    print(b == a.toLong()) // 惊！这将输出“false”鉴于 Long 的 equals() 会检测另一个是否也为 Long


    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    println(text)
    val dontCreateMe: DontCreateMe = DontCreateMe()
    println(dontCreateMe.str)

    C().foo()
    var c = C()
    var d :C = c.copy()
    println(c==d)
}


open class C {
    var a: Int
        get() = 1
        set(value) {
            this.a = value
        }

    fun foo() {
        println("member")
    }

    fun copy() = C()
}


class D : C() {

}

fun C.foo(i: Int) {
    println("extension")
}

class DontCreateMe constructor() : Any() {
    val str = "iam is property of class DontCreateMe"

    init {
        println("DontCreateMe is called")
    }
}
