package com.example.bbp_firebase

class data_mahasiswa {
    var nim: String? = null
    var nama: String? = null
    var jurusan: String? = null
    var key: String? = null
    //Membuat Konstuktor kosong untuk membaca data snapshot
    constructor() {}
    constructor(nim: String?, nama: String?, jurusan: String?) {
        this.nim = nim
        this.nama = nama
        this.jurusan = jurusan
    }
}