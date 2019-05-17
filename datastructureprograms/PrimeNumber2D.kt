package com.bridgelabz.datastructureprograms

    internal var primeArray = Array(10) { IntArray(25) }
    fun main(args: Array<String>) {
        println("PRIME NUMBERS IN 2D ARRAY...")
        println()
        val printArray = display()

        for (i in printArray.indices) {
            for (j in 0 until printArray[0].size) {
                if (printArray[i][j] != 0) {
                    print(printArray[i][j].toString() + "  ")
                }
            }
            println()
        }
    }

    fun display(): Array<IntArray> {
        var first = 0
        var second = 0
        var third = 0
        var four = 0
        var five = 0
        var six = 0
        var seven = 0
        var eight = 0
        var nine = 0
        var ten = 0
        for (i in 2..999) {
            //int prime=PrimeNo1D2D.prime(0);
            if (Utility().isPrime(i)) {
                if (i > 0 && i < 100) {
                    primeArray[0][first++] = i

                } else if (i > 100 && i < 200) {
                    primeArray[1][second++] = i
                } else if (i > 200 && i < 300) {
                    primeArray[2][third++] = i
                } else if (i > 300 && i < 400) {
                    primeArray[3][four++] = i
                } else if (i > 400 && i < 500) {
                    primeArray[4][five++] = i
                } else if (i > 500 && i < 600) {
                    primeArray[5][six++] = i
                } else if (i > 600 && i < 700) {
                    primeArray[6][seven++] = i
                } else if (i > 700 && i < 800) {
                    primeArray[7][eight++] = i
                } else if (i > 800 && i < 900) {
                    primeArray[8][nine++] = i
                } else if (i > 900 && i < 1000) {
                    primeArray[9][ten++] = i
                }
            }
        }
        return primeArray
    }
