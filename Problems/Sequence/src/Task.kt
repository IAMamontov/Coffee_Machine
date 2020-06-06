import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val c1 = scanner.next().first()
    val c2 = scanner.next().first()
    val c3 = scanner.next().first()
    println(c2 - 1 == c1 && c3 - 1 == c2)
}
