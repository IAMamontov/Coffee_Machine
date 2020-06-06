package machine
import java.util.Scanner

object MachineItself {

    var waterRemaining = 400
    var milkRemaining = 540
    var coffeeRemaining = 120
    var cupsRemaining = 9
    var moneyRemaining = 550

    enum class State {
        CHOOSE_ACTION, CHOSE_COFFEE
    }

    var currentState = State.CHOOSE_ACTION

    fun showState() {
        println("The coffee machine has:")
        println("$waterRemaining of water")
        println("$milkRemaining of milk")
        println("$coffeeRemaining of coffee beans")
        println("$cupsRemaining of disposable cups")
        println("$moneyRemaining of money")
    }

    fun buyEspresso() {
        println(when {
            waterRemaining < 250 -> "Sorry, not enough water!"
            coffeeRemaining < 16 -> "Sorry, not enough coffee!"
            cupsRemaining < 1 -> "Sorry, not enough cups!"
            else -> {
                waterRemaining -= 250
                coffeeRemaining -= 16
                cupsRemaining -= 1
                moneyRemaining += 4
                "I have enough resources, making you a coffee!"
            }
        })
    }

    fun buyLatte() {
        println(when {
            waterRemaining < 350 -> "Sorry, not enough water!"
            milkRemaining < 75 -> "Sorry, not enough milk!"
            coffeeRemaining < 20 -> "Sorry, not enough coffee!"
            cupsRemaining < 1 -> "Sorry, not enough cups!"
            else -> {
                waterRemaining -= 350
                milkRemaining -= 75
                coffeeRemaining -= 20
                cupsRemaining -= 1
                moneyRemaining += 7
                "I have enough resources, making you a coffee!"
            }
        })
    }

    fun buyCappuccino() {
        println(when {
            waterRemaining < 200 -> "Sorry, not enough water!"
            milkRemaining < 100 -> "Sorry, not enough milk!"
            coffeeRemaining < 12 -> "Sorry, not enough coffee!"
            cupsRemaining < 1 -> "Sorry, not enough cups!"
            else -> {
                waterRemaining -= 200
                milkRemaining -= 100
                coffeeRemaining -= 12
                cupsRemaining -= 1
                moneyRemaining += 6
                "I have enough resources, making you a coffee!"
            }
        })
    }

    fun fill() {
        val scanner = Scanner(System.`in`)
        println("Write how many ml of water do you want to add: ")
        val waterFill = scanner.nextInt()
        waterRemaining += waterFill
        println("Write how many ml of milk do you want to add: ")
        val milkFill = scanner.nextInt()
        milkRemaining += milkFill
        println("Write how many grams of coffee do you want to add: ")
        val coffeeFill = scanner.nextInt()
        coffeeRemaining += coffeeFill
        println("Write how many disposable cups of coffee do you want to add: ")
        val cupsFill = scanner.nextInt()
        cupsRemaining += cupsFill
    }

    private fun take() {
        println("I gave you $$moneyRemaining")
        moneyRemaining = 0
    }

    fun printChoseAction() {
        println("Write action (buy, fill, take, remaining, exit): ")
    }

    fun printChoseCoffee() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
    }

    fun startMachine() {
        printChoseAction()
    }

    fun doJob(inputString: String) {
        if (currentState == State.CHOOSE_ACTION) {
            when (inputString) {
                "remaining" -> showState()
                "buy" -> {
                    printChoseCoffee()
                    currentState = State.CHOSE_COFFEE
                    return
                }
                "fill" -> fill()
                "take" -> take()
            }
        } else if (currentState == State.CHOSE_COFFEE) {
            when (inputString) {
                "1" -> buyEspresso()
                "2" -> buyLatte()
                "3" -> buyCappuccino()
                "back" -> {
                }
            }

        }
        currentState = State.CHOOSE_ACTION
        printChoseAction()
    }
}


fun main() {
    val m = MachineItself
    m.currentState = MachineItself.State.CHOOSE_ACTION
    val scanner = Scanner(System.`in`)
    m.startMachine()
    var choice = scanner.next()
    while (choice != "exit") {
        m.doJob(choice)
        choice = scanner.next()
    }




    /*
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
    val choice = scanner.nextInt()
    println("Write how many cups of coffee you will need: ")

    println("Write how many ml of water the coffee machine has: ")
    val water = scanner.nextInt()
    println("Write how many ml of milk the coffee machine has: ")
    val milk = scanner.nextInt()
    println("Write how many grams of coffee beans the coffee machine has: ")
    var coffee = scanner.nextInt()
    println("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()
    val totalCups = if (water / 200 <= milk / 50 && water / 200 <= coffee / 15) {
        water / 200
    } else if (milk / 50 <= water / 200 && milk / 50 <= coffee / 15) {
        milk / 50
    } else {
        coffee / 15
    }
    println(if (totalCups == cups) {
        "Yes, I can make that amount of coffee"
    } else if (totalCups < cups) {
        "No, I can make only $totalCups cups of coffee"
    } else {
        "Yes, I can make that amount of coffee (and even ${totalCups - cups} more than that)"
    })
*/
}
