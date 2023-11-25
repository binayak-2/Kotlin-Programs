fun main()
{
    var firstname:String? = "Binayak"

    var name = if(firstname!=null){
        firstname
    }else{
        "Unknown"
    }
    println(name)

    //This can be done using elvis operator ?:

    var name2 = firstname?:"Unknown Name"
    println(name2)
}