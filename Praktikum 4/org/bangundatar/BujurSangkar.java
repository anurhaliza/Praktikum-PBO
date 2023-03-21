/*
* Nama file	: BujurSangkar.java
* Tanggal	: 21 Maret 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: File Class Bujur Sangkar
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }

    public double hitungLuas(){
        return Math.pow(this.panjangSisi,2);
    }
}