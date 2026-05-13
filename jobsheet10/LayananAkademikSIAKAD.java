package jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner farel11 = new Scanner(System.in);
         AntrianLayanan Antrian = new AntrianLayanan(5);
         int Pilihan;

         do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian paling belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            Pilihan = farel11.nextInt(); farel11.nextLine();  
            
            switch (Pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String NIM = farel11.nextLine();
                    System.out.print("Nama  : ");
                    String Nama = farel11.nextLine();
                    System.out.print("Prodi : ");
                    String Prodi = farel11.nextLine();
                    System.out.print("Kelas : ");
                    String Kelas = farel11.nextLine();
                    mahasiswa MHS = new mahasiswa(NIM, Nama, Prodi, Kelas);
                    Antrian.TambahAntian(MHS);
                    break; 
                case 2:
                    mahasiswa diLayani = Antrian.LayaniMahasiswa();                
                    if (diLayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        diLayani.TampilkanData();
                    }
                    break;
                case 3:
                    Antrian.LihatTerdepan();
                    break;
                case 4:
                    Antrian.TampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + Antrian.getJumlahAntrian());
                    break;
                case 6:
                Antrian.lihatAkhir(); 
                break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (Pilihan != 0);
        farel11.close();
    }
}
