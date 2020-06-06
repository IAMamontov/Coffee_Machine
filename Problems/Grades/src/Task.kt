import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0
    repeat(n) {
        val grade = scanner.nextInt()
        when (grade) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    println("$d $c $b $a")

    // put your code here
}