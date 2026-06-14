package jobsheet16;

import jobsheet10.mahasiswa11;

public class Nilai {
    private Mahasiswa11 mahasiswa;
    private MataKuliah mataKuliah;
    private double nilai;
 
    public Nilai(Mahasiswa11 mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa  = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai      = nilai;
    }
 
    public Mahasiswa11 getMahasiswa()   { return mahasiswa; }
    public MataKuliah getMataKuliah() { return mataKuliah; }
    public double getNilai()          { return nilai; }
 
    @Override
    public String toString() {
        return String.format("%-8s %-15s %-40s %-5d %.2f",
                mahasiswa.getNim(),
                mahasiswa.getNama(),
                mataKuliah.getNama(),
                mataKuliah.getSks(),
                nilai);
    }
}
