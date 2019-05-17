package com.bridgelabz.datastructureprograms
    fun main(args: Array<String>)
    {
        var str = ""
        println("Enter a word")
        val Word = DSUtility().getString()//calling getstring method to scan a word from user
        if (Word.matches("[a-zA-Z]+".toRegex())) {
            val d = Deque(Word.length) // creating object for deque class with length of word as arugumentjag
            for (i in 0 until Word.length) {
                d.addRear(Word[i])// adding character to rear position of deque
            }
            for (i in 0 until Word.length) {
                str += d.getFront() // getting character from front position of deque and concating with a empty string
            }

            if (Word == str)
            // condition to check string is palindrome or not
            {
                println("Word is palindrome")
            } else {
                println("Word is not palindrome")
            }
        } else {
            println("Enter valid data ...........")
        }


    }
