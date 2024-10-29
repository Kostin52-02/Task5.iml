fun main() {
    println("enter an integer n:")
    val nInput = readlnOrNull() ?: return
    println("enter the degree base x:")
    val xInput = readlnOrNull() ?: return

    try {
        val n = nInput.toInt()
        val x = xInput.toInt()

        var y = 0
        var power = 1

        while (power < n) {
            power *= x
            y++
        }

        if (power == n) {
            println("integer exponent y = $y")
        } else {
            println("the integer exponent does not exist.")
        }
    } catch (e: NumberFormatException) {
        println("please enter a valid integer.")
    }
}
