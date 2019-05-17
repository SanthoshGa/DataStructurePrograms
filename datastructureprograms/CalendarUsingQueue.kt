package com.bridgelabz.datastructureprograms

object CalendarUsingQueue {
    @JvmStatic
    fun main(args: Array<String>) {
        //Creating main object for Queue using linkedlist class
        val queue = QueueUsingLinkedList<QueueUsingLinkedList<Int>>()
        //Creating sub  object for Queue using linkedlist class to store week days
        var queue1 = QueueUsingLinkedList<Int>()
        println("Enter month")
        // Calling method to take month from user
        val Month = DSUtility().getNumber()
        println("Enter year")
        // Calling method to take year from user
        val Year = DSUtility().getNumber()
        //Validating year and month
        if (Month <= 12 && Month >= 1 && Year >= 1000 && Year <= 9999) {
            //Calling getday method to find the starting day of month
            val Start_Day = Utility().getDay(Month, Year)
            // Storing number of days containing in each month
            val Month_Arr = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
            println("Sun" + "\t" + "Mon" + "\t" + "Tue" + "\t" + "Wed" + "\t" + "Thu" + "\t" + "Fri" + "\t" + "Sat")
            // Condition for checking year is a leap year or not
            if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
                Month_Arr[1] = 29
            }
            /*This i for to store days to sub queues and storing sub queues in main queue*/
            for (i in 1..Month_Arr[Month - 1]) {
                queue1.insert(i)//calling insert method to insert elements in to object
                //Condition to create new sub queue
                if ((i + Start_Day) % 7 == 0 || i == Month_Arr[Month - 1]) {
                    queue.insert(queue1)// Inserting subqueue to main queue
                    queue1 = QueueUsingLinkedList() // Creating new sub queue
                }

            }
            /*For to print space where there is no day falls*/
            for (i in 0 until Start_Day) {
                print("\t")
            }
            /*For loop to print all subqueues in main queue*/
            for (i in 0 until queue.size()) {
                //Removing top queue from main queue and coping it to variable
                val week = queue.remove()
                //For loop to print elements in sub queue
                for (j in 0 until week!!.size()) {
                    print(week.remove()!!.toString() + "\t")
                }
                println()
            }
        } else {
            System.err.println("Please enter valid month and year")
        }

    }
}
