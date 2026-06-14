package jobsheet16;

public class Mahasiswa11 {
    private String nim;
    private String nama;
    private String telp;
 
    public Mahasiswa11(String nim, String nama, String telp) {
        this.nim  = nim;
        this.nama = nama;
        this.telp = telp;
    }
 
    public String getNim()  { return nim; }
    public String getNama() { return nama; }
    public String getTelp() { return telp; }
 
    @Override
    public String toString() {
        return String.format("%-8s %-15s %-10s", nim, nama, telp);
    }
}
