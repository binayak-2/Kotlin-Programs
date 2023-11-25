fun main(){

    var a:Int = 23
    val b:Int = 34
    println("The Values are $a and $b")

    a=37
    println("The new value of a is $a")

    //This gives error because value in val variable type can only be assigned once
    //b=56
    println("The new value of b is $b")

    var name:String
    name = "Binayak"
    println("Name: $name")

//  Error because variable must either have a type annotation or be initialized
//    var name2
//    name2="Binayak2"
//    println("Name2: $name2")

}