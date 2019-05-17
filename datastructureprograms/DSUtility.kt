package com.bridgelabz.datastructureprograms

import kotlin.jvm.Throws;
import java.io.BufferedReader
import java.io.FileReader
import java.util.Scanner

class DSUtility {
    internal var sc = Scanner(System.`in`)
    fun scanWord(): String {
        return sc.next()
    }
    fun getString():String{
        return sc.next()
    }
    fun getNumber():Int{
        return sc.nextInt()
    }

    @Throws(Exception::class)
    fun fileReadString(path: String): Array<String>? {
        val file = FileReader(path) // reading data from file
        val read = BufferedReader(file)
        val line: String = read.readLine()

        /* reading data from read object and adding it to linkedlist */
        while ((line) != null) {
            return line.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        }
        read.close()
        return null
    }

    @Throws(Exception::class)
    fun fileReadInt(path: String): IntArray? {

        val file = FileReader(path) // reading data from file
        val br = BufferedReader(file) // reading data from fr object
        val line: String = br.readLine()
        /* reading data from br object and adding it to linkedlist */
        while ((line) != null) {
            val word = line.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val size = word.size
            val arr = IntArray(size)
            /* for loop to convert string to integer data*/
            for (i in arr.indices) {
                arr[i] = Integer.parseInt(word[i])
            }
            br.close()
            return arr
        }
        return null

    }

}

