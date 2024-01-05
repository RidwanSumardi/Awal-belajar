fun main(){
    var mobile = arrayOf("Avanza","Fortuner","Alphad")
    println(mobile[0])

    /*
    Cara lain
     */
    var buah = arrayOf("apel","nanas","melon")
    buah += "durian"
    println(buah.joinToString())//joinToString()Fungsi ini berguna untuk menggabungkan elemen-elemen dari suatu koleksi ke dalam satu string dengan pemisah tertentu.

    /*
    dan perlu di ketahui bawah array mempunyai beberapa macam fungsi di antranya:
     arrayOf(), arrayOfNulls()atau emptyArray().*/
    /*
     arrayOf():
    Fungsi ini digunakan untuk membuat array dengan elemen yang sudah ditentukan.*/
    var nomor = arrayOf(1,2,3)
    println(nomor.joinToString())

    /*
    arrayOfNulls():
    Fungsi ini digunakan untuk membuat array dengan elemen-elemen null dan ukuran tertentu.
     */
    val nularay :Array<Int?> = arrayOfNulls(5)
    println(nularay.joinToString())
//Atau:
    val Peserta: Array<String?> = arrayOfNulls(10)
    Peserta[0] = "Ridwan"
    Peserta[1] = "Ahmad"
    Peserta[2] = "Rizaldi"
    Peserta[3] = "tOPIK"
    println(Peserta[3])

    /*
    emptyArray():
    Fungsi ini digunakan untuk membuat array kosong dengan tipe elemen tertentu.
     */
    val emptyStringArray = emptyArray<String>()
    println(emptyStringArray)




}