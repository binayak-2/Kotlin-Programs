fun main()
{
    var name:String? = /*null*/ "binayak"

    if(name != null){

        println(name.uppercase())

    }else{
        null
    }
    println(name)

    //This whole if block can be replaced by SafeCallOperator ?.

    var a = name?.uppercase()
    println(a)
}