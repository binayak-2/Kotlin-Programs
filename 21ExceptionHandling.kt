//fun main()
//{
//    try{
//        var a:Int = 12/0
//        println(a)
//    }catch(e:ArithmeticException){
//        println("Divide by zero is not possible")
//    }finally{
//        println("This block is always executed irrespective of exception occurance")
//    }
//}

fun main()
{
    try{
        var arr = arrayOf(1,2,3,4,5)
        println(arr[3])
        println(arr[7])
    }
    catch(e:ArrayIndexOutOfBoundsException)
    {
        println("This custom message will be printed")
    }
    finally{
        println("This block is always executed irrespective of exception occurance")
    }

}