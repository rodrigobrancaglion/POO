package com.rodrigobrancaglion.poo

//class Dog {
//
//    var name: String? = null
////    fun sayHi(){
////        println("Hi, my name is $name")
////    }
//    fun sayHi(ownerName: String){
//        println("Hi, $ownerName, my name is $name")
//    }
//}

//class Dog constructor(
//    private val ownerName: String) {
//
//    var name: String? = null
//    fun sayHi(){
//        println("Hi, my name is $name, and my wner is $ownerName")
//    }
//}

//class Dog constructor(
//    private val owner: Human) {
//
//    var name: String? = null
//    fun sayHi(){
//        println("Hi, my name is $name, and my wner is ${owner.name}")
//    }
//}

class Dog {

    var owner: Human? = null
    var name: String? = null

    fun sayHi(){
        println("Hi, my name is $name, and my owner is ${owner?.name}")
    }
}