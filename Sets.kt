
fun main()
{
    //immutable
    // set does not contain duplicate elements,
    // it will return only one element if there are more than one same elements

    val setA = setOf(10,2,30,4,5,5,6,7)
    val setB = setOf("Apple", "Ball", "ball", "Cat", "Cat", "Dog")

    for( nums in setA)
    {
        print(" $nums")
    }
    println()
    for( names in setB )
    {
        print(" $names")
    }
    println("\n ${setA.sum()} \n ${setA.average()} \n ${setA.max()} \n")

    //mutable set

    var mset = mutableSetOf(23, 56,27,87,54,32)
    for (m in mset){
        print(" $m ")
    }
    println()
    mset.add(35)
    mset.add(200)
    mset.add(200)
    for (m in mset){
        print(" $m ")
    }
    println()
    mset.remove(87)
    mset.remove(56)
    for (m in mset){
        print(" $m ")
    }

}