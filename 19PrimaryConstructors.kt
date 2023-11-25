class Add constructor(a: Int, b:Int){ //we can omit constructor keyword

    var num1:Int=a
    var num2:Int=b
    fun AddNum():Int{
        return num1+num2
    }
}
fun main()
{
    var obj = Add(2,4)
    println(obj.AddNum())
}
