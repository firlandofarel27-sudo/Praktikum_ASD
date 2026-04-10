package Jobsheet6;

import java.util.Scanner;

public class mahasiswademo11 {
   public static void main(String[] args) {
        //MahasiswaBerprestasi21 List = new MahasiswaBerprestasi21();
       Scanner farel11 = new Scanner(System.in);
        mahasiswaberprestasi11 List = new mahasiswaberprestasi11();
        int JmlMhs = 5;

        for (int i = 0; i < JmlMhs; i++) {
            System.out.println("Masukkan Data Nahasiswa Ke-" + (i+1));
            System.out.print("NIM     : ");
            String NIM = farel11.nextLine();
            System.out.print("Nama    : ");
            String Nama = farel11.nextLine();
            System.out.print("Kelas   : ");
            String Kelas = farel11.nextLine();
            System.out.print("IPK     : ");
            String InputIPK = farel11.nextLine();
            double IPK = Double.parseDouble(InputIPK);

            mahasiswa m = new mahasiswa(NIM, Nama, Kelas, IPK);
            List.Tambah(m);
        }
        //Mahasiswa21 M1 = new Mahasiswa21("123", "Zidan", "2A", 3.2);
        //Mahasiswa21 M2 = new Mahasiswa21("124", "Ayu", "2A", 3.5);
        //Mahasiswa21 M3 = new Mahasiswa21("125", "Sofi", "2A", 3.1);
        //Mahasiswa21 M4 = new Mahasiswa21("126", "Sita", "2A", 3.9);
        //Mahasiswa21 M5 = new Mahasiswa21("127", "Miki", "2A", 3.7);

        //List.Tambah(M1);
        //List.Tambah(M2);
        //List.Tambah(M3);
        //List.Tambah(M4);
        //List.Tambah(M5);

        System.out.println("Data Mahasiswa Sebelum Sorting: ");
        List.Tampil();

        System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) : ");
        List.BubbleSort();
        List.Tampil();

        System.out.println("Data yang sudah Terurut Menggunakan SELECTION SORT (ASC)");
        List.SelectionSort();
        List.Tampil();
        
        System.out.println("Data yang sudah Terurut Menggunakan INSERTION SORT (ASC)");
        List.InsertionSort();
        List.Tampil();

    }
}

