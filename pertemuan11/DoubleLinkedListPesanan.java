package pertemuan11;

public class DoubleLinkedListPesanan {
    nodepesanan head, tail;

    public void tambahPesanan(pesanan pesanan) {
        nodepesanan newNode = new nodepesanan(null, pesanan, null);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortingPesanan() {
        if (head == null) return;

        for (nodepesanan i = head; i.next != null; i = i.next) {
            for (nodepesanan j = head; j.next != null; j = j.next) {

                if (j.data.namapesanan.compareToIgnoreCase(j.next.data.namapesanan) > 0) {

                    pesanan temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }

    public void laporanPesanan() {
        if (head == null) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sortingPesanan();

        System.out.println("\n=== LAPORAN PESANAN ===");

        nodepesanan current = head;
        int total = 0;

        while (current != null) {
            System.out.println("Kode Pesanan : " + current.data.kodepesanan);
            System.out.println("Nama Menu    : " + current.data.namapesanan);
            System.out.println("Harga        : " + current.data.harga);
            System.out.println("---------------------------");

            total += current.data.harga;

            current = current.next;
        }

        System.out.println("Total Pendapatan : " + total);
    }
}
