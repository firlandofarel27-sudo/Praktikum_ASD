package jobsheet10;

import java.util.Scanner;

public class AntrianKRSmain {
    public static void main(String[] args) {
        Scanner farel11 = new Scanner(System.in);

        AntrianKRS11 Antrian = new AntrianKRS11(10, 30);

        int Pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1.  Tambah Mahasiswa ke Antrian");
            System.out.println("2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Tampilkan Dua Antrian Terdepan");
            System.out.println("5.  Tampilkan Antrian Paling Akhir");
            System.out.println("6.  Jumlah Antrian");
            System.out.println("7.  Jumlah yang Sudah Proses KRS");
            System.out.println("8.  Jumlah Mahasiswa Belum Proses KRS");
            System.out.println("9.  Cek Antrian Kosong");
            System.out.println("10. Cek Antrian Penuh");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0.  Keluar");
            System.out.print("Pilih menu: ");
            Pilihan = farel11.nextInt();
            farel11.nextLine();       
            
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
                    mahasiswa11 MHS = new mahasiswa11(NIM, Nama, Prodi, Kelas);
                    Antrian.TambahAntrian(MHS);
                    break;                    
                case 2:
                    Antrian.PanggilKRS();
                    break;
                case 3:
                    Antrian.TampilkanSemua();
                    break;
                case 4:
                    Antrian.TampilkanduaTerdepan();
                    break;
                case 5:
                    Antrian.TampilkanAkhir();
                    break;
                case 6: 
                    System.out.println("Jumlah antrian saat ini: " + Antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah yang sudah proses KRS: " + Antrian.getTotalDilayani());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa belum proses KRS: " + Antrian.getMahasiswaBelumKRS());
                    break;
                case 9:
                    if (Antrian.IsEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 10:
                    if (Antrian.IsFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;
                case 11:
                    Antrian.KosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                    default:
                        System.out.println("Pilihan tidak valid.");
            }
        } while (Pilihan != 0);
    }
}
