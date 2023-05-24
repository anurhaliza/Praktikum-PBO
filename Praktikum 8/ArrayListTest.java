/*
* Nama file	: ArrayListTest.java
* Tanggal	: 16 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Program penggunaan objek ArrayList sebagai collection class
*/

import java.util.ArrayList;

public class ArrayListTest{
    public static void main (String[] args){
        // inisialisasi ArrayList yang hanya dapat berisi objek string
        ArrayLisy<String> strings = new ArrayLisy<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generic");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}