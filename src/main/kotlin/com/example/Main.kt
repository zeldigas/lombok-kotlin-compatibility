package com.example

fun testAccess(param: MyValue) {
    print("Direct field access: ${param.first}")
}

fun testAccessOfFixed(param: MyValuePrivate) {
    print("Getter access: ${param.first}")
}