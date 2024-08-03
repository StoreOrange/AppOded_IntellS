import java.util.*    // required import


fun main() {
    val temperatura = 10
    val escaliente = if (temperatura > 38) true else false
    println(escaliente)
}


fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}


