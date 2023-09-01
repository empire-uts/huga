import kotlin.math.abs

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    for (i in 1..N) {
        val spaces = N - i
        val numbers = generateNumbers(i)
        val row = "${" ".repeat(spaces)}$numbers"
        println(row)
    }
}

fun generateNumbers(n: Int): String {
    val sb = StringBuilder()

    for (i in 1..n) {
        sb.append(i % 10)
    }

    for (i in n - 1 downTo 1) {
        sb.append(i % 10)
    }

    return sb.toString()
}
