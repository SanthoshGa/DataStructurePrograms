package com.bridgelabz.datastructureprograms

class StackUsingLinkedList<T> {
    internal var top: Node? = null
    internal var size: Int = 0

    inner class Node {
        internal var data: T? = null
        internal var ref: Node? = null
    }

    fun push(data: T) {
        val node = Node()//Creating object to node class
        size++
        if (node == null)
        //Checking wheather the node is empty or not
        {
            println("Stack overflow")
            return
        }
        node.data = data// Storing data
        node.ref = top//changing the reference value
        top = node//Changing top node
    }

    fun pop(): T? {
        if (top == null)
        //Checking wheather the top is null or not
        {
            println("Stack underflow")
            return null
        }
        val data = top!!.data
        top = top!!.ref
        return data
    }

    fun display() {
        if (top == null)
        // checking wheather top is empty or not
        {
            print("stack overflow")
            System.exit(0)
        } else {
            var temp = top //coping top to temp variable
            while (temp != null) {
                print(temp.data!!.toString() + " ") // printing data
                temp = temp.ref // changing reference value
            }

        }
    }


    fun size(): Int {
        return size
    }


}
