/*
* Nama file	: Kubus.java
* Tanggal	: 21 Maret 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: File Class Kubus
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar bujurSangkar){
        this.permukaan = bujurSangkar;
    }

    public double hitungVolume(){
        return Math.pow(permukaan.getPanjangSisi(), 3);
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}