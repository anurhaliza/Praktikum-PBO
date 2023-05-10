/*
* Nama file	: Programmer.java
* Tanggal	: 09 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Sub class dari class pegawai, berisi atribut dan metode untuk programmer
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: " + this.bonus);
    }
}

