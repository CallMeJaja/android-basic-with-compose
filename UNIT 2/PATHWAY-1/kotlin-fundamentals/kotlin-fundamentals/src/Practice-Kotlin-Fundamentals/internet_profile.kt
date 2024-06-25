/**
 * Oftentimes, you're required to complete profiles for online websites that contain mandatory and non-mandatory fields. For example, you can add your personal information and link to other people who referred you to sign up for the profile.
 *
 * In the initial code provided in the following code snippet, write a program which prints out a person's profile details.
 */

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val referrerInfo = referrer?.let {"Has a referrer named ${it.name}, who likes ${it.hobby}"} ?: "Doesn't have a referrer."
        println("""
            Name : $name
            Age : $age
            Like to $hobby. $referrerInfo
        """.trimIndent())
    }
}