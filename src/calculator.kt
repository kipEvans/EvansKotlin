import java.util.Scanner

fun main() {

    var x = Scanner(System.`in`)

    println("Enter the first value :")
    var first = x.nextInt()

    println("Enter operator :")
    var operator = x.next()

    println("Enter the second value :")
    var second = x.nextInt()

    var output = when(operator){
        "+" -> first + second
        "-" -> first - second
        "*" -> first * second
        "%" -> first % second
        "/" -> first / second
        else -> println("Invalid operator")

    }
    println("Result: $output")



}
