fun main() {
    val Steps = 4000
    val caloriesBurned = stepToCalorie(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
}

fun stepToCalorie(stepsCount: Int): Double {
    val burnForEachStop = 0.04
    val totalCaloriesBurned = stepsCount * burnForEachStop
    return totalCaloriesBurned
}