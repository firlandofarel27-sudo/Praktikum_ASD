package minggu4;

public class Fungsi {
    static int[][] Stok = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}    
    };

    static int[] Harga = {75000, 50000, 60000, 10000};
    static String[] NamaCabang = {
        "RoyalGarden 1",
        "RoyalGarden 2",
        "RoyalGarden 3",
        "RoyalGarden 4"
    };

    public static void TampilPendapatan() {
        System.out.println("=== PENDAPATAN SETIAP CABANG ===");

        for (int i = 0; i < Stok.length; i++) {
            int TotalPendapatan = 0;

            for (int j = 0; j < Stok[i].length; j++) {
                TotalPendapatan += Stok[i][j] * Harga[j];
            }

            System.out.println(NamaCabang[i] + 
                " = Rp " + TotalPendapatan);

            tampilStatus(TotalPendapatan);
            System.out.println();
        }
    }
    
    public static void tampilStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            System.out.println("Status : Sangat Baik");
        } else {
            System.out.println("Status : Perlu Evaluasi");
        }
    }

    public static void main(String[] args) {
        TampilPendapatan();
    }

}
