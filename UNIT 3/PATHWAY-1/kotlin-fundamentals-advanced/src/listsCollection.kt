fun main() {
    //val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptunus")
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptunus")
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    println("Venus" in solarSystem)
}