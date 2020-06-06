class Application(val name: String) {

    // write the run method here
    fun run(args: Array<String>) {
        println(this.name)
        var i = 0
        while (i <= args.lastIndex) {
            println(args[i])
            i++
        }
    }
}