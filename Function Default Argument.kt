fun sapa(nama:String,Panggilan :String =""){
    println("Halo $nama $Panggilan")

}
/*
Parameter adalah sebuah data yang dibutuhkan oleh function kamu untuk nantinya diolah di dalam function.
Untuk menuliskan paramter, tulis nama variabel dari parameter terlebih dahulu. Penamaan variable digunakan untuk memanggil variabel di dalam function (seperti saya memanggil variabel nama untuk digabungkan dengan teks lainnya).
Setelah itu diikuti dengan tipe datanya, bisa String ataupun menggunakan tipe data yang lain, disesuaikan dengan kebutuhan.
 */
fun tambahan(angka1:Int = 1 ,angka2:Int = 3):Int{
    return angka1 + angka2 //Return dari function ini berguna untuk mendefinisikan apakah function kita memiliki return atau tidak. Jika memiliki return, maka kita perlu mendefinisikan tipe
                            // data apa yang dihasilkan oleh function yang kita buat.
}


fun main(){
    sapa("Ridwan")
    sapa("Ridwan Sumardi","Iwan")
    println(tambahan())
}