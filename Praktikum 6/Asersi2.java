/*
* Nama file	: Asersil.java
* Tanggal	: 29 Maret 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Program untuk demo asersi yang akan menolak input 
*		  jari-jari lingkaran yang bernilai nol
*/

// class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

// class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari > 0): "Jari-jari tidak boleh nol!!!";
		Lingkaran 1 = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("Keliling lingkaran = "
			+kelilingLingkaran);
	}
}

/*
Ada yang kurang tepat pada program Asersi2 di atas?

Terdapat kondisi yang kurang tepat pada program di atas, yaitu pada bagian "assert(jariJari > 0): "Jari-jari tidak boleh nol!!!";" seharusnya menggunakan kondisi jariJari != 0. Hal ini dikarenakan program masih menerima masukkan angka negatif, sedangkan jariJari > 0 tidak menerima masukkan bernilai negatif.
*/