fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer {
    var time: Int = 0
        set(value) {
            field = when {
                value < -128 -> -128
                value > 127 -> 127
                else -> value
            }
        }
    constructor(time: Int) {
        this.time = time
    }
}
