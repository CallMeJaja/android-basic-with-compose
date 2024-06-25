package `Practice-Kotlin-Fundamentals`

/**
 * Imagine that you need to create a music-player app.
 *
 * Create a class that can represent the structure of a song. The `Practice-Kotlin-Fundamentals`.Song class must include these code elements:
 *
 * Properties for the title, artist, year published, and play count
 * A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
 * A method that prints a song description in this format:
 * "[Title], performed by [artist], was released in [year published]."
 */

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int) {

    val isPopular: Boolean
        get() = playCount >= 1000

    fun printSongDescription(){
        println("$title, performed by $artist, was released in $yearPublished")
    }
}

fun main() {
    val song1 = Song("MANTRRA", "Bring Me The Horizon", 2019, 162_560_763)
    val song2 = Song("medicine", "Bring Me The Horizon", 2019, 100_385_797)

    song1.printSongDescription()
    println(song1.isPopular)

    song2.printSongDescription()
    println(song2.isPopular)
}