import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val threeDigit = scanner.nextInt()
    println(threeDigit / 100 + threeDigit % 100 / 10 * 10 + threeDigit % 10 * 100)
}