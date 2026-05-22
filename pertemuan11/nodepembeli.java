package pertemuan11;

public class nodepembeli {
    int noAntrian;
    pembeli data;
    nodepembeli prev, next;

    nodepembeli(nodepembeli prev, int noAntrian, pembeli data, nodepembeli next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.data = data;
        this.next = next;
    }
}
