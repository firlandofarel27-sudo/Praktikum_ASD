package Jobsheet12;

public class Node11 {
    Mahasiswa11 data;
    Node11 prev, next;

    public Node11(Node11 prev, Mahasiswa11 data, Node11 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
