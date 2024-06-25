package `Practice-Kotlin-Fundamentals`

/**
 * There are three `Practice-Kotlin-Fundamentals`.`Practice-Kotlin-Fundamentals`.`Practice-Kotlin-Fundamentals`.`Practice-Kotlin-Fundamentals`.main temperature scales used in the world: Celsius, Fahrenheit, and Kelvin.
 *
 * In the initial code provided in the following code snippet, write a program that converts a temperature from one scale to another with these formulas:
 *
 * Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
 * Kelvin to Celsius: ° C = K - 273.15
 * Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15
 * Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.
 */

/**
 * Complete the `Practice-Kotlin-Fundamentals`.`Practice-Kotlin-Fundamentals`.`Practice-Kotlin-Fundamentals`.`Practice-Kotlin-Fundamentals`.main() function so that it calls the `Practice-Kotlin-Fundamentals`.printFinalTemperature() function and prints the following lines. You need to pass arguments for the temperature and conversion formula. Hint: you may want to use Double values to avoid Integer truncation during division operations.
 */

fun main() {
    printFinalTemperature(27.0, "Celcius", "Fahrenheit", {(9/5.0) * it +32})
    printFinalTemperature(350.0, "Kelvin", "Celcius", {it - 273.15})
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", {5/9.0 * (it - 32) + 273.15})
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}