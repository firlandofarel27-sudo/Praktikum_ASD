package jobsheet16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SistemNilai {
    private static List<Mahasiswa11> daftarMahasiswa = new ArrayList<>(Arrays.asList(
        new Mahasiswa11("20001", "Thalhah",      "021xxx"),
        new Mahasiswa11("20002", "Zubair",       "021xxx"),
        new Mahasiswa11("20003", "Abdur-Rahman", "021xxx"),
        new Mahasiswa11("20004", "Sa'ad",        "021xxx"),
        new Mahasiswa11("20005", "Sa'id",        "021xxx"),
        new Mahasiswa11("20006", "Ubaidah",      "021xxx")
    ));
 
    private static List<MataKuliah> daftarMK = new ArrayList<>(Arrays.asList(
        new MataKuliah("00001", "Internet of Things",                        3),
        new MataKuliah("00002", "Algoritma dan Struktur Data",               2),
        new MataKuliah("00003", "Algoritma dan Pemrograman",                 2),
        new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data",     3),
        new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman",       3)
    ));
 
    // Daftar nilai dan antrian hapus (Queue - Tugas 2)
    private static List<Nilai>    daftarNilai  = new ArrayList<>();
    private static Queue<String>  antrianHapus = new LinkedList<>();
 
    private static Scanner sc = new Scanner(System.in);
 
    // ============================================================
    // MAIN
    // ============================================================
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            tampilMenu();
            System.out.print("Pilih    : ");
            String pilih = sc.nextLine().trim();
            switch (pilih) {
                case "1": inputNilai();           break;
                case "2": tampilNilai();          break;
                case "3": cariNilaiMahasiswa();   break;
                case "4": urutDataNilai();        break;
                case "5": prosesAntrianHapus();   break;
                case "6": running = false; System.out.println("Keluar..."); break;
                default:  System.out.println("Pilihan tidak valid!");
            }
        }
    }
 
    // ============================================================
    // MENU
    // ============================================================
    static void tampilMenu() {
        System.out.println("\n" + "*".repeat(48));
        System.out.println("  SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("*".repeat(48));
        System.out.println("  1. Input Nilai");
        System.out.println("  2. Tampil Nilai");
        System.out.println("  3. Mencari Nilai Mahasiswa");
        System.out.println("  4. Urut Data Nilai");
        System.out.println("  5. Hapus (Proses Antrian)");
        System.out.println("  6. Keluar");
        System.out.println("*".repeat(48));
    }
 
    // ============================================================
    // 1. INPUT NILAI
    // ============================================================
    static void inputNilai() {
        System.out.println("\nMasukan data");
 
        // Tampil & pilih mahasiswa
        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("*".repeat(48));
        System.out.printf("%-8s %-15s %-10s%n", "NIM", "Nama", "Telf");
        for (Mahasiswa11 mhs : daftarMahasiswa) System.out.println(mhs);
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = sc.nextLine().trim();
        Mahasiswa11 mhsTerpilih = cariMahasiswaByNim(nim);
        if (mhsTerpilih == null) { System.out.println("NIM tidak ditemukan!"); return; }
 
        // Tampil & pilih mata kuliah
        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("*".repeat(48));
        System.out.printf("%-8s %-40s %s%n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah mk : daftarMK) System.out.println(mk);
        System.out.print("Pilih MK by kode: ");
        String kode = sc.nextLine().trim();
        MataKuliah mkTerpilih = cariMKByKode(kode);
        if (mkTerpilih == null) { System.out.println("Kode MK tidak ditemukan!"); return; }
 
        System.out.print("Kode      : " + kode + "\nNilai     : ");
        double nilaiInput = Double.parseDouble(sc.nextLine().trim());
 
        daftarNilai.add(new Nilai(mhsTerpilih, mkTerpilih, nilaiInput));
        System.out.println("Data nilai berhasil ditambahkan.");
    }
 
    // ============================================================
    // 2. TAMPIL NILAI
    // ============================================================
    static void tampilNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("*".repeat(72));
        System.out.printf("%-8s %-15s %-40s %-5s %s%n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai n : daftarNilai) System.out.println(n);
    }
 
    // ============================================================
    // 3. CARI NILAI MAHASISWA
    // ============================================================
    static void cariNilaiMahasiswa() {
        tampilNilai();
        System.out.print("Masukkan data mahasiswa[nim] : ");
        String nim = sc.nextLine().trim();
 
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("*".repeat(72));
        System.out.printf("%-8s %-15s %-40s %-5s %s%n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
 
        boolean found = false;
        int totalSks = 0;
        for (Nilai n : daftarNilai) {
            if (n.getMahasiswa().getNim().equals(nim)) {
                System.out.println(n);
                totalSks += n.getMataKuliah().getSks();
                found = true;
            }
        }
        if (!found) System.out.println("Data tidak ditemukan.");
        else        System.out.println("Total SKS " + totalSks + " telah diambil.");
    }
 
    // ============================================================
    // 4. URUT DATA NILAI (ascending by nilai)
    // ============================================================
    static void urutDataNilai() {
        List<Nilai> sorted = new ArrayList<>(daftarNilai);
        sorted.sort(Comparator.comparingDouble(Nilai::getNilai));
 
        System.out.println("\nDAFTAR NILAI MAHASISWA (Ascending by Nilai)");
        System.out.println("*".repeat(72));
        System.out.printf("%-8s %-15s %-40s %-5s %s%n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai n : sorted) System.out.println(n);
    }
 
    // ============================================================
    // 5. HAPUS DATA VIA QUEUE (Tugas 2)
    //    - Masukkan NIM ke antrian, lalu proses satu per satu
    // ============================================================
    static void prosesAntrianHapus() {
        System.out.println("\n=== ANTRIAN HAPUS MAHASISWA (Queue) ===");
        System.out.print("Masukkan NIM yang ingin dihapus nilainya (ketik 'done' untuk selesai): ");
        while (true) {
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("done")) break;
            antrianHapus.offer(input);
            System.out.print("Tambah lagi (atau 'done'): ");
        }
 
        System.out.println("\nMemproses antrian hapus...");
        while (!antrianHapus.isEmpty()) {
            String nim = antrianHapus.poll();
            boolean removed = daftarNilai.removeIf(n -> n.getMahasiswa().getNim().equals(nim));
            if (removed) System.out.println("Data nilai mahasiswa NIM " + nim + " berhasil dihapus.");
            else         System.out.println("NIM " + nim + " tidak ditemukan di daftar nilai.");
        }
        System.out.println("Antrian selesai diproses.");
    }
 
    // ============================================================
    // HELPER: Cari mahasiswa dan MK
    // ============================================================
    static Mahasiswa11 cariMahasiswaByNim(String nim) {
        for (Mahasiswa11 m : daftarMahasiswa)
            if (m.getNim().equals(nim)) return m;
        return null;
    }
 
    static MataKuliah cariMKByKode(String kode) {
        for (MataKuliah mk : daftarMK)
            if (mk.getKode().equals(kode)) return mk;
        return null;
    }
}
