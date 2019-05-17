package com.bridgelabz.datastructureprograms

class Deque(internal var chSize: Int) {
    internal var size: Int = 0
    internal var front: Int = 0
    internal var rear: Int = 0
    internal var ch: CharArray

    init {
        ch = CharArray(chSize)
    }// globalizeing chsize variable

    fun addFront(data: Char) {

        ch[front] = data// adding character data to from front of array
        front++ // changing front to next location
        size++ // increment size variable
    }

    fun addRear(data: Char) {
        if (rear == 0) {
            rear = chSize
        }

        ch[rear - 1] = data // adding data to rear position
        rear-- // decrementing rear value
        size++ // incrementing size variable
    }

    fun getFront(): Char {
        val output = ch[front] // reintializeing output variable with front data
        front++ // incrementing front value
        return output
    }

    fun getRear(): Char {
        rear = size - 1// intilizating rear with size of deque
        val output = ch[rear] // giving character to output variable
        rear--
        return output
    }

    fun size(): Int {
        return size // returning size
    }

    fun show() {
        // for loop to print elements in object
        for (i in 0 until size) {
            println(ch[i])
        }

    }

}
