package pertemuan11;

public class DoubleLinkedListPembeli {
    nodepembeli head, tail;
    int nomor = 1;

    public void tambahAntrian(String nama, String hp) {
        pembeli pembeli = new pembeli(nama, hp);
        nodepembeli newNode = new nodepembeli(null, nomor++, pembeli, null);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Antrian berhasil ditambahkan!");
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\n=== DAFTAR ANTRIAN ===");
        nodepembeli current = head;

        while (current != null) {
            System.out.println("No Antrian : " + current.noAntrian);
            System.out.println("Nama       : " + current.data.namapembeli);
            System.out.println("No HP      : " + current.data.noHp);
            System.out.println("--------------------------");
            current = current.next;
        }
    }

    public nodepembeli hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return null;
        }

        nodepembeli temp = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return temp;
    }
}
