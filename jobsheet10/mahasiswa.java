package jobsheet10;

public class mahasiswa {
    String NIM;
    String Nama;
    String Prodi;
    String Kelas;

    public mahasiswa(String NIM, String Nama, String Prodi, String Kelas) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.Kelas = Kelas;
    }

    public void TampilkanData() {
        System.out.println(NIM + " - " + Nama + " - " + Prodi + " - " + Kelas);
    } 
}
