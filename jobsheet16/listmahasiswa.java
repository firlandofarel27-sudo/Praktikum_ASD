package jobsheet16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class listmahasiswa {
    List<mahasiswa> mahasiswas = new ArrayList<>();
 
    // ===== tambah() - menggunakan varargs (unlimited argument) =====
    public void tambah(mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
 
    // ===== hapus() berdasarkan index =====
    public void hapus(int index) {
        mahasiswas.remove(index);
    }
 
    // ===== hapus() berdasarkan NIM =====
    public void hapusByNim(String nim) {
        int index = linearSearch(nim);
        if (index != -1) {
            mahasiswas.remove(index);
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
 
    // ===== update() berdasarkan index =====
    public void update(int index, mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }
 
    // ===== tampil() menggunakan stream forEach =====
    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
 
    // ===== linearSearch() - pencarian berdasarkan NIM =====
    public int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }
 
    // ===== PERTANYAAN 2: binarySearch() =====
    public int binarySearch(String nim) {
        // Harus sorted dulu sebelum binary search
        List<mahasiswa> sorted = new ArrayList<>(mahasiswas);
        Collections.sort(sorted);
        int low = 0, high = sorted.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = sorted.get(mid).nim.compareTo(nim);
            if (cmp == 0) {
                // Temukan index di list asli
                return mahasiswas.indexOf(sorted.get(mid));
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
 
    // ===== PERTANYAAN 3: Sorting ascending dan descending =====
    public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
        System.out.println("Data diurutkan secara Ascending berdasarkan NIM:");
        tampil();
    }
 
    public void sortDescending() {
        mahasiswas.sort(Comparator.comparing((mahasiswa m) -> m.nim).reversed());
        System.out.println("Data diurutkan secara Descending berdasarkan NIM:");
        tampil();
    }
 
    // ===== MAIN METHOD =====
    public static void main(String[] args) {
        listmahasiswa lm = new listmahasiswa();
        mahasiswa m  = new mahasiswa("201234", "Noureen", "021xx1");
        mahasiswa m1 = new mahasiswa("201235", "Akhleema", "021xx2");
        mahasiswa m2 = new mahasiswa("201236", "Shannum", "021xx3");
 
        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
 
        // menampilkan list mahasiswa
        lm.tampil();
 
        // update mahasiswa
        lm.update(lm.linearSearch("201235"), new mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
 
        System.out.println("\n=== Binary Search NIM 201236 ===");
        int idx = lm.binarySearch("201236");
        System.out.println("Ditemukan di index: " + idx);
 
        System.out.println("\n=== Sorting Ascending ===");
        lm.sortAscending();
 
        System.out.println("\n=== Sorting Descending ===");
        lm.sortDescending();
    }
}
