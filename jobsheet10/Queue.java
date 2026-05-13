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

