import java.util.Scanner

fun main() {

    var x = Scanner(System.`in`)
    println("Enter first number :")
    var first = x.nextInt()

    println("Enter second number :")
    var second = x.nextInt()

    println("Enter third number :")
    var third = x.nextInt()

    if(first>second && first>third){
        println("$first is the largest number")
    }
    else if (second>first && second>third){
        println("$second is the largest number")

    }
    else{
        println("$third is the largest")
    }


}