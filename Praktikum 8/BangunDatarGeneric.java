/*
* Nama file	: BangunDatarGeneric.java
* Tanggal	: 17 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Kelas konstruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

// Penggantian karakter 'T' menjadi karakter T1 atau lainnya merupakan metode pemberian nama agar lebih deskriptif
// untuk parameter generik yang digunakan untuk memberikan fleksibilitas dalam penggunaan data dan juga digunakan sebagai
// pembeda ketika digunakan lebih dari satu parameter generik dalam kelas tersebut.