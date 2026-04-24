package jobsheet9;

import java.util.Scanner;

public class MahasiswaDemoJB09_11 {
    public static void main(String[] args) {
        StackTugasMahasiswa stack = new StackTugasMahasiswa(5);
        Scanner farel11 = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = farel11.nextInt();
            farel11.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Nama: ");
                    String nama = farel11.nextLine();
                    System.out.println("NIM: ");
                    String nim = farel11.nextLine();
                    System.out.println("Kelas: ");
                    String Kelas = farel11.nextLine();
                    mahasiswa11 mhs = new mahasiswa11(nama, nim, nim);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.Nama);
                    break;
                case 2:
                    mahasiswa11 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari "+ dinilai.Nama);
                        System.out.print("Masukan nilai (0-100): ");
                        int nilai = farel11.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.Nama, nilai);
                    }
                    break;
                case 3:
                    mahasiswa11 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh "+ lihat.Nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    }
            } while (pilih >= 1 && pilih <= 4);
                
            }
        }

    

