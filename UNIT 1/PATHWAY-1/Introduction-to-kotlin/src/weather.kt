fun main() {
    Weather("Purwakarta", 23, 24, 99)
    Weather("Bandung", 22, 55, 12)
    Weather("Karawang", 26, 64, 22)
}

fun Weather(city: String, lTemp: Int,hTemp: Int, rain: Int) {

    println("""
        City : $city
        Low Temperature : $lTemp, High Temperature : $hTemp
        Chance of rain: $rain%
        
    """.trimIndent())

}