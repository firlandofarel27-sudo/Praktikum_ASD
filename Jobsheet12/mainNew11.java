package Jobsheet12;

public class mainNew11 {
    public static void main(String[] args) {

        LinkedListRekap rekap = new LinkedListRekap();

        rekap.tambahPesanan("Nasi Goreng");
        rekap.tambahPesanan("Mie Ayam");
        rekap.tambahPesanan("Nasi Goreng");
        rekap.tambahPesanan("Es Teh");
        rekap.tambahPesanan("Nasi Goreng");
        rekap.tambahPesanan("Mie Ayam");

        rekap.tampilkanRekap();
    }
}
