import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var c = 1
    var cc = 0
    repeat(n) {
        print("$c ")
        cc++
        if (cc == c) {
            c++
            cc = 0
        }
    }
}
