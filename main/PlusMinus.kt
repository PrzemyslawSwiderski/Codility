fun main() {

    val arr = arrayOf(-4, 3, -9, 0, 4, 1)

    var positiveCount = 0.0
    var negativeCount = 0.0
    var zeroCount = 0.0

    for (num in arr) {
        when {
            num > 0 -> {
                positiveCount++
            }
            num == 0 -> {
                zeroCount++
            }
            num < 0 -> {
                negativeCount++
            }
        }
    }

    println(positiveCount / arr.size)
    println(negativeCount / arr.size)
    println(zeroCount / arr.size)
}
