import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    println(if (n > 0) {
        "positive"
    } else if (n == 0) {
        "zero"
    } else {
        "negative"
    })
}
