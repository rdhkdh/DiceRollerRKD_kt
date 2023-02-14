package com.example.dicerollerrkd


import org.junit.Assert.assertTrue
import org.junit.Test


class ExampleUnitTest {
        @Test
        fun generates_number() {
            val dice1= Dice(6)
            val rollresult1= dice1.roll()
            assertTrue("value of roll result not in 1 to 6",rollresult1 in 1..6)


        }
    }
