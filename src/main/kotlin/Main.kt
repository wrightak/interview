package org.example

fun main() {
    println("Hello World!")
}


fun containsUnique(testString: String): Boolean {
    val set = HashSet<Char>()
    for (char in testString) {
        if (set.contains(char)) {
            return false
        } else {
            set.add(char)
        }
    }
    return true
}

