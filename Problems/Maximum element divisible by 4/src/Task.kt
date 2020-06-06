import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var maxDiv4 = 0
    repeat(n) {
        val x = scanner.nextInt()
        if (x % 4 == 0) {
            if (x > maxDiv4) {
                maxDiv4 = x
            }
        }
    }
    print(maxDiv4)
}