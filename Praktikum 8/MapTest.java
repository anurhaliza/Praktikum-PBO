/*
* Nama file	: MapTest.java
* Tanggal	: 17 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Program yang menggunakan Generic untuk pasangan Kunci=Nilai
*/

import java.util.*;

public class MapTest{
    public static void main(String[] args){
        // kunci -> integer, nilai -> string
        Map<integer, String> map = new HashMap<Integer, String>();
        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2. "dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
        // bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci ? tulis pada laporan anda!
        // petunjuk: gunakan iterasi seperti program ArrayListTest
    }
}