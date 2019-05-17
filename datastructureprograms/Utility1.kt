package com.bridgelabz.datastructureprograms

import java.util.ArrayList
import java.util.Arrays

object Utility1 {
    fun isAnagram(str1: String, str2: String): Boolean {
        val s1 = str1.replace("\\s".toRegex(), "")
        val s2 = str2.replace("\\s".toRegex(), "")
        var status = false
        if (s1.length != s2.length) {
            status = false
        }
        val arrs1 = s1.toLowerCase().toCharArray()
        val arrs2 = s2.toLowerCase().toCharArray()
        Arrays.sort(arrs1)
        Arrays.sort(arrs2)
        status = Arrays.equals(arrs1, arrs2)
        return status
    }

    fun primeRange(numbers: Int): ArrayList<Int> {

        val arraylist = ArrayList<Int>()
        var i = 0
        var num = 0

        i = 1
        while (i <= numbers) {
            var counter = 0
            num = i
            while (num >= 1) {
                if (i % num == 0) {
                    counter = counter + 1
                }
                num--
            }
            if (counter == 2) {
                //APPENDED THE PRIME NUMBER TO STRING...
                arraylist.add(i)
            }
            i++
        }
        return arraylist
    }

}
