fun main(){
//    val range = 1..100
    val range = 100 downTo 1 step 2// untuk terbalek
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.last)
    println(range.step)



}