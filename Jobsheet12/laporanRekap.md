|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/Praktikum_ASD) |

# Labs #1 Programming Fundamentals Review

## 2.4.1. Selection Solution

Kode program cm.
Node Rekap

```
package Jobsheet12;

public class NodeRekap {
     String namaPesanan;
    int jumlah;
    NodeRekap next;

    public NodeRekap(String namaPesanan, int jumlah) {
        this.namaPesanan = namaPesanan;
        this.jumlah = jumlah;
        this.next = null;
    }
}

class LinkedListRekap {
    NodeRekap head;

    // Menambah atau mengupdate rekap pesanan
    public void tambahPesanan(String namaPesanan) {
        NodeRekap current = head;

    // Cek apakah menu sudah ada
        while (current != null) {
            if (current.namaPesanan.equalsIgnoreCase(namaPesanan)) {
                current.jumlah++;
                return;
    }
    current = current.next;
}
// Jika belum ada, tambahkan node baru
        NodeRekap newNode = new NodeRekap(namaPesanan, 1);

        if (head == null) {
            head = newNode;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
    }
}
// Sorting descending berdasarkan jumlah
    public void sortDescending() {
        if (head == null) return;

        NodeRekap i, j;
        for (i = head; i != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (j.jumlah > i.jumlah) {
                    String tempNama = i.namaPesanan;
                    int tempJumlah = i.jumlah;

                    i.namaPesanan = j.namaPesanan;
                    i.jumlah = j.jumlah;

                    j.namaPesanan = tempNama;
                    j.jumlah = tempJumlah;
                }
            }
        }
    }
    // Menampilkan rekap
    public void tampilkanRekap() {
        sortDescending();

        System.out.println("==  SELAMAT DATANG  ==");
        System.out.println("=== REKAP PESANAN ===");
        NodeRekap current = head;

        while (current != null) {
            System.out.println(current.namaPesanan +
                    " : " + current.jumlah);
            current = current.next;
        }
    }
}

```
Kode Main Rekap
```
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
        rekap.tambahPesanan("Kwetiau");

        rekap.tampilkanRekap();
    }
}

```
Hasil running.
```
==  SELAMAT DATANG  ==
=== REKAP PESANAN ===
Nasi Goreng : 3
Mie Ayam : 2
Es Teh : 1
Kwetiau : 1
PS C:\Github\Praktikum_ASD> 
```


