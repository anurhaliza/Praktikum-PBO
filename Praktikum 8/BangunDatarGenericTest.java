/*
* Nama file	: BangunDatarGenericTest.java
* Tanggal	: 17 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Main class generic untuk BangunDatar
*/

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran 1 - new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg =
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(1);
        System.out.println("keliling lingkaran: "+bdg.hitungKeliling());
        System.out.println("tipe generic: "+bdg.get().getClass().getName())
    }
}
