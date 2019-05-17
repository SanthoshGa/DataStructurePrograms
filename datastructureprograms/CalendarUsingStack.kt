package com.bridgelabz.datastructureprograms

    fun main(args: Array<String>) {
        //Creating main object for stack using linkedlist class  to sub objects
        val stackMain = StackUsingLinkedList<QueueUsingLinkedList<Int>>()
        //Creating sub  object for stack using linkedlist class to store week days
        var queue = QueueUsingLinkedList<Int>()
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
            /*This for is to store days to sub queues and storing sub queues in main queue*/
            for (i in 1..Month_Arr[Month - 1]) {
                queue.insert(i)//calling insert method to insert elements in to object
                //Condition to create new sub queue
                if ((i + Start_Day) % 7 == 0 || i == Month_Arr[Month - 1]) {
                    stackMain.push(queue)// inserting subqueue to main queue
                    queue = QueueUsingLinkedList() // creating new sub queue
                }
            }
            /*loop to print space where day does not falls*/
            for (i in 0 until Start_Day) {
                print("\t")
            }
            /* for loop to push elements from stack by poping them from main stack*/
            val Size = stackMain.size()
            val stack = StackUsingLinkedList<QueueUsingLinkedList<Int>>()
            /* for loop to push elements from stack by poping them from main stack*/
            for (j in 0 until Size) {
                stack.push(stackMain.pop()!!)// Pushing to stack
            }
            /*for loop to pop sub objects from stack*/
            for (i in 0 until stackMain.size()) {
                // Coping sub object and storing it in week
                val week = stack.pop()
                /* for loop to print sub object elements*/
                for (j in 0 until week!!.size()) {
                    print(week.remove()!!.toString() + "\t")
                }
                println()
            }
        } else {
            println("Please enter valid month and date")
        }
    }
