/*
* Nama file	: LambdaList.java
* Tanggal	: 04 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Implementasi lambda pada list, digunakan sebagai parameter pada method.
*/

import java.util.ArrayList;

 public class LambdaList {
     public static void main(String[] args) {
         ArrayList<String> mahasiswaList = new ArrayList<>();
         mahasiswaList.add("Aretha");
         mahasiswaList.add("Aliza");
         mahasiswaList.add("Afra");
         mahasiswaList.add("Diva");
 
         //lambda digunakan sebagai parameter pada method
         mahasiswaList.forEach((nama) -> System.out.println(nama));
     }
 }