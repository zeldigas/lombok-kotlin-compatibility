package com.example

import org.junit.jupiter.api.Test

class TestAccess {

    @Test
    fun `Failing test with problem`() {
        testAccess(MyValue("hello", "world"))
    }

    @Test
    fun `Passing test with workaround`() {
        testAccessOfFixed(MyValuePrivate("hello", "world"))
    }
}