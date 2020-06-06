import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val duration = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val flightCost = scanner.nextInt()
    val nightCost = scanner.nextInt()
    println(foodCost * duration + flightCost * 2 + nightCost * (duration - 1))
}