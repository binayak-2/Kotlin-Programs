fun multiply(a:Int, b:Int):Int{
    return a*b
}
fun main()
{
    println("Enter two numbers: ")
    var num1:Int = readln().toInt()
    var num2:Int = readln().toInt()
    println(multiply(num1, num2))

}

