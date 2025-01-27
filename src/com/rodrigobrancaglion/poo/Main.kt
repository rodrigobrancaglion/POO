package com.rodrigobrancaglion.poo

fun main() {
    /* Exemplo 1 */
//    var name: String = "Rodrigo Brancaglion"
//    var idade: Int?
//    idade = 32
//    println("Hello $name $idade")
//    idade = 33
//    println("Hello $name $idade")

    /* Exemplo 2 */
//    val dog = Dog()
//    dog.name = "Linux"
//    println("Hello $dog.name")

    /* Exemplo 3 */
//    val dog = Dog()
//    dog.name = "Linux"
//    dog.sayHi()

    /* Exemplo 4 */
//    val dog = Dog()
//    dog.name = "Linux"
//    dog.sayHi("Rodrigo Brancaglion")
//    println(dog.sayHi("Rodrigo Brancaglion"))

    /* Exemplo 5 */
//    val dogSara = Dog()
//    dogSara.name = "Android"
//    dogSara.sayHi("Sara")

    /* Exemplo 6 Class Contructor */
//    val dog = Dog("Lucas")
//    dog.name = "Android"
//    dog.sayHi()

    /* Exemplo 7 Class Human */
//    var lucas = Human()
//    lucas.name = "Lucas"
//
//    val dog = Dog(lucas)
//    dog.name = "Linux"
//    dog.sayHi()

    /* Exemplo 8 attribute Human */
    val lucas = Human()
    lucas.name = "Lucas"

    val dog = Dog()
    dog.owner = lucas
    dog.name = "Linux"
    dog.sayHi()

    val paulo = Human()
    paulo.name = "Paulo"
    dog.owner = paulo
    dog.sayHi()
}