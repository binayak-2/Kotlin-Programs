class OuterClass{
    var str = "Outer Class"

    inner class InnerClass{
        var str2 = " Inner Class"

        fun innerNested():String{
            var res = str.plus(str2)
            return res
        }
        
    }
}
fun main()
{
    var innerObj = OuterClass().InnerClass()
    println(innerObj.innerNested())
}