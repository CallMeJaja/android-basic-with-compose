fun main() {
    var timeSpentToday: Int = 300
    var timeSpentYesterday: Int = 250
    println(compare(timeSpentToday, timeSpentYesterday))

    timeSpentToday = 300
    timeSpentYesterday = 300
    println(compare(timeSpentToday, timeSpentYesterday))

    timeSpentToday = 200
    timeSpentYesterday = 220
    println(compare(timeSpentToday, timeSpentYesterday))
}

fun compare(stepToday: Int, stepYesterday: Int): Boolean {
    if(stepToday > stepYesterday){
        return true
    } else {
        return false
    }
}