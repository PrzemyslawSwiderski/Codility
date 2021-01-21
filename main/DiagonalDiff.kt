import kotlin.math.abs as mathAbs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var sum1 = 0
    var sum2 = 0

    for (i in arr.indices) {
        sum1 += arr[i][i]
        sum2 += arr[i][arr.lastIndex - i]
    }

    return mathAbs(sum1 - sum2)
}

fun main() {

    val testArr1 = arrayOf(
            arrayOf(11, 2, 4),
            arrayOf(4, 5, 6),
            arrayOf(10, 8, -12)
    )

    val result1 = diagonalDifference(testArr1)

    println(result1)
}