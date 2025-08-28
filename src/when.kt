import java.util.Scanner

fun main() {
    var y = Scanner(System.`in`)

    println("Enter day :")
    var day = y.nextInt()

    var dayName = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day of the week"

    }
    println("Day : $dayName")
}