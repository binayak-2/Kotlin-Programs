fun main()
{
    val map = mapOf(1 to "Sunday", 2 to "Monday", 3 to "Tuesday")
    println("Map: $map")
    println("Map Keys: ${map.keys}")
    println("Map Values: ${map.values}")
    println(map[2])
    var day = "Wednesday"

    if(map.containsValue(day)){
        println("Contains day value")
    }else{
        println("Does not contains day value")
    }

    var ind = 4
    var answer = map.containsKey(ind)
    println(answer)

    var maps2 = mutableMapOf("Apple" to 1, "Ball" to 4)
    println(maps2)
    maps2.put("Cat", 5)
    println(maps2)
    maps2.remove("Apple")
    println(maps2)
}