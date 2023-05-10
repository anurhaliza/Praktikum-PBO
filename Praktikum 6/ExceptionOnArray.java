/*
* Nama file	: ExceptionOnArray.java
* Tanggal	: 29 Maret 2023
* Pembuat	: Ajeng Nurhaliza Ar Rachman
* NIM/Lab	: 24060121140109 / B1
* Deskripsi	: Program pengguna eksepsi menggunakan class Library Java
*/

public class ExceptionOnArray{
    public static void main(String[] args){
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("clean up code...");
        }
    }
}