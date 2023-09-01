import kotlin.math.abs

fun main(args: Array<String>) {
    // 入力をキャッチ
    val N = readLine()!!.toInt()

    // 一行ずつ出力していく
    for (i in 1..N) {
        // 手前のスペースを計算
        val spaces = N - i

        // 奥の数字を、切り分けた関数で計算
        val numbers = generateNumbers(i)
        
        // つなげて出力
        val row = "${" ".repeat(spaces)}$numbers"
        println(row)
    }
}

// 切り分けた関数
fun generateNumbers(n: Int): String {
    // 便利なクラス 
    // appendを重ねる事ができるとかなんとか しらんけど
    // 注意点として、最後に要toString()
    val sb = StringBuilder()

    // 登って、
    for (i in 1..n) {
        sb.append(i % 10)
    }

    // 下る
        // downTo 、なんか便利そう（こなみ）
    for (i in n - 1 downTo 1) {
        sb.append(i % 10)
    }

    // 最後につなげて出力
    return sb.toString()
}
