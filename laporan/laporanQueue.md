|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/Praktikum_ASD) |

# Labs #1 Programming Fundamentals Review

## Queue 

Kode program .

```
package jobsheet10;

public class Queue {
    int[] Data;
    int Front;
    int Rear;
    int Size;
    int Max;

    public Queue(int N) {
        Max = N;
        Data = new int[Max];
        Size = 0;
        Front = Rear = -1;
    }

    public boolean IsEmpty() {
        if (Size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (Size == Max) {
            return true;
        } else {
            return false;
        }
    }

    public void Peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdapan: " + Data[Front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int I = Front;
            while (I != Rear) {
                System.out.println(Data[I] + " ");
                I = (I + 1) % Max;
            }
            System.out.println(Data[I] + " ");
            System.out.println("Jumlah elemen = " + Size);
        }        
    }

    public void Clear() {
        if (!IsEmpty()) {
            Front = Rear = -1;
            Size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int DT) {
        if (IsFull()) {
            System.out.println("Qoueue sudah penuh! Program dihentikan");
            System.exit(1);
        } else {
            if (IsEmpty()) {
                Front =  Rear = 0;
            } else {
                if (Rear == Max - 1) {
                    Rear = 0;
                } else {
                    Rear++;
                }
            }
            Data[Rear] = DT;
            Size++;
        }
    }

    public int Dequeue() {
        int DT = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong! Program dihentikan");
            System.exit(1);
        } else {
            DT = Data[Front];
            Size--;
            if (IsEmpty()) {
                Front = Rear = -1;
            } else {
                if (Front == Max - 1) {
                    Front = 0;
                } else {
                    Front++;
                }
            }
        }
        return DT;
    }
}



```

Kode Program.
```
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

```
Hasil running.
```
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
4
Elemen terdapan: 15
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
```

