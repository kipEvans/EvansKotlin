fun main() {
    var languages = arrayOf("Kotlin","Dart","Python")
    //Reassignment operator
    languages[2] = "PHP"
    for (x in languages){
        println(x)
    }

    //Size of an array
    println(languages.size)
}

//create a single program allowing a teacher to enter Marks, first is to enter marks then display grade. use the when statement