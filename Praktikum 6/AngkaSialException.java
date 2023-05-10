/*
* Nama file	: AngkaSialException.java
* Tanggal	: 29 Maret 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial!!!");
    }
}