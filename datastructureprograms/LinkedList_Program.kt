package com.bridgelabz.datastructureprograms

class LinkedList_Program<T> {
    internal var head: Node? = null
    // making n as head node
    // adding all values to output variable
    // adding last element
    val string: String
        get() {
            var output = " "
            var n = head

            while (n!!.ref != null) {
                output += n.data!!.toString() + " "
                n = n.ref
            }
            output += n.data
            return output
        }

    inner class Node {
        internal var data: T? = null
        internal var ref: Node? = null
    }

    fun add(data: T) {
        val node = Node() // creating nodes
        node.data = data// adding data

        if (head == null) {
            head = node  // make head as a first node
        } else {
            var n = head

            while (n!!.ref != null)
            // take reference values
            {
                n = n.ref //changing reference values
            }
            n.ref = node
        }

    }

    fun display() {
        var n = head // making n as head node

        while (n!!.ref != null) {
            print(n.data!!.toString() + " ") // Retrieving the data
            n = n.ref // changing reference
        }
        println(n.data) // Retrieving last element

    }

    fun search(word: T): Boolean {
        var n = head // making n as head node

        while (n!!.ref != null)
        // next reference value
        {
            if (n.data == word)
            // comparing data with user search value
            {
                return true
            }

            if (n.ref == null)
            // checking last element of object
            {
                n.data == word //comparing data with user search value
                return true
            }
            n = n.ref
        }
        return false
    }

    fun delete(ele: T) {
        var n = head
        var n1 = head

        if (n!!.data == ele)
        // checking head element with user search element to delete
        {
            head = head!!.ref // changing reference value
        }
        while (n != null) {
            if (n.data == ele)
            // checking for the element in list
            {
                n1!!.ref = n.ref // changing reference value
            }
            n1 = n
            n = n.ref
        }
    }

    fun addFirst(data: T) {
        val node = Node() // creating object
        node.data = data // adding data to first node
        node.ref = head
        head = node

    }
}

