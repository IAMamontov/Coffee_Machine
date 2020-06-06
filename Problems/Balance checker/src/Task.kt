import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var ia = scanner.nextInt()
    var pp: Int
    do {
        val p = scanner.nextInt()
        pp = p
        ia = ia - p
    } while (ia >= 0 && scanner.hasNext())
    if (ia >= 0) {
        println("Thank you for choosing us to manage your account! You have $ia money.")
    } else {
        println("Error, insufficient funds for the purchase. You have ${ia + pp}, but you need $pp. ")
    }
}
