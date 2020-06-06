import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val c1 = scanner.next().first()
    println(c1.isUpperCase() || c1.isDigit() && c1 != '0')
}