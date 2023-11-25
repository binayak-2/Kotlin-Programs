class Info{
    constructor(name:String, age:Int){
        println("Name: $name")
        println("Age: $age")
    }
    constructor(salary:Double, Address:String){
        println("Salary: $salary")
        println("Address: $Address")
    }
}
fun main()
{
    Info("Binayak",20)
    Info(2000034.467,"Shivasatakshi")

}