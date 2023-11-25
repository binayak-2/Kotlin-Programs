fun main(){

    var str: String = "Trigonometry"

    //Accessing string
    println(str[0])
    println(str[1])

    for(i in str.indices){
        print(str[i]+"")
    }

    println("\nThe Length of string is ${str.length}")
    println(str.subSequence(2,5))



}

