package com.bridgelabz.datastructureprograms

class Utility {
    fun getDay(month: Int, year: Int): Int {
        val day = 1
        /*standard formulas to find the day falls on the date */
        val y = year - (14 - month) / 12
        val x = y + y / 4 - y / 100 + y / 400
        val m = month + 12 * ((14 - month) / 12) - 2
        return (day + x + 31 * m / 12) % 7// returning d value

    }
    fun factorial(Num: Long): Long {
        var Num = Num
        var fact: Long = 1
        /*loop to get factorial of a number*/
        while (Num > 0) {
            fact = fact * Num// multiplying the number with fact
            Num--// decrementing the number
        }
        return fact// returning fact value
    }
    fun isPrime(number: Int): Boolean {
        if (number < 2) {
            return false
        }
        var factor = 2
        while (factor * factor <= number) {
            if (number % factor == 0) {

                return false
            }
            factor++
        }
        return true

    }
}
