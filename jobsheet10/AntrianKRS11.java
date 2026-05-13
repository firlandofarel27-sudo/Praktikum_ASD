package jobsheet10;

public class AntrianKRS11 {
    mahasiswa11[] Data;
    int Front;
    int Rear;
    int Size;
    int Max;
    int TotaldiLayani;
    int MaxdiLayaniDPA;

    public AntrianKRS11(int Max, int MaxdiLayaniDPA) {
        this.Max = Max;
        this.MaxdiLayaniDPA = MaxdiLayaniDPA;
        this.Data = new mahasiswa11[Max];
        this.Front = 0;
        this.Rear = -1;
        this.Size = 0;
        this.TotaldiLayani = 0;
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

    public void KosongkanAntrian() {
        if ( !IsEmpty()) {
            Front = 0;
            Rear = -1;
            Size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian sudah kosong.");
        }
    }

    public void TambahAntrian(mahasiswa11 MHS) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        Rear = (Rear + 1) % Max;
        Data[Rear] = MHS;
        Size++;
        System.out.println(MHS.Nama + " Berhasil masuk ke antrian. Nomor Antrian: " + Size);
    }

    public void PanggilKRS() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa untuk diproses.");
            return;
        }
        System.out.println("Memanggil mahasiswa untuk proses KRS:");
        System.out.println("NIM - Nama - Prodi - Kelas");
        int JumlahdiPanggil = 0;
        for (int i = 0; i < 2; i++) {
            if (IsEmpty()) {
                System.out.println("Tidak ada mahasiswa lagi di antrian.");
                break;
            }
            if (TotaldiLayani >= MaxdiLayaniDPA) {
                System.out.println("DPA sudah mencapai batas maksimal " + MaxdiLayaniDPA);
                break;
            }
            mahasiswa11 MHS = Data[Front];
            Front = (Front + 1) % Max;
            Size--;
            TotaldiLayani++;
            JumlahdiPanggil++;
            System.out.print(JumlahdiPanggil + ". ");
            MHS.TampilkanData();
        }
    }

    public void TampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar mahasiwa dalam antrian: ");
        System.out.println("NIM - Nama - Prodi - Kelas");
        for (int i = 0; i < Size; i++) {
            int Index = (Front + i) % Max;
            System.out.print((i + 1) + ". ");
            Data[Index].TampilkanData();
        }
    }

    public void TampilkanduaTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Dua Mahasiswa Terdepan: ");
        System.out.println("NIM - Nama - Prodi - Kelas");
        for (int i = 0; i < 2; i++) {
            if (i >= Size) {
                System.out.println("Tidak ada mahsiswa lagi.");
                break;
            }
            int Index = (Front + i) % Max;
            System.out.print((i +1) + ". ");
            Data[Index].TampilkanData();
        }
    }

    public void TampilkanAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir: " );
            System.out.println("NIM - Nama - Prodi - Kelas");
            Data[Rear].TampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return Size;
    }

    public int getTotalDilayani() {
        return TotaldiLayani;
    }

    public int getMahasiswaBelumKRS() {
        return Size;
    }
}
