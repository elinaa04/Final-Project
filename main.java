import java.util.Scanner;

public class main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    dataPasien pasienData = new dataPasien(100);
    antrian antrianPemeriksaan = new antrian(10);

    int pilihan = 0;
    while (pilihan != 7) {
        System.out.println("\n--- MANAGEMENT PUSKESMAS ---");
        System.out.println("\n=========== Menu ===========");
        System.out.println("1. Tambah Data Pasien");
        System.out.println("2. Hapus Data Pasien");
        System.out.println("3. Tampilkan Data Pasien");
        System.out.println("4. Tambah Antrian Pemeriksaan"); 
        System.out.println("5. Panggil Pasien");    
        System.out.println("6. Tampilkan Antrian");
        System.out.println("7. Keluar");
        System.out.println("-------------------------------");
        System.out.print("Pilih menu : ");
        pilihan = scanner.nextInt();
        scanner.nextLine();
    
        switch (pilihan) {
            case 1:
                pasienData.addDataPasien(scanner);
                break;
            case 2:
                System.out.print("Masukkan index pasien yang ingin dihapus : ");
                int indexHapus = scanner.nextInt();
                scanner.nextLine();
                pasienData.removeDataPasien(indexHapus);
                break;
            case 3:
                System.out.println("\n---Daftar Data Pasien---");
                pasienData.displayDataPasien();
                break;
            case 4:
                System.out.print("Masukkan nomor antrian pasien untuk ditambahkan ke antrian : ");
                int nomorPasien = scanner.nextInt();
                scanner.nextLine();
                if (nomorPasien >= 1 && nomorPasien <= pasienData.size) {
                    String namaPasien = pasienData.pasien[nomorPasien - 1];
                    antrianPemeriksaan.tambahAntrian(namaPasien);
                } else {
                    System.out.println("Nomor antrian pasien tidak valid.");
                }
                break;
            case 5:
                antrianPemeriksaan.panggilAntrian();
                break;
            case 6:
                System.out.println();
                System.out.println("---Antrian saat ini---");
                antrianPemeriksaan.tampilkanAntrian();
                break;
            case 7:
                System.out.println("Keluar dari program. Program selesai.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih menu kembali.");
            }
        }
        
        scanner.close();
    }
}