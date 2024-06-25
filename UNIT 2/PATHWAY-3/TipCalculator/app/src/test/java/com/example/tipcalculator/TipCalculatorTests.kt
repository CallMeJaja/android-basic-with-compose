package com.example.tipcalculator

import org.junit.Test
import org.junit.Assert.assertEquals
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculatorTip_20PercentNoRoundUp() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}