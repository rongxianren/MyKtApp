package com.rongxianren.DelegateProperty

import kotlin.properties.Delegates

class DelegateProperty {
    var name: String by Delegates.observable("<no name>") { prop, old, new ->
        println("$old -> $new")
    }
}
fun main() {
    val user = DelegateProperty()
    user.name = "first"
    user.name = "second"
}