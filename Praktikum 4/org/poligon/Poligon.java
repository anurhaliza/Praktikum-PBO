/*
* Nama file	: Poligon.java
* Tanggal	: 21 Maret 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: File Super Class Poligon
*/

package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public Poligon(){
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}