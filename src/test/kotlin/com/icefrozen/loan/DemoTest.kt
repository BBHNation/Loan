package com.icefrozen.loan

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DemoTest {
    @Test
    fun print_shouldWorkWell_givenThreeNames() {
        // given
        val names = arrayOf("bbh", "rqq")

        // when
        for (name in names) {
            print(name)
        }

        // then
        Assertions.assertTrue(true)
    }
}