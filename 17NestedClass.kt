class CarDetails{
    var company:String = ""
    var model: String = ""
    var year: Int = 0


    fun acceptData(a:String, b:String, c:Int){
        company=a
        model=b
        year=c
    }

    class EngineInfo{
        var horsepower:Int = 0
        var cylinder:Int = 0

        fun setValues(a:Int, b:Int){
            horsepower = a
            cylinder = b
        }
        fun displayValue():String{
            return "HorsePower: $horsepower Cylinders: $cylinder"
        }
    }

    fun getInfo():String {
        return "$company $model $year"
    }

}
fun main()
{
    var nestedClass = CarDetails()
    nestedClass.acceptData("Tesla", "Model X", 2023)
    println(nestedClass.getInfo())

    var nestedCar = CarDetails.EngineInfo()
    nestedCar.setValues(250, 4)
    println(nestedCar.displayValue())

}