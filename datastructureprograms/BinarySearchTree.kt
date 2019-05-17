package com.bridgelabz.datastructureprograms

    fun main(args: Array<String>) {
        println("Enter number between 1-10 to find number of combinations")
        // calling method from utility to take a number from user
        val Number = DSUtility().getNumber().toLong()
        if (Number > 0 && Number <= 10) {
            // calling the factorial  method to find factorial of (2*n)!
            val Numarator = Utility().factorial(2 * Number)
            // calling the factorial  method to find factorial of (n)!
            val Denomarator = Utility().factorial(Number)
            // calling the factorial  method to find factorial of (n+1)!
            val Denomarator1 = Utility().factorial(Number + 1)
            println("Total number of combinations of " + Number + " = " + Numarator / (Denomarator1 * Denomarator))
        } else {
            println("Enter the number with in range ")
        }
    }
