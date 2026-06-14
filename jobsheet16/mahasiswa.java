package jobsheet16;

public class mahasiswa implements Comparable<mahasiswa>{
    String nim;
    String nama;
    String notelp;

     public mahasiswa() {
    }
 
    public mahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
 
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
 
    @Override
    public int compareTo(mahasiswa other) {
        return this.nim.compareTo(other.nim);
    }
}

