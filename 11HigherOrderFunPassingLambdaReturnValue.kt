var lambdaexp2 = {a:Int, b:Int -> a+b}

fun higherFunc(lamdb:(Int, Int)->Int){
    var result = lamdb(3,6)
    println("Sum is $result")
}
fun main(){
    higherFunc(lambdaexp2)
}