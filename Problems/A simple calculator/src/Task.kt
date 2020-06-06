import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextLong()
    val o = scanner.next().first()
    val b = scanner.nextLong()
    println(when (o) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> {
            if (b != 0L) {
                a / b
            } else {
                "Division by 0!"
            }
        }
        else -> "Unknown operator"
    })
}