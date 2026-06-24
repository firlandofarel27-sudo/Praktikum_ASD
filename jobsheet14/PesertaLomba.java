package jobsheet14;

public class PesertaLomba {
    int idPeserta;
    String nama;
    String asal;
    int skor;

    public PesertaLomba(int idPeserta, String nama, String asal, int skor) {
        this.idPeserta = idPeserta;
        this.nama = nama;
        this.asal = asal;
        this.skor = skor;
    }

    public void tampil() {
        System.out.println("ID      : " + idPeserta);
        System.out.println("Nama    : " + nama);
        System.out.println("Asal    : " + asal);
        System.out.println("Skor    : " + skor);
        System.out.println("----------------------");
    }
}
