package Jobsheet12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner Farel11 = new Scanner(System.in);

        DoubleLinkedList dll = new DoubleLinkedList();

        int pilih;

        do {

            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Add Index");
            System.out.println("4. Insert After");
            System.out.println("5. Print");
            System.out.println("6. Print Reverse");
            System.out.println("7. Remove First");
            System.out.println("8. Remove Last");
            System.out.println("9. Remove After");
            System.out.println("10. Remove Index");
            System.out.println("11. Get First");
            System.out.println("12. Get Last");
            System.out.println("13. Get Index");
            System.out.println("14. Size");
            System.out.println("15. Keluar");

            System.out.print("Pilih menu : ");
            pilih = Farel11.nextInt();
            Farel11.nextLine();

            switch (pilih) {

                case 1:
                case 2:
                case 3:
                case 4:

                    System.out.print("NIM   : ");
                    String nim = Farel11.nextLine();

                    System.out.print("Nama  : ");
                    String nama = Farel11.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = Farel11.nextLine();

                    System.out.print("IPK   : ");
                    double ipk = Farel11.nextDouble();
                    Farel11.nextLine();

                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);

                    if (pilih == 1) {
                        dll.addFirst(mhs);
                    } else if (pilih == 2) {
                        dll.addLast(mhs);
                    } else if (pilih == 3) {
                        System.out.print("Index : ");
                        int idx = Farel11.nextInt();
                        dll.add(idx, mhs);
                    } else {
                        System.out.print("Masukkan NIM key : ");
                        String key = Farel11.nextLine();
                        dll.insertAfter(key, mhs);
                    }

                    break;

                case 5:
                    dll.print();
                    break;

                case 6:
                    dll.printReverse();
                    break;

                case 7:
                    dll.removeFirst();
                    break;

                case 8:
                    dll.removeLast();
                    break;

                case 9:
                    System.out.print("Masukkan NIM key : ");
                    String key = Farel11.nextLine();
                    dll.removeAfter(key);
                    break;

                case 10:
                    System.out.print("Index : ");
                    int idx = Farel11.nextInt();
                    dll.remove(idx);
                    break;

                case 11:
                    dll.getFirst();
                    break;

                case 12:
                    dll.getLast();
                    break;

                case 13:
                    System.out.print("Index : ");
                    int index = Farel11.nextInt();
                    dll.getIndex(index);
                    break;

                case 14:
                    System.out.println("Jumlah data : " + dll.size());
                    break;

                case 15:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 15);

        Farel11.close();
    }
}
