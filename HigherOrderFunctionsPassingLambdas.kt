var lambdaexp = {println("Kotlin")}
fun higherFun(lambd:()->Unit){
    lambd()
}
fun main(){
    higherFun(lambdaexp)
}