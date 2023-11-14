fun sum(a:Int, b:Int):Int{return a+b}
fun higherOrderFun(addFun:(Int, Int)->Int){
    println(addFun(5,8))
}
fun main()
{
    higherOrderFun(::sum)
}