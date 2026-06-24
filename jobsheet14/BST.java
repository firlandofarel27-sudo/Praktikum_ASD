package jobsheet14;

public class BST {
    Node root;

    public void insert(PesertaLomba data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, PesertaLomba data) {
        if (root == null) {
            return new Node(data);
        }

        if (data.skor < root.data.skor) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Menampilkan juara (skor tertinggi)
    public void tampilJuara() {
        if (root == null) {
            System.out.println("Data kosong");
            return;
        }

        Node current = root;
        while (current.right != null) {
            current = current.right;
        }

        System.out.println("=== JUARA LOMBA ===");
        current.data.tampil();
    }

    // Menampilkan peserta dengan nilai > 80
    public void tampilPenghargaan() {
        System.out.println("=== PESERTA MENDAPAT PENGHARGAAN ===");
        tampilPenghargaanRec(root);
    }

    private void tampilPenghargaanRec(Node node) {
        if (node != null) {
            tampilPenghargaanRec(node.left);

            if (node.data.skor > 80) {
                node.data.tampil();
            }

            tampilPenghargaanRec(node.right);
        }
    }

    // Menghitung jumlah peserta dengan nilai >= 80
    public int hitungPenghargaan() {
        return hitungPenghargaanRec(root);
    }

    private int hitungPenghargaanRec(Node node) {
        if (node == null) {
            return 0;
        }

        int count = (node.data.skor >= 80) ? 1 : 0;

        return count
                + hitungPenghargaanRec(node.left)
                + hitungPenghargaanRec(node.right);
    }
}
