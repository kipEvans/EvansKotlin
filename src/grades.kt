import java.util.Scanner

fun main() {

    var x = Scanner(System.`in`)
    println("Enter Student's Marks :")
    var marks = x.nextInt()

    var output = when(marks){
        in 85..100 -> "Grade A"
        in 70..84 -> "Grade B"
        in 50..69 -> "Grade C"
        in 40..49 -> "Grade D"
        in 0..39 -> "Grade E"
        else -> "Invalid Marks"
    }
    println("Result : $output")


}