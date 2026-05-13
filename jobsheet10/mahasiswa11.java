package jobsheet10;

public class mahasiswa11 {
    String NIM;
    String Nama;
    String Prodi;
    String Kelas;

    public mahasiswa11(String NIM, String Nama, String Prodi, String Kelas) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.Kelas = Kelas;
    }

    public void TampilkanData() {
        System.out.println(NIM + " - " + Nama + " - " + Prodi + " - " + Kelas);
    }
}
