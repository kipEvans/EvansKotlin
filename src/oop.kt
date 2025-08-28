class person{

    var name = "Mike"
    var age = 34

    fun movement(){
        println("The doctor is walking")
    }

    fun eat(){
        println("Doctor is eating")
    }

}

fun main() {
    var doctor = person()
    println(doctor.name)

    doctor.movement()
    var teacher = person()
    println(teacher.name)
}