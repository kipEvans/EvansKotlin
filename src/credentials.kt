import java.util.Scanner

fun main() {

    val x = Scanner(System.`in`)

    println("Enter your username :")
    var username = readln()

    println("Enter your password :")
    var password = x.nextInt()

    if (username == "admin" && password == 1234){
        println("Login Successful")
    }
    else{
        println("Invalid credentials")
    }



}