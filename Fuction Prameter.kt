fun nama(namadepan:String,Namabelakang:String,Umur:Int ,Panggilan :String?){
    println("Apakah benar data anda: Nama Depan: $namadepan Nama Belang: $Namabelakang Umur: $Umur")
    if (Panggilan == null){
        println("$namadepan,$Namabelakang,$Umur")
    }else{
        println("$namadepan,$Namabelakang,$Umur,$Panggilan")
    }
}
fun main(){
    nama("Ridwan","Sumardi",20,"Iwan")
}