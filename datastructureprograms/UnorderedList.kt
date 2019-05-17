package com.bridgelabz.datastructureprograms

import java.io.PrintWriter

@Throws(Exception::class)
fun main(args: Array<String>) {
    /* @param args : it takes  string array  as command line arguments
     */
    val Output: String
    val Path = "C:\\Users\\DELL\\Desktop\\abc.txt"

    val list = LinkedList_Program<String>()// creating object to linkedlist class
    val pr = PrintWriter("unorder.txt") // creating a file

    /* reading data from br object and adding it to linkedlist*/
    val word = DSUtility().fileReadString(Path)

    for (i in word!!.indices)
    {
        list.add(word[i])
    }

    list.display()
    println("Enter the word you want to search in file")
    val search = DSUtility().scanWord() // calling method to scan user word

    if (list.search(search)==true) {
        println("Word is found in file")
        println("Removing word from flie")
        list.delete(search) // deleting element from file
        list.display()
        Output = list.string // converting list words to a string
        pr.write(Output)// writing the data to file
    } else {
        println("Word is not found in file")
        println("Adding word to file")
        list.add(search) // adding element to file
        list.display()
        Output = list.string// converting list words to a string
        pr.write(Output)// writing the data to file
    }
    pr.flush()
    pr.close()
}

