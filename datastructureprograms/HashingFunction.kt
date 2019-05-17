package com.bridgelabz.datastructureprograms

import java.io.*
import java.util.Scanner
    var slot = arrayOfNulls<LinkedList>(11)

    @Throws(FileNotFoundException::class)
    fun main(args: Array<String>) {
        val path = "C:\\Users\\DELL\\Desktop\\hash.txt"
        for (i in 0..10) {
            slot[i] = LinkedList()
        }

        val br = BufferedReader(FileReader(path))
        try {
            val str = br.readLine()

            println(str)

            val strA = str.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            for (i in strA.indices) {
                println(strA[i])
            }


            for (i in strA.indices) {
                val slotNum = hash(strA[i])
                slot[slotNum]?.add(strA[i])
                //System.out.print(slot[slotNum]);
            }

            println()

            for (i in 0..10) {
                print("$i==> ")
                slot[i]?.displayList()
            }
            val sc = Scanner(System.`in`)
            println("Enter the String to search:")
            val key = sc.nextLine()
            val slotNumber = hash(key)
            val value = slot[slotNumber]?.search(key)
            if (value!!) {
                println("\nElement found at slot $slotNumber and deleted\n")
                slot[slotNumber]?.remove(key)
            } else {
                println("\nElement not found but added: $key at slot $slotNumber\n")
                slot[slotNumber]?.add(key)
            }

            println()
            for (i in 0..10) {
                print("$i==> ")
                slot[i]?.displayList()
            }

            var st = " "
            for (i in 0..10) {
                st = slot[i].toString() + st
            }
            println("New elements in file:\n$st")
            val bw = BufferedWriter(FileWriter(path))
            bw.write(st)

            bw.close()
            br.close()
            sc.close()
        } catch (e: IOException) {
            println("" + e.message)
            e.printStackTrace()
        }

    }

    fun hash(str: String): Int {

        return Integer.parseInt(str) % 11
    }
