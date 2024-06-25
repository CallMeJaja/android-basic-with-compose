class Cookie (
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies  = listOf(
    Cookie(
        name = "Chocholate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.40
    )
)

fun main() {
    val groupMenu = cookies.groupBy {
        it.softBaked
    }

    val softBakedMenu = groupMenu[true] ?: listOf()
    val crunchyMenu = groupMenu[false] ?: listOf()

    println("Soft Baked Menu:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println()
    println("Crunchy Menu:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println()
    val totalPrice = cookies.fold(0.0) {
        total, cookie -> total + cookie.price
    }
    println("Total Price : $${totalPrice}")

    println()
    val alphabetMenuName = cookies.sortedBy {
        it.name
    }
    println("Alphabet Menu :")
    alphabetMenuName.forEach {
        println("${it.name} - $${it.price}")
    }
}