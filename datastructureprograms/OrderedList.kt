package com.bridgelabz.datastructureprograms

import java.io.PrintWriter
import java.util.Arrays

    fun main(args: Array<String>) {
        val output: String
        val Path = "C:\\Users\\DELL\\Desktop\\order.txt"
        val list =
            LinkedList_Program<Int>() // creating object for linkedlist class
        val pr = PrintWriter("order.txt") // creating a file

        val number = DSUtility().fileReadInt(Path) // calling method to store element in an array
        Arrays.sort(number!!)
        /* adding numbers to linkedlist*/
        for (i in number!!.indices) {
            list.add(number!![i])
        }
        list.display() // calling method to display the elements in object

        println("Enter the Number you want to search in file")
        val Search = DSUtility().getNumber() // calling method to scan user word
        if (list.search(Search) == true)
        // calling search method to check condition
        {
            println("Number is found in file")
            println("Removing Number from flie")

            list.delete(Search) // deleting the word
            list.display()// display element
            output = list.string //calling method to store elements in a single variable
            pr.write(output)// writing data to file
        } else {
            println("Number is not found in file")
            println("Adding Number to file")
            list.add(Search)// adding element to object
            list.display()
            output = list.string// converting list words to a string
            pr.write(output)// writing the data to file
        }
        pr.flush()
        pr.close()

    }
