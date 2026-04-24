|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/Praktikum_ASD) |

# Labs #1 Programming Fundamentals Review

## 2.1.1

Kode program praktikum 1.

```
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
                    mahasiswa11 mhs = new mahasiswa11(nama, nim, nim);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs,nama);
                    break;
                case 2:
                    mahasiswa11 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari "+ dinilai.Nama);
                        System.out.print("Masukan nilai (0-100): ");
                        int nilai = farel11.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.Nama);
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

    

```

Hasil running.
```
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: 
Dila
NIM: 
1001
Kelas: 
1A
Tugas Dila berhasil dikumpulkan

Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: 
Erik
NIM: 
1002
Kelas: 
1B
Tugas Erik berhasil dikumpulkan

Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh Erik

Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: 
Tika
NIM: 
1003
Kelas: 
1C
Tugas Tika berhasil dikumpulkan

Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1001
Erik    1002    1002


Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 2
Menilai tugas dari Tika
Masukan nilai (0-100): 87
Nilai Tugas Tika adalah 87

Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1001


Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas

```


