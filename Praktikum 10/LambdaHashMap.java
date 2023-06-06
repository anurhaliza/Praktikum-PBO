/*
* Nama file	: LambdaHashMap.java
* Tanggal	: 04 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Implementasi lambda pada hash map
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashmap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140147", "Aretha");
        mahasiswaMap.put("24060121140135", "Aliza");
        mahasiswaMap.put("24060121140101", "Diva" );

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama));
    }
}