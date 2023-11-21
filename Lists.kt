fun main(){

    //immutable list
    var numlist = listOf(1,2,3,4,5,6,7)

    val firstNum = numlist[0]
    val lastNum = numlist[numlist.size - 1]

    println("The First Number: $firstNum");
    println("The Last Number: $lastNum")

   // numlist.add(2, 3) cannot because it is immutable

    for(i in numlist)
    {
        print(" "+i)
    }

    //mutable list

    var mnumlist = mutableListOf("Apple", "Ball", "Cat", "Dog", "Egg")

    println("\n"+mnumlist.size)
    println(mnumlist[3])
    mnumlist.add(2, "Fish")

    for (names in mnumlist)
    {
        print(" $names ")
    }

    mnumlist.remove("Egg")
    println()

    for(namess in mnumlist )
    {
        print(" $namess ")
    }

}