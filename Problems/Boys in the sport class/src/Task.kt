import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val h1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val h3 = scanner.nextInt()
    println(h2 >= h1 && h3 >= h2 || h2 >= h3 && h1 >= h2)
}
