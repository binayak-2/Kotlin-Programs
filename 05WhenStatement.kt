fun main()
{
    //using when as a statement

    println("Enter the day of Week: ")
    val day:Int = readln().toInt()

    when(day){
        1 -> print("Sunday")
        2-> print("Monday")
        3-> print("Tuesday")
        4-> print("Wednesday")
        5-> print("Thursday")
        6-> print("Friday")
        7-> print("Saturday")
        else -> print("Invalid")
    }

    //using when as a expression

    println("Enter name of cricketer: ")
    val name:String = readln()

    val info = when(name){
        "Kushal Bhurtel" -> "Opening Batsmen"
        "Aasif" -> "Opening Batsmen"
        "Rohit" -> "Captain"
        "Sandeep" -> "Leg Spinner"
        "Dipendra" -> "All Rounder"
        else -> "Invalid Player Name"
    }

    println("The role of $name is $info")
}