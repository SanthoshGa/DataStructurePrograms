package com.bridgelabz.datastructureprograms

class QueueUsingLinkedList<T> {
    internal var size: Int = 0
    internal var head: Node? = null
    internal var front: Node? = null
    internal var tail: Node? = null

    inner class Node {
        internal var data: T? = null
        internal var ref: Node? = null
    }


    fun insert(data: T) {
        val node = Node()// Creating object to node inner class
        node.data = data // Storing data to data variable
        size++
        if (tail == null) {
            front = node// Making node as front
            tail = node // Making node as rear
        }
        tail!!.ref = node// Changing reference value
        tail = node// Changing rear
    }

    fun display() {
        var temp = front
        while (temp!!.ref != null)
        // Condition to print elements
        {
            print(temp.data!!.toString() + "  ")
            temp = temp.ref // Changing reference value
        }
        println(temp.data!!.toString() + "  ") // Printing last data element
    }


    fun remove(): T? {
        if (front == null)
        // Checking front is null or nor
        {
            return null
        } else {
            val data = front!!.data
            front = front!!.ref// Changing reference value
            return data
        }
    }


    fun size(): Int {
        return size// Returning size
    }


}
