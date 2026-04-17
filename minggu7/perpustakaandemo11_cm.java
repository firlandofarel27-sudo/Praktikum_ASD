package minggu7;

import java.util.Scanner;

public class perpustakaandemo11_cm {
     public static void main(String[] args) {
    Scanner farel11 = new Scanner(System.in);

    mahasiswa11_cm[] MHS = {
            new mahasiswa11_cm("22001","Andi","TI"),
            new mahasiswa11_cm("22002","Sifa","TI"),
            new mahasiswa11_cm("22003","Doni","TI")
        };

          buku11_cm[] Buku = {
            new buku11_cm("B001","Algoritma",2020),
            new buku11_cm("B002","Basis Data",2019),
            new buku11_cm("B003","Pemrograman",2021),
            new buku11_cm("B004","Fisika",2024)
        };

        peminjaman11_cm[] Pinjam = {
            new peminjaman11_cm(MHS[0], Buku[0],7),
            new peminjaman11_cm(MHS[1], Buku[1],3),
            new peminjaman11_cm(MHS[2], Buku[2],10),
            new peminjaman11_cm(MHS[2], Buku[3],6),
            new peminjaman11_cm(MHS[0], Buku[1],4)
        };

        int Pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            Pilih = farel11.nextInt();

            switch (Pilih) {
                case 1:
                    for(mahasiswa11_cm m : MHS){
                        m.Tampil();
                    }
                    break;

                case 2:
                    for(buku11_cm b : Buku){
                        b.Tampil();
                    }
                    break;

                case 3:
                    for(peminjaman11_cm p : Pinjam){
                        p.Tampil();
                    }
                    break;

                case 4:
                    for(int i=1; i<Pinjam.length; i++){
                        peminjaman11_cm temp = Pinjam[i];
                        int j = i;
                        while(j>0 && Pinjam[j-1].Denda < temp.Denda){
                            Pinjam[j] = Pinjam[j-1];
                            j--;
                        }
                        Pinjam[j] = temp;
                    }
                    System.out.println("Data berhasil diurutkan!");
                    break;
            
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String Cari = farel11.next();

                     boolean ketemu = false;
                    for(peminjaman11_cm p : Pinjam){
                        if(p.MHS.NIM.equals(Cari)){
                            p.Tampil();
                            ketemu = true;
                        }
                    }
                    if(!ketemu){
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
            }
            peminjaman11_cm pinjam = new peminjaman11_cm(MHS, buku, 7);
pinjam.Tampil(); // tampil normal
pinjam.Cancel();
pinjam.Tampil(); // tampil status dibatalkan

        } while (Pilih != 6);
    }
}
