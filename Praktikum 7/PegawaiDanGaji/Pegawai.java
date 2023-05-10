/*
* Nama file	: Pegawai.java
* Tanggal	: 05 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Super class yang akan diturunkan ke kelas manajer dan pegawai
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.printf("Nama : %s, Gaji pokok : %d \n", nama, gajiPokok);
    }
}