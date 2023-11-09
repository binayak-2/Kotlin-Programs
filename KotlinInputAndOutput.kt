fun main()
{
    //The difference is println breaks line after printing
    print("Hello World")
    println("Hello World Again")
    print("Hello World Again Again")

    println("\nEnter text: ")
    var input = readLine()
    print("The input is $input")

    println("Enter two numbers: ")
    var num1 = readln()
    var intNum1 = num1.toInt()

    var num2 = readln()
    var intnum2 = num2.toInt()

    var sum = num1 + num2 //concatinates because they are not converted to int
    var addition = intNum1 + intnum2 //provides sum

    println("Sum value: $sum and addition value: $addition")
}