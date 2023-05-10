/*
* Nama file	: Car.java
* Tanggal	: 03 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Sub class Car extend dari super class Vehicle
*/

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = "+fare);
    }
}