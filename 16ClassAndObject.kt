class Car{
    var company:String = ""
    var model: String = ""
    var year: Int = 0

    fun acceptData(a:String, b:String, c:Int){
        company=a
        model=b
        year=c
    }

    fun getInfo():String {
        return "$company $model $year"
    }

}
fun main()
{
    var carObj = Car()
//    carObj.company = "Tesla"
//    carObj.model = "Model X"
//    carObj.year = 2023
    carObj.acceptData("Tesla","Model X", 2023)
    var result = carObj.getInfo()
    println(result)

}