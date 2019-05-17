package com.bridgelabz.datastructureprograms

fun main(args:Array<String>){
    class Person(val name: String) {
    constructor(name: String, parent: Person) : this(name){
    }
}
}