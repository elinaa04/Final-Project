import java.util.Scanner;

public class dataPasien {
    int nomor;
    String[] namaPasien;
    int []umur;
    String []penyakit;
    String []alamat;
    String[] pasien; 
    int size; 

    public dataPasien(int kapasitas) { 
        pasien = new String[kapasitas];
        namaPasien = new String[kapasitas];
        umur = new int[kapasitas];
        penyakit = new String[kapasitas];
        alamat = new String[kapasitas];
        size = 0;
    }

    // method menambahkan data pasien
    public void addDataPasien(Scanner sc) {
        if (size < pasien.length) {
            System.out.print("Masukkan nomor antrian pasien : ");
            pasien[size] = sc.nextLine();
            
            System.out.print("Masukkan nama pasien\t : ");
            namaPasien[size] = sc.nextLine();
            
            System.out.print("Masukkan umur pasien\t : ");
            umur[size] = sc.nextInt();
            
            sc.nextLine(); 
            System.out.print("Masukkan penyakit pasien : ");
            penyakit[size] = sc.nextLine();
            
            System.out.print("Masukkan alamat pasien\t : ");
            alamat[size] = sc.nextLine();
            
            size++;
            System.out.println("Data pasien berhasil ditambahkan.");
        } else {
            System.out.println("Pasien sudah penuh.");
        }
    }
    
    //method menghapus data pasien
    public void removeDataPasien(int index) {
    if (index >= 0 && index < size) {
        String pasienHapus = pasien[index]; 
        pasien[index] = null; 
        size--;
        System.out.println("Pasien " + pasienHapus + " telah dihapus dari data pasien.");
    } else {
        System.out.println("Index tidak ditemukan.");
    }
    }

    //method menampilkan data 
    public void displayDataPasien() {
    if (size == 0) {
        System.out.println("Tidak ada data pasien.");
    } else {
        for (int i = 0; i < size; i++) {
            System.out.println("Nomor           : " + (i + 1));
            System.out.println("Nama            : " + namaPasien[i]);
            System.out.println("Umur            : " + umur[i]);
            System.out.println("Keluhan         : " + penyakit[i]);
            System.out.println("Alamat          : " + alamat[i]);
            System.out.println("--------------------------");
        }
    }
    }
}
