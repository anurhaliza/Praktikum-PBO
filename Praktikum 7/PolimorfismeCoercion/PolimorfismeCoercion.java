/*
* Nama file	: PolimorfismeCoercion.java
* Tanggal	: 03 Mei 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: 
*/

public class PolimorfismeCoercion {

	public static int kuadrat(int bilangan) {
		// Deklarasi objek integer
		Integer bilangan = 10;

		// Objek integer 'dipaksa' untuk diubah
		// Menjadi primitif
		int hasilKuadrat = kuadrat(bilangan);

		System.out.printf("Hasil kuadrat %d adalah %d", 
		bilangan,
		hasilKuadrat);
	}
}