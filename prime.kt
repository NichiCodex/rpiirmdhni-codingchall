fun main() {
    println("Program to display prime numbers in a range.")

    var start: Int = 0
    var end: Int = 0

    var inputValid = false

    do {
        val startInput = readInt("Enter the start value: ")
        val endInput = readInt("Enter the end value: ")

        if (startInput != null && endInput != null) {
            start = startInput
            end = endInput

            if (start <= 1 || end <= 1) {
                println("\nInvalid input. Both start and end values must be greater than 1.\n")
            } else if (start >= end) {
                println("\nInvalid input. The start value must be less than the end value.\n")
            } else {
                inputValid = true
            }
        } else {
            println("\nInvalid input. Please enter valid integers for start and end values.\n")
        }
    } while (!inputValid)

    println("Prime numbers between $start and $end are :")

    for (num in start..end) {
        if (isPrime(num)) {
            println(num)
        }
    }
}

fun readInt(prompt: String): Int? {
    print(prompt)
    val input = readLine()
    return try {
        input?.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }

    if (n <= 3) {
        return true
    }

    if (n % 2 == 0 || n % 3 == 0) {
        return false
    }

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false
        }
        i += 6
    }

    return true
}
