package com.bridgelabz.datastructureprograms

class StackMethod {
    internal var top = -1
    internal var items = CharArray(100)


    internal val isEmpty: Boolean
        get() = if (top == -1) true else false

    internal fun push(x: Char) {
        if (top == 99) {
            println("STACK IS FULL...")
        } else {
            items[++top] = x
        }
    }

    internal fun pop(): Char {
        if (top == -1) {
            println("UNDERFLOW ERROR...")
            return '\u0000'
        } else {
            val ele = items[top]
            top--
            return ele
        }
    }

    companion object {


        fun isMatchingPair(char1: Char, char2: Char): Boolean {
            return if (char1 == '(' && char2 == ')')
                true
            else if (char1 == '{' && char2 == '}')
                true
            else if (char1 == '[' && char2 == ']')
                true
            else
                false
        }


        fun isParBalanced(exp: CharArray): Boolean {

            val st = StackMethod()


            for (i in exp.indices) {

                if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
                    st.push(exp[i])


                if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

                    if (st.isEmpty) {
                        return false
                    } else if (!isMatchingPair(
                            st.pop(),
                            exp[i]
                        )
                    ) {
                        return false
                    }
                }
            }
            return if (st.isEmpty)
                true//BALANCED...
            else {
                false//NOT BALANCED...
            }
        }
    }
}
