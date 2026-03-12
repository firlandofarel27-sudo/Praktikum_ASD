package minggu4;

import java.util.Scanner;

public class array {
     public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("  Program Menghitung IP Semester");
        System.out.println("===================================");
        Scanner sc = new Scanner(System.in);
        double Nilai [] = new double [8];
        String Huruf [] = new String[8];
        double Bobot [] = new double[8];
        String Matkul [] = {"Pancasila","Konsep Teknologi Informasi","Critical Thinking Dan Problem Solving","Matematika Dasar"
                            ,"Bahasa Ingris","Dasar Pemrograman","Praktikum Dasar Pemrograman","Kesehatan Dan Keselamatan Kerja"};
        int Sks [] = {2, 2, 2, 3, 2, 2, 3, 2};
        double TotalNilai = 0;
        int TotalSks = 0;

        for (int i = 0; i < Matkul.length; i++) {
                 System.out.print("Masukkan Nilai Angka Untuk MK " + Matkul[i] + " : ");
                    Nilai [i] = sc.nextDouble();
        }
        System.out.println("===================================");
        System.out.println("       Hasil Konveksi Nilai");
        System.out.println("==================================="); 

        for (int i = 0; i < Matkul.length; i++) {
            if (Nilai[i] > 80) Huruf[i] = "A";
            else if (Nilai[i] > 73) Huruf[i] = "B+";
            else if (Nilai[i] > 65) Huruf[i] = "B";
            else if (Nilai[i] > 60) Huruf[i] = "C+";
            else if (Nilai[i] > 50) Huruf[i] = "C";
            else if (Nilai[i] > 39) Huruf[i] = "D";
            else Huruf[i] = "E";
        }

        for (int i = 0; i < Matkul.length; i++) {
            if (Huruf[i].equals("A")) {
                Bobot[i] = 4.0;
            } else if (Huruf[i].equals("B+")) {
                Bobot[i] = 3.5;
            } else if (Huruf[i].equals("B")) {
                Bobot[i] = 3.0;
            } else if (Huruf[i].equals("C+")) {
                Bobot[i] = 2.5;
            } else if (Huruf[i].equals("C")) {
                Bobot[i] = 2.0;
            } else if (Huruf[i].equals("D")) {
                Bobot[i] = 1.0;
            } else {
                Bobot[i] = 0.0;
            }
        }

        System.out.printf("%-35s %18s %18s %18s\n", "Mata Kuliah", "Nilai Angka","Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < Matkul.length; i++) {
            System.out.printf("%-35s %13s %18s %19.1f\n", Matkul[i], Nilai[i], Huruf[i], Bobot[i]);
        }

        for (int i = 0; i < Matkul.length; i++) {
            TotalNilai += Bobot[i] * Sks[i];
            TotalSks += Sks[i];
        }
        
        double ip = TotalNilai / TotalSks;
        System.out.println("===================================");
        System.out.printf("IP : " + ip);

    }

}
