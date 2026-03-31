|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/Praktikum_ASD) |

# Labs #1 Programming Fundamentals Review

## 2.4.1. Selection Solution

Kode program pemilihan.

```
package minggu5;

public class Mahasiswa11 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa11(){
    }
    public Mahasiswa11(String name, String nim, double ipk, String kls){
        nama = name;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
        System.out.println("----------------------");
    }
    void ubahKelas(String KelasBaru){
        kelas = KelasBaru;
    }
    void updateIpk(double ipkBaru){
        if (ipkBaru <= 4.0 && ipkBaru >= 0.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK Tidak Valid. Harus Antara 0.0 Dan 4.0");
        }
    }
    String nilaiKinerja(double Ipk){
        if (Ipk >= 3.5 ) {
            return "Kinerja Sangat Baik";
        } else if (Ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (Ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
    public static void main(String[] args) {

        Mahasiswa11 mhs1 = new Mahasiswa11(
            "Muhammad Ali Farhan",
            "2241720171",
            3.55,
            "SI 2J"
        );

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        mhs1.tampilkanInformasi();

        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja(mhs1.ipk));
    }

}

```

Hasil running.
```
Nama: Muhammad Ali Farhan
NIM: 2241720171
IPK: 3.55
Kelas: SI 2J
----------------------
Nama: Muhammad Ali Farhan
NIM: 2241720171
IPK: 3.6
Kelas: SI 2K
----------------------
Nilai Kinerja: Kinerja Sangat Baik
```

## 2.3.1 Praktikum perulangan
Kode program perulangan

```
package minggu5;

public class MahasiswaMain11 {
    public static void main(String[] args) {
        Mahasiswa11 mhs1 = new Mahasiswa11();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa11 mh2 = new Mahasiswa11("Annisa Nabila","2141720160",3.25,"TI 2L");
        mh2.updateIpk(3.30);
        mh2.tampilkanInformasi();

        Mahasiswa11 mhsfarelMahasiswa11 = new Mahasiswa11("Farel Firlando","254107020031",3.50,"TI 1F");
        mhsfarelMahasiswa11.tampilkanInformasi();
    }

}

```
Hasil Running
```
----------------------
Nama: Annisa Nabila
NIM: 2141720160
IPK: 3.3
Kelas: TI 2L
----------------------
Nama: Farel Firlando
NIM: 254107020031
IPK: 3.5
Kelas: TI 1F
----------------------
```
