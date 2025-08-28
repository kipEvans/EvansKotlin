open class Animal{

    fun sound(){
        println("Animal is making a sound")
    }

}

open class Horse:Animal(){

    var isWild = true
    fun movement(){
        println("The Horse is galloping")
    }

}
class Duck:Horse(){
    fun swim(){
        println("Duck is swimming")
    }
}

fun main() {
    var a = Animal()

    var b = Horse()

    var c = Duck()
}