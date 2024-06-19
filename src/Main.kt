// Реализация с использованием изменяемого контейнера MutableSet
fun removeDuplicatesWithSet(arr: IntArray): IntArray {
    val seen = mutableSetOf<Int>()
    val result = mutableListOf<Int>()

    arr.forEach { element ->
        if (seen.add(element)) {
            result.add(element)
        }
    }

    return result.toIntArray()
}

// Реализация с использованием цикла for и неизменяемого списка
fun removeDuplicatesWithFor(arr: IntArray): IntArray {
    val result = mutableListOf<Int>()

    for (element in arr) {
        if (element !in result) {
            result.add(element)
        }
    }

    return result.toIntArray()
}

fun main() {
    val arr1 = intArrayOf(1, 2, 2, 3, 4, 4, 5)
    val result1 = removeDuplicatesWithSet(arr1)
    println("Решение с помощью MutableSet: ${result1.joinToString(", ")}")

    val arr2 = intArrayOf(1, 2, 2, 3, 4, 4, 5)
    val result2 = removeDuplicatesWithFor(arr2)
    println("Решение с помощью for: ${result2.joinToString(", ")}")
}