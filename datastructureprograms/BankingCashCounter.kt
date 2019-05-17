package com.bridgelabz.datastructureprograms

import java.util.Scanner

object BankingCashCounter {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var cashOfBank = 50000.0
        println("Enter number of people in the queue :")
        val n = sc.nextInt()
        sc.nextLine()
        val q = Queue()
        for (i in 0 until n) {
            if (q.peekMoneyOfFront() * -1 <= cashOfBank && q.peekMoneyOfFront() != 0.0) {
                cashOfBank = cashOfBank + q.peekMoneyOfFront()
                q.dequeue()
                println("Now bank has balance : $cashOfBank")
            }
            println("Enter name of person :")
            val name = sc.nextLine()
            println("Enter money for withdraw or deposit(enter -ve value for withdraw).")
            val money = sc.nextDouble()
            sc.nextLine()
            if (money < 0 && money * -1 > cashOfBank)
                q.enqueue(name, money)
            else
                cashOfBank = cashOfBank + money
            println("Now bank has balance : $cashOfBank")
        }
        val q2 = Queue()
        var l = q.size()
        while (l > 0) {
            val moneyOfObj = q.peekMoneyOfFront()
            val s = q.dequeue()

            if (moneyOfObj * -1 > cashOfBank)
                q2.enqueue(s, moneyOfObj)
            else
                cashOfBank = cashOfBank + moneyOfObj
            println("Now bank has balance : $cashOfBank")
            l--
        }
        if (q2.size() > 0) {
            q2.print()
            print("left without withdrawing money, as bank has in-sufficient balance.")
        } else
            println("Queue is balanced.")

        sc.close()
    }
}

internal class Queue {
    private val capacity = 10
    private val arr = arrayOfNulls<String>(capacity)
    private val arr2 = DoubleArray(capacity)
    private var front: Int = 0
    private var size: Int = 0
    private var rear = capacity - 1
    val isEmpty: Boolean
        get() = if (size == 0)
            true
        else
            false

    fun enqueue(data: String?, money: Double) {
        rear = (rear + 1) % capacity
        arr[rear] = data
        arr2[rear] = money
        size++
    }

    fun dequeue(): String? {
        val temp = arr[front]
        arr[front] = null
        arr2[front] = 0.0
        front = (front + 1) % capacity
        size--
        return temp
    }

    fun size(): Int {
        return size
    }

    fun print() {
        for (i in front until rear)
            print(arr[i] + ", ")
        print(arr[rear] + " ")
    }

    fun peekFront(): String? {
        return arr[front]
    }

    fun peekMoneyOfFront(): Double {
        return arr2[front]
    }

}
