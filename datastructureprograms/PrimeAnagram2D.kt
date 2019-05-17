package com.bridgelabz.datastructureprograms

import java.util.ArrayList
    internal var prime = Array<Array<Int?>>(13) { arrayOfNulls(13) }
    internal var array = Array<Array<String?>>(168) { arrayOfNulls(168) }
    internal var count = 0
    fun main(args: Array<String>) {
        println("RRIME NUMBERS ARE...")

        val primenum = Utility1.primeRange(1000)

        val arr = arrayOfNulls<Int>(primenum.size)

        //ARRAY LIST TO ARRAY CONVERSION...
        for (i in primenum.indices) {
            arr[i] = primenum[i].toInt()
        }

        for (x in arr) {
            print(x!!.toString() + " ")
        }
        println("\n")
        println("ANAGRAM NUMBERS ARE...")

        for (i in 0..arr.size) {
            for (j in i + 1 until arr.size) {
                val str1 = arr[i].toString()
                val str2 = arr[j].toString()
                val status = Utility1.isAnagram(str1, str2)
                if (status) {
                    array[i][j] = arr[i].toString()+ "\t" + arr[j] + "\n"
                    print(array[i][j]  + " ")
                }
            }
        }
        println("\n")
        println("PRIME AND ANAGRAM NUMBERS IN 2D ARRAY...")
        println("\n")

        //ASSIGNING ELEMENTS FOR 1D ARRAY TO 2D ARRAY...
        for (i in 0..12) {
            for (j in 0..12) {
                val countA = count++
                if (countA < 168) {
                    prime[i][j] = arr[countA]
                } else {
                    break
                }

                print(prime[i][j].toString() + " ")
            }
            println()
        }
    }
