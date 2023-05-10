/*
* Nama file	: Manajer.java
* Tanggal	: 09 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Sub class dari class pegawai, berisi atribut dan metode untuk manajer
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
