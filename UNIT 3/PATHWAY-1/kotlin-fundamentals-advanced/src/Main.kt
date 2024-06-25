data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty{
    EASY, MEDIUM, HARD
}

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable{
    val question1 = Question("Jumlah negara di dunia", "banyak", Difficulty.EASY)
    val question2 = Question("Apakah benar indoensia terletak di garis katulistiwa?", true, Difficulty.MEDIUM)
    val question3 = Question("berapa jumlah mahasiswa di polban saat ini ?", 3125, Difficulty.HARD)

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    companion object StudentProgress{
        var total: Int = 10
        var answered: Int = 6

    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }

    }

}

fun main() {
    Quiz().apply {
        printQuiz()
    }
}