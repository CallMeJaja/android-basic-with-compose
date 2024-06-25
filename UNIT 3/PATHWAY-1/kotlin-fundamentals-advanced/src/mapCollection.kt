fun main() {
    val solarSystem = mutableMapOf(
        "Mercuriy" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27
    )
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}