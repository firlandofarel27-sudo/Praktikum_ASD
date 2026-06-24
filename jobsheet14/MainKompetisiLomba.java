package jobsheet14;

public class MainKompetisiLomba {
    public static void main(String[] args) {

        BST bst = new BST();

        bst.insert(new PesertaLomba(1, "Latep", "Ponorogo", 75));
        bst.insert(new PesertaLomba(2, "Akbar", "Malang", 90));
        bst.insert(new PesertaLomba(3, "Kosim", "Malang", 85));
        bst.insert(new PesertaLomba(4, "Wahyu", "Papua", 70));
        bst.insert(new PesertaLomba(5, "Parel", "Probolinggo", 95));

        bst.tampilJuara();

        bst.tampilPenghargaan();

        System.out.println(
            "Jumlah peserta mendapat penghargaan: "
            + bst.hitungPenghargaan()
        );
    }
}
