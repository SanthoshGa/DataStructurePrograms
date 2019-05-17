package com.bridgelabz.datastructureprograms

import java.util.Scanner
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        println("ENTER THE EXPRESSION...")
        val ch = sc.next().toCharArray()
        if (StackMethod.isParBalanced(ch))
            println("EXPRESSION IS BALANCED...")
        else
            println("EXPRESSION IS NOT BALANCED...")
    }
