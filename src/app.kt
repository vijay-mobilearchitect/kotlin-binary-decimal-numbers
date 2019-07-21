import java.util.*


/*
    A Binary Number is made up of only 0s and 1s.
    110100
    Example of a Binary Number
    There is no 2, 3, 4, 5, 6, 7, 8 or 9 in Binary!

    A "bit" is a single binary digit. The number above has 6 bits.
 */
fun decimalToBinaryConsecutive(n: Int): Int {

    var number = n
    var maxConsecutiveNumber = 0
    var counter = 0

    while (number > 0) {

        if (number % 2 == 0) {
            counter = 0
        } else {
            counter++
            maxConsecutiveNumber = Math.max(maxConsecutiveNumber, counter)
        }
        number /= 2
    }

    return maxConsecutiveNumber
}

fun main() {
    val scanValue = Scanner(System.`in`)

    val n = scanValue.nextLine().trim().toInt()

    val result = decimalToBinaryConsecutive(n)

    println("The consecutive 1's of digit $n is $result")

}