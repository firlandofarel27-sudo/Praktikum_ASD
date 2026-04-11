|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/Praktikum_ASD) |

# Labs #1 Programming Fundamentals Review

## 2.4.1. Selection Solution

Kode program cm.

```
package minggu7;

public class mahasiswaberprestasi11 {
     mahasiswa11 [] ListMhs = new mahasiswa11[5];
    int Idx;

    void Tambah(mahasiswa11 M){
        if (Idx<ListMhs.length) {
            ListMhs[Idx]=M;
            Idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void Tampil(){
        for (mahasiswa11 M:ListMhs){
            M.TampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void BubbleSort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            for (int j = 1; j < ListMhs.length-i; j++) {
                if (ListMhs[j].IPK>ListMhs[j-1].IPK) {
                    mahasiswa11 tmp = ListMhs[j];
                    ListMhs[j]=ListMhs[j-1];
                    ListMhs[j-1]=tmp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            int IdxMin=i;
            for (int j = i+1; j < ListMhs.length; j++) {
                if (ListMhs[j].IPK < ListMhs[IdxMin].IPK) {
                    IdxMin=j;
                }
            }
            mahasiswa11 Tpm = ListMhs[IdxMin];
            ListMhs[IdxMin] = ListMhs[i];
            ListMhs[i] = Tpm;
        }
    }

    void InsertionSort(){
        for (int i = 1; i > ListMhs.length; i++) {
            mahasiswa11 Temp = ListMhs[i];
            int j=i;
            while (j > 0 && ListMhs[j - 1].IPK > Temp.IPK) {
                ListMhs[j] = ListMhs[j - 1];
                j--;
            }
            ListMhs[j] = Temp;
        }
    }
    int sequentialSearching(double cari){
        int posisi =-1;
        for (int j = 0; j < ListMhs.length; j++) {
            if (ListMhs[j].IPK==cari){
                posisi=j;
                break;
            }
        }
        return posisi;
}
void tampilposisi(double x, int pos){
    if (pos!=-1){
        System.out.println("data mahasiswa dengan IPK : "+x+" ditemukan pada indeks "+ pos);
    }
    else{
        System.out.println("data" +x+ "tidak ditemukan");
    }
}
void tampildatasearch(double x, int pos){
    if (pos!=-1){
        System.out.println("nim\t : "+ListMhs[pos].NIM);
        System.out.println("nama\t : "+ListMhs[pos].Nama);
        System.out.println("kelas\t : "+ListMhs[pos].Kelas);
        System.out.println("ipk\t : "+x);
    }
}
int findBinarySearch(double cari, int left, int right){
    int mid;
    if(right>=left){
        mid = (left+right)/2;
        if (cari == ListMhs[mid].IPK){
            return (mid);
        }
        else if (ListMhs[mid].IPK>cari){
            return findBinarySearch(cari, left, mid-1);
        }
        else {
            return findBinarySearch(cari, left, right);
        }
    }
    return -1;
}
}





```

Hasil running.
```
Masukkan Data Nahasiswa Ke-1
NIM     : 111
Nama    : ali
Kelas   : 2
IPK     : 3.1
Masukkan Data Nahasiswa Ke-2
NIM     : 222
Nama    : lia
Kelas   : 2
IPK     : 3.2
Masukkan Data Nahasiswa Ke-3
NIM     : 333
Nama    : luna
Kelas   : 2
IPK     : 3.3
Masukkan Data Nahasiswa Ke-4
NIM     : 444
Nama    : adi
Kelas   : 2
IPK     : 3.5
Masukkan Data Nahasiswa Ke-5
NIM     : 555
Nama    : sudi
Kelas   : 2
IPK     : 3.6
Nama: ali
NIM: 111
Kelas: 2
IPK: 3.1
----------------------------
Nama: lia
NIM: 222
Kelas: 2
IPK: 3.2
----------------------------
Nama: luna
NIM: 333
Kelas: 2
IPK: 3.3
----------------------------
Nama: adi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------------
Nama: sudi
NIM: 555
Kelas: 2
IPK: 3.6
----------------------------
-------------------
Pencarian Data
-------------------
masukan ipk mahasiswa yang dicari:
IPK: 3.2
menggunakan sequential searching
data mahasiswa dengan IPK : 3.2 ditemukan pada indeks 1
nim      : 222
nama     : lia
kelas    : 2
ipk      : 3.2
Data Mahasiswa Sebelum Sorting:
Nama: ali
NIM: 111
Kelas: 2
IPK: 3.1
----------------------------
Nama: lia
NIM: 222
Kelas: 2
IPK: 3.2
----------------------------
Nama: luna
NIM: 333
Kelas: 2
IPK: 3.3
----------------------------
Nama: adi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------------
Nama: sudi
NIM: 555
Kelas: 2
IPK: 3.6
----------------------------
Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) :
Nama: sudi
NIM: 555
Kelas: 2
IPK: 3.6
----------------------------
Nama: adi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------------
Nama: luna
NIM: 333
Kelas: 2
IPK: 3.3
----------------------------
Nama: lia
NIM: 222
Kelas: 2
IPK: 3.2
----------------------------
Nama: ali
NIM: 111
Kelas: 2
IPK: 3.1
----------------------------
Data yang sudah Terurut Menggunakan SELECTION SORT (ASC)
Nama: ali
NIM: 111
Kelas: 2
IPK: 3.1
----------------------------
Nama: lia
NIM: 222
Kelas: 2
IPK: 3.2
----------------------------
Nama: luna
NIM: 333
Kelas: 2
IPK: 3.3
----------------------------
Nama: adi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------------
Nama: sudi
NIM: 555
Kelas: 2
IPK: 3.6
----------------------------
Data yang sudah Terurut Menggunakan INSERTION SORT (ASC)
Nama: ali
NIM: 111
Kelas: 2
IPK: 3.1
----------------------------
Nama: lia
NIM: 222
Kelas: 2
IPK: 3.2
----------------------------
Nama: luna
NIM: 333
Kelas: 2
IPK: 3.3
----------------------------
Nama: adi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------------
Nama: sudi
NIM: 555
Kelas: 2
IPK: 3.6
----------------------------
```


