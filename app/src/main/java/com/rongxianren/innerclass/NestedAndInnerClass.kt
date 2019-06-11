package com.rongxianren.innerclass



fun main(args: Array<String>) {
    println(NestedAndInnerClass.Neseted().foo())
    println(NestedAndInnerClass().Inner().foo())

    var nestedAndInnerClass : NestedAndInnerClass= NestedAndInnerClass()

    nestedAndInnerClass.setInterface(object : AnonymousInterface{
        override fun function1() {
            println("this is function1")
        }

        override fun function2() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            println("this is function2")
        }
    })

    nestedAndInnerClass.callBack();
}

class NestedAndInnerClass {
    private val bar: Int =1;

    private var mLisenter : AnonymousInterface? = null

    class Neseted{
        fun foo() = 2;
    }

    inner class Inner{
        fun foo() = bar
    }


    fun setInterface(lisenter : AnonymousInterface){
        mLisenter = lisenter;
    }

    fun callBack(){
        mLisenter!!.function1()
        mLisenter!!.function2()
    }
}

interface AnonymousInterface{
    fun function1()
    fun function2()
}