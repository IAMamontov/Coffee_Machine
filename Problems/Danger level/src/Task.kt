enum class DangerLevel(val levelIndex: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    fun getLevel(): Int {
        return this.levelIndex
    }
}