fun datakembali(a:Int , b:Int): Int {
    var hasil = a + b
    return hasil
}
fun bagi(a: Int, z:Int):Int{
    if (z == 0){
        return 0
    }else{
        var total = a / z
        return total
    }

}
fun main(){
println(datakembali(20,20))
    val result = datakembali(200,100)
    println(result)
    println(bagi(10,0))
}