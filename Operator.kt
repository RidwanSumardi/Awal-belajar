fun main(){
    /* Variabe ada dua dalam kotlin yaitu imutibele dan muteble yang ini fungsi ny berbda antara keduanya
    * val adalah imutable yang hanya dapat digunakan cukup sekali saja
    * sedangkan var dapat digunakan berulang kali */

    //BAB VARIABEL

    println("penggunaan variabel imutable:")
    val Nama = "Ridwan"
//    Nama = "Sumardi" jika dipanggil lagi akan eror
    println("$Nama")

   println("penggunaan mutable :")
    var Jabatan = "Progremer"
    Jabatan = "Polisi" //disini dapat di panggil kembali variabel yang ditampung oleh var
    println("$Jabatan")


    //penjelasan Tipe Operator
//    Int (Integer): bilangan bulat, contoh 12, 1_000
//    String: teks, contoh "belajar kotlin asik"
//    Boolean: tipe data yang hanya bernilai true dan false
//    Float: bilangan pecahan, contoh 21.23, 1.3
//    Double: bilangan pecahan juga, tapi punya ukuran penyimpanan yang lebih besar dari Float.
//    Char: karakter, contoh 'A'
//    Unit: Tipe data yang hanya punya satu nilai, yaitu: objek Unit. Tipe data ini mirip seperti void pada Java.

//penggunaan Integer
   println("Penggunaan Int")
    var Anggota_A = 30;
    var Anggota_B = 50;
    println("Jumlah Anggota :${ Anggota_A + Anggota_B}")

//Pengunaan Boolean: tipe data yang hanya bernilai true dan false
//Mengunakan If Else

    val Tinggi_A = 120
    val Tinggi_B= 132
    if (Tinggi_A > Tinggi_B){
        println("Tinggi Normal")
    }else{
        println("Tinggi Masih Sedang")
    }

    //Penggunaan dengan .. di kotlin yang fungsinya
    // untuk menyeleksi apakah nomor tersebut masih kurang dari
    val nomor_pertama = 400
    if (nomor_pertama in 1..100){
        println(nomor_pertama)
    }else{
        println("Tidak Tersedia")
    }

    var nama = false
    var alamat = false
    var penyelesayan = nama || alamat
    println("$penyelesayan")

//    Terdapat juga method yang lainnya:
//
//    toInt() untuk mengubah ke integer;
//    toString() untuk mengubah ke String;
//    toDouble() untuk mengubah ke Double;
//    toLong() untuk mengubah ke long integer;
//    toShort() untuk mengubah ke short integer;
//    toChar() untuk mengubah ke Char atau karakter

//  penggunaan when di kotlin

 val menu = 4
    val hasil = when (menu){
        1 -> "nasi goreng"
        2 -> "nasi pecel"
        3 -> "rawon"
        4 -> "geprek"
        else -> "Menu tidak tersedia"
    }
    println(hasil)

    val nilai_semester = 80
    if (nilai_semester > 100){
        println("Nilai = A+")

    }else if (60 > 70){
        println("Nilai = B+")

    }else{
        println("Anda Harus Ngulang Semester Depan")

    }
    println("$nilai_semester")






















}
