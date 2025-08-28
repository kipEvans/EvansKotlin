fun main() {
    //Standard library functions/inbuilt functions
    var number = Math.sqrt(81.0)
    println("The squareroot is $number")

    student()
    device(x = "laptop")
    device(x = "Mobile")
    employee(firstname = "Mary",age = 27, salary=45000.0)
    employee(firstname = "Jasper",age = 20, salary=20000.0)
    employee(firstname = "Jacob",age = 40, salary=100000.0)
    employee(firstname = "Matthew",age = 39, salary=80000.0)
}
//User defined functions
fun student(){
    println("Evans")
}

//Parameters/variable and Arguments/value
fun device(x :String){
    println(x)
}

fun employee(firstname: String,age : Int,salary : Double){
    println("$firstname,$age,$salary")
}