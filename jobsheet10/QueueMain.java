package jobsheet10;

import java.util.Scanner;

public class QueueMain {
    public static void Menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1.  Enqueue");
        System.out.println("2.  Dequeue");
        System.out.println("3.  Print");
        System.out.println("4.  Peek");
        System.out.println("5.  Clear");
        System.out.println("============================");
    }

    public static void main(String[] args) {
        Scanner Farel11 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int N = Farel11.nextInt();

        Queue Q = new Queue(N);

        int Pilih;

        do {
            Menu();
            Pilih = Farel11.nextInt();
            switch (Pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int DataMasuk = Farel11.nextInt();
                    Q.Enqueue(DataMasuk);
                    break;
                case 2:
                    int DataKeluar = Q.Dequeue();
                    if (DataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + DataKeluar);
                    } 
                    break;
                case 3:
                    Q.Print();
                    break;
                case 4: 
                    Q.Peek();
                    break;
                case 5:
                    Q.Clear();
                    break;
            }
        } while (Pilih == 1 || Pilih ==2 || Pilih == 3 || Pilih ==4 || Pilih ==5);
    }
}
