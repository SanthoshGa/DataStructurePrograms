package com.bridgelabz.datastructureprograms

    fun main(args: Array<String>) {
        val Calender = Array(6) { IntArray(7) }
        val arr = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

        val Month = Integer.parseInt(args[0])
        println(Month)

        val Year = Integer.parseInt(args[1])
        println(Year)

        /*validating month and year*/
        if (Month <= 12 && Month >= 1 && Year >= 1000 && Year < 9999) {
            /*condition to check wheather the year is leap year or not*/
            if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
                arr[1] = 29
            }
            /*this for loop is used to intilize array to -10 value*/
            for (i in Calender.indices) {
                for (j in 0 until Calender[i].size) {
                    Calender[i][j] = -1
                }
            }

            // calling getday method to get were the day start
            val D = Utility().getDay(Month, Year)
            var d1 = 1
            // intilizing first row of the calender with d1 value
            for (i in D until Calender[0].size) {
                Calender[0][i] = d1++
            }
            // initilizing remaining rows and coloums with d1 value
            for (i in 1 until Calender.size) {
                for (j in 0 until Calender[i].size) {
                    Calender[i][j] = d1++
                }
            }

            println("\t" + "Sun" + "\t" + "Mon" + "\t" + "Tue" + "\t" + "Wed" + "\t" + "Thu" + "\t" + "Fri" + "\t" + "Sat")

            /* loops to print calender*/
            for (i in Calender.indices) {
                for (j in 0 until Calender[i].size) {
                    // condition to print a empty space where day is empty
                    if (Calender[i][j] < 0 || Calender[i][j] > arr[Month - 1]) {
                        print("\t")
                    } else if (Calender[i][j] > 0) {
                        print("\t" + Calender[i][j] + " ")
                    }//condition to print calender
                }
                println("\t")
            }
        } else {
            System.err.println("please enter valid month and year")
        }
    }
