package pertemuan11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner Farel11 = new Scanner(System.in);

        DoubleLinkedListPembeli antrean = new DoubleLinkedListPembeli();
        DoubleLinkedListPesanan pesanan = new DoubleLinkedListPesanan();

        int pilih;

        do {
            System.out.println("\n===== ROYAL DELISH =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilih = Farel11.nextInt();
            Farel11.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = Farel11.nextLine();

                    System.out.print("No HP : ");
                    String hp = Farel11.nextLine();

                    antrean.tambahAntrian(nama, hp);
                    break;

                case 2:
                    antrean.cetakAntrian();
                    break;

                case 3:
                    nodepembeli pembeli = antrean.hapusAntrian();

                    if (pembeli != null) {
                        System.out.println("Pembeli dipanggil:");
                        System.out.println("Nama : " + pembeli.data.namapembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = Farel11.nextInt();
                        Farel11.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = Farel11.nextLine();

                        System.out.print("Harga : ");
                        int harga = Farel11.nextInt();

                        pesanan p = new pesanan(kode, namaPesanan, harga);

                        pesanan.tambahPesanan(p);

                        System.out.println("Pesanan berhasil ditambahkan!");
                    }
                    break;

                case 4:
                    pesanan.laporanPesanan();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 5);

        Farel11.close();
    }
}
