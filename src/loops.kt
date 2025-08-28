fun main() {
    //while loop
    //incrementing
    var number = 20
    while (number<= 25){
        println("Number is $number")
        number ++
    }

    //Decrementing
    var value = 105
    while (value>= 100){
        println("Value is $value")
        value --

    }
//for loop
    for (x in 1..5){
        //To skip the number 3
        if (x == 3){
            continue
        }
        println("Number : $x")
    }

    for (y in 'A'..'D'){
        //stops the program
        if (y == 'C'){
            break
        }
        println("Letter : $y")
    }


}