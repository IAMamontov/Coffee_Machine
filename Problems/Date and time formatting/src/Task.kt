import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val hours = scanner.nextInt()
    val minutes = scanner.nextInt()
    val seconds = scanner.nextInt()
    val days = scanner.nextInt()
    val months = scanner.nextInt()
    val years = scanner.nextInt()
    println("$hours:$minutes:$seconds $days/$months/$years")
}