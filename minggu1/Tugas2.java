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
