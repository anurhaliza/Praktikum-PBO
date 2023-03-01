/**
* Nama File: Titik.java (22 Maret 2023)
* Nama/NIM: Ajeng Nurhaliza Ar Rachman/24060121140109
* Deskripsi: Program kelas Titik
**/

class Titik {
	Double absis;
	Double ordinat;
	static Double counterTitik;
	
	void Titik(){}
	void setAbsis(Double a){
		absis = a;
	}	

	void setOrdinat(Double o){
			ordinat = o;
	}

	Double getAbsis() {
			return absis;
	}

	Double getOrdinat() {
			return ordinat;
	}

	static Double getCounterTitik(){
		return counterTitik;
	}
}
