fun main() {
    val trafficLightColor = "Amber"

    val msg = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid Traffic-Light Color"
    }
    println(msg)
}