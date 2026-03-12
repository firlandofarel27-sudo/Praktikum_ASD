|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/Praktikum_ASD) |

# Labs #1 Programming Fundamentals Review

## 2.4.1. Selection Solution

Kode program pemilihan.

```
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
```

Hasil running.
```
Mata Kuliah                                Nilai Angka        Nilai Huruf        Bobot Nilai
Pancasila                                    85.0                  A                 4.0
Konsep Teknologi Informasi                   90.0                  A                 4.0
Critical Thinking Dan Problem Solving         120.0                  A                 4.0
Matematika Dasar                             70.0                  B                 3.0
Bahasa Ingris                                80.0                 B+                 3.5
Dasar Pemrograman                            76.0                 B+                 3.5
Praktikum Dasar Pemrograman                  80.0                 B+                 3.5
Kesehatan Dan Keselamatan Kerja              31.0                  E                 0.0
===================================
IP : 3.1944444444444446
```

## 2.3.1 Praktikum perulangan
Kode program perulangan

```
package minggu4;

import java.util.Scanner;

public class perulangan11 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nim, n = 0;

        System.out.print("Masukkan 2 Angka Nim Terakhir Anda : ");
        n = sc.nextInt();

        while (n < 10) {
            System.out.println(n += 10);
        }
        for (int i = 1; i < n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("#");
            } else if (i % 2 == 0) {
                System.out.print(i);
            } else {
                System.out.print("*");
            }
        }
     }
    }


```
Hasil running

```
Masukkan 2 Angka Nim Terakhir Anda : 31
*2#4*#*8#*#*1416*#*20#22*#*26#28*#
```
## 2.2.1 Praktikum Pemilihan

Kode program
```
package minggu4;

import java.util.Scanner;

public class NilaiAkhir {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = sc.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
        String nilaiHuruf, keterangan;

        if (nilaiAkhir > 80) nilaiHuruf = "A";
        else if (nilaiAkhir > 73) nilaiHuruf = "B+";
        else if (nilaiAkhir > 65) nilaiHuruf = "B";
        else if (nilaiAkhir > 60) nilaiHuruf = "C+";    
        else if (nilaiAkhir > 50) nilaiHuruf = "C";
        else if (nilaiAkhir > 39) nilaiHuruf = "D";
        else nilaiHuruf = "E";

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C"))
            keterangan = "SELAMAT ANDA LULUS";
        else
            keterangan = "ANDA TIDAK LULUS";

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Keterangan  : " + keterangan);

        sc.close();
}
}
```
Hasil Running
```
Program Menghitung Nilai Akhir
==============================
Masukkan nilai tugas: 85
Masukkan nilai kuis: 90
Masukkan nilai UTS: 80
Masukkan nilai UAS: 87
==============================
==============================
Nilai Akhir : 93.80000000000001
Nilai Huruf : A
Keterangan  : SELAMAT ANDA LULUS
```
## 2.5.1 Praktikum Fungsi

Kode program
```
package minggu4;

public class Fungsi {
    static int[][] Stok = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}    
    };

    static int[] Harga = {75000, 50000, 60000, 10000};
    static String[] NamaCabang = {
        "RoyalGarden 1",
        "RoyalGarden 2",
        "RoyalGarden 3",
        "RoyalGarden 4"
    };

    public static void TampilPendapatan() {
        System.out.println("=== PENDAPATAN SETIAP CABANG ===");

        for (int i = 0; i < Stok.length; i++) {
            int TotalPendapatan = 0;

            for (int j = 0; j < Stok[i].length; j++) {
                TotalPendapatan += Stok[i][j] * Harga[j];
            }

            System.out.println(NamaCabang[i] + 
                " = Rp " + TotalPendapatan);

            tampilStatus(TotalPendapatan);
            System.out.println();
        }
    }
    
    public static void tampilStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            System.out.println("Status : Sangat Baik");
        } else {
            System.out.println("Status : Perlu Evaluasi");
        }
    }

    public static void main(String[] args) {
        TampilPendapatan();
    }

}
```
Hasil Running
```
Status : Sangat Baik

RoyalGarden 2 = Rp 1660000
Status : Sangat Baik

RoyalGarden 3 = Rp 1300000
Status : Perlu Evaluasi

RoyalGarden 4 = Rp 1535000
Status : Sangat Baik
```
## Tugas 1

Kode program
```
package minggu4;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [] Kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char [][] Kota = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.print("Maukkan Plat Nomor : ");
        char cariKode = Character.toUpperCase(sc.next().charAt(0));

        boolean ditemukan = false;

        for (int i = 0; i < Kode.length; i++) {
            if ( cariKode == Kode[i]) {
                System.out.print("Nama Kota : ");

                for (int j = 0; j < Kota[i].length; j++) {
                    System.out.print(Kota [i][j]);
                }
                System.out.println();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode Plat Tidak Valid!");
        }
    }

}
```
Hasil Running
```
Maukkan Plat Nomor : n 2541631
Nama Kota : MALANG
```

## Tugas 2

Kode Program
```
package minggu4;

import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void inputJadwal(String[][] Jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            Jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            Jadwal[i][1] = sc.nextLine();

            System.out.print("Hari Kuliah      : ");
            Jadwal[i][2] = sc.nextLine();

            System.out.print("Jam Kuliah       : ");
            Jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua(String[][] Jadwal, int n) {
        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.printf("%-25s %-20s %-15s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-15s %-15s\n",
                    Jadwal[i][0],
                    Jadwal[i][1],
                    Jadwal[i][2],
                    Jadwal[i][3]);
        }
    }

    public static void cariBerdasarkanHari(String[][] Jadwal, int n) {
        System.out.print("\nMasukkan Hari yang dicari : ");
        String cariHari = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (Jadwal[i][2].equalsIgnoreCase(cariHari)) {
                System.out.println(Jadwal[i][0] + " | " +
                                   Jadwal[i][1] + " | " +
                                   Jadwal[i][2] + " | " +
                                   Jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void cariBerdasarkanMatkul(String[][] Jadwal, int n) {
        System.out.print("\nMasukkan Nama Mata Kuliah : ");
        String cariMatkul = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (Jadwal[i][0].equalsIgnoreCase(cariMatkul)) {
                System.out.println(Jadwal[i][0] + " | " +
                                   Jadwal[i][1] + " | " +
                                   Jadwal[i][2] + " | " +
                                   Jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah : ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] Jadwal = new String[n][4];

        inputJadwal(Jadwal, n);
        tampilSemua(Jadwal, n);
        cariBerdasarkanHari(Jadwal, n);
        cariBerdasarkanMatkul(Jadwal, n);
    }

}
```
Hasil Running
```
Nama Mata Kuliah : Fisika
Ruang            : 2
Hari Kuliah      : selasa
Jam Kuliah       : 8

=== DAFTAR JADWAL KULIAH ===
Mata Kuliah               Ruang                Hari            Jam
---------------------------------------------------------------------
PASD                      5                    Rabu            7
Fisika                    2                    selasa          8

```