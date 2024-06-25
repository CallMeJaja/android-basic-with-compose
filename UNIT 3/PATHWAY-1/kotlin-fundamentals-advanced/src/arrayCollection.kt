fun main() {
    val rockPlanet = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanet = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanet + gasPlanet
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    solarSystem[3] = "Elon Musk"
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])
}