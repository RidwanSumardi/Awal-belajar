fun datamahasiswa(
    Nama:String,
    Alamat: String? = null,
    Jurusan:String,
    Umur:Int){
    println("Hai...$Nama $Alamat $Jurusan $Umur")
}
fun main(){
    datamahasiswa("Ridwan", "Paiton", "Informatika", 20)
    //vontoh namedt argument
    datamahasiswa(Alamat = null, Nama = "Ridwan", Umur = 20, Jurusan = "IF")
}