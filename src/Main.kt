import javax.lang.model.type.NullType

fun main() {
    println("Hello, welcome to my basic calculator app in Kotlin...")
    println("MENU\nSelect the number that corresponds to the operation you want to perform")
    println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Bitwise\n7. Trigonometry\n")
    var userChoice: String = readLine() ?: ""

    if (userChoice == "1") {
        println("Addition Selected")
        println("Enter First Value")
        val firstInputValue: String? = readLine()
        println("Enter Second Value")
        val secondInputValue: String? = readLine()
        try {
            var num1: Float? = firstInputValue?.toFloat()
            var num2: Float? = secondInputValue?.toFloat()
            if (num1 == null || num2 == null){
                return
            }
            else{
                var additionResult: Float = num1 + num2
                println("Result of Addition: $additionResult")
            }
        }
        catch (nfe: NumberFormatException){
            println("Invalid Input. Please Enter a number\n")
        }
    }
    else if (userChoice.equals("2")) {
        println("Entered Subtraction Mode")
        println("Enter first number: ")
        var firstInputValue: String? = readLine()
    }
    else if (userChoice.equals("3")) {
        println("Multiplication Selected")
    }
    else if (userChoice.equals("4")) {
        println("Division selected")
    }
    else if (userChoice.equals("5")) {
        println("Modulus selected")
    }
    else if (userChoice.equals("6")) {
        println("Bitwise Selected")
    }
    else if (userChoice.equals("7")) {
        println("Trigonometry")
    }
    else {
        println("Invalid Selection")
    }
}

