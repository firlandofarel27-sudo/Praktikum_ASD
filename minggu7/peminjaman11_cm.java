package minggu7;

public class peminjaman11_cm {
     mahasiswa11_cm MHS;
    buku11_cm Buku;
    int LamaPinjam;
    int Terlambat;
    int Denda;
    boolean isCanceled; //fitur baru

    peminjaman11_cm(mahasiswa11_cm MHS, buku11_cm Buku, int LamaPinjam){
        this.MHS = MHS;
        this.Buku = Buku;
        this.LamaPinjam = LamaPinjam;
        this.isCanceled = false; // default tidak dibatalkan
        HitungDenda();
    }

    void HitungDenda(){
        if(LamaPinjam > 5){
            Terlambat = LamaPinjam - 5;
            Denda = Terlambat + 2000;
        } else {
            Terlambat = 0;
            Denda = 0;
        }
    }
void Cancel(){
        isCanceled = true;
        Terlambat = 0;
        Denda = 0;
}
    void Tampil(){
        if(isCanceled){
            System.out.println("Peminjaman dibatalkan oleh " + MHS.Nama + " untuk buku " + Buku.Judul);
        } else {
            System.out.println(MHS.Nama + " | " + Buku.Judul + " | Lama: " + LamaPinjam + " | Terlambat: " + Terlambat + " | Denda: " + Denda);
        }
        System.out.println(MHS.Nama + " | " + Buku.Judul + " | Lama: " + LamaPinjam + " | Terlambat: " + Terlambat + " | Denda: " + Denda);
    }
}
