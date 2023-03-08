/*
* Nama file	: OperasiTitik.java
* Tanggal	: 1 Maret 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Kelas MOperasiTitik
*/

public class MOperasiTitik{

    public static void main (String[] args){
        Titik t = new Titik(4.0,4.0);
        OperasiTitik o = new OperasiTitik();

        System.out.println("Titik : (" + t.getAbsis()+", "+t.getOrdinat() +")");
        o.refleksiX(t); //hasil
        System.out.println("Titik : (" + t.getAbsis()+", "+t.getOrdinat() +")");
        o.refleksiY(t); //hasil
        System.out.println("Titik : (" + t.getAbsis()+", "+t.getOrdinat() +")");
    }
}