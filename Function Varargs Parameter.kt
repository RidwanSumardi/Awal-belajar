fun percobaan(vararg values : Int):Int { //funsing ):Int untuk mengembalikan nilai
    var total = 0
    for (value in values){
        total += value
    }
    return total  //Nilai yang di kembalikan
}
fun main(){
    var hasil = percobaan(10,10,10)
    println(hasil)
}