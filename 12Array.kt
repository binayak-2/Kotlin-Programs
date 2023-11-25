fun main(){

    val num = arrayOf(1,2,3,4,5,6,7,8,9,0)

    val x = num.get(0)
    println(x)

    println(num[2])

    println(num[3])
    num.set(3,10)
    println(num[3])

    num[3] = 4;
    println(num[3])

    //Traversing Arrays

    for (i in num.indices)
    {
        print(" "+num[i])
    }

    println()

    for(i in 0..num.size-1){
        print(" ${num[i]}")
    }

    println()

    num.forEach { index -> print(" $index") }
}

