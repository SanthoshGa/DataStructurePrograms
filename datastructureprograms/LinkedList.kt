package com.bridgelabz.datastructureprograms

class LinkedList {

    var head: Node? = null


    val isEmpty: Boolean
        get() = if (head == null) {
            true
        } else false

    class Node(var data: String) {

        var next: Node? = null

        init {
            next = null
        }
    }


    fun add(data: String) {
        val new_node = Node(data)
        if (isEmpty) {
            head = new_node
        } else {
            var temp: Node?
            temp = head
            while (temp!!.next != null) {
                temp = temp.next
            }
            temp.next = new_node
        }
    }


    fun displayList() {
        if (isEmpty) {
            println("None")
        } else {
            var temp: Node?
            temp = head
            while (temp != null) {
                print(temp.data + " ")
                temp = temp.next
            }
            println()
        }
    }


    fun search(key: String): Boolean {
        if (isEmpty) {
            return false
        } else {
            var temp: Node?
            temp = head
            while (temp!!.data.compareTo(key) != 0) {
                if (temp.next == null) {
                    break
                }
                temp = temp.next
            }
            if (temp.data.compareTo(key) == 0) {
                return true
            }
        }
        return false
    }

    fun remove(key: String) {
        if (isEmpty) {
            println("can not delete empty list")
        } else {
            var p: Node?
            var q: Node?
            p = head
            q = head
            var count = 1
            while (p!!.data.compareTo(key) != 0) {
                p = p.next
                count++
                if (p!!.next == null) {
                    break
                }
            }

            if (p.data.compareTo(key) == 0) {
                println("Element found at node $count")
                if (count == 1) {
                    head = p.next
                    p.next = null
                    println("Element deleted: " + p.data)
                    count--
                } else {
                    while (q!!.next !== p) {
                        q = q!!.next
                    }
                    q!!.next = p.next
                    p.next = null
                    println("\nElement deleted: " + p.data)
                    count--
                }
            }
        }
    }

    override fun toString(): String {
        var temp: Node?
        temp = head
        var s = ""
        while (temp != null) {
            s = s + temp.data + " "
            temp = temp.next
        }
        return s
    }

}
