package pertemuan11;

public class nodepesanan {
    pesanan data;
    nodepesanan prev, next;

    nodepesanan(nodepesanan prev, pesanan data, nodepesanan next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
