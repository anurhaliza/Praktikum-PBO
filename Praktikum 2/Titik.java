/*
* Nama file	: OperasiTitik.java
* Tanggal	: 1 Maret 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Kelas Titik
*/

class Titik {
	private Double absis;
	private Double ordinat;
	private static Double counterTitik;
	
	public Titik(){
		counterTitik++;
	}

    	Titik(double a, double b){
      	absis = a;
        	ordinat = b;
        	counterTitik++;
    		}

		public void setAbsis(double a){
			absis = a;
		}

		public void setOrdinat(double o){
			ordinat = o;
		}

		public double getAbsis(){
			return absis;
		}

		public double getOrdinat(){
			return ordinat;
		}

		public double getCounterTitik(){
			return counterTitik;
		}
}