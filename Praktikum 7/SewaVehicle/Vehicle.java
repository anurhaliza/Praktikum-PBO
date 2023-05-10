/*
* Nama file	: Vehicle.java
* Tanggal	: 03 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Super Class Vehicle 
*/

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle price = "+fare);
    }
}