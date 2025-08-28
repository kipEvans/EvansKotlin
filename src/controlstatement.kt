import java.util.Scanner

fun main() {
    var x = Scanner(System.`in`)

    println("Enter your age :")
    var age = x.nextInt()
    

    if (age > 18){
        println("You are a voter")
    }
    else{
        println("You are not a voter")
    }

}