import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var c = 0
    do {
        val n = scanner.nextInt()
        c++
    } while (n != 0)
    print("${c - 1}")
}