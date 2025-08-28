import java.util.Scanner

fun main() {

    var y = Scanner(System.`in`)

    println("Enter current temperature :")
    var temperature = y.nextInt()

    if (temperature>37){
        println("High Fever")
    }
    else{
        println("Low Fever")
    }

}