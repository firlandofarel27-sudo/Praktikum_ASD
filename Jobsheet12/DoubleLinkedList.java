package Jobsheet12;


public class DoubleLinkedList {
   Node11 head;
    Node11 tail;
    int size = 0;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // ADD FIRST
    public void addFirst(Mahasiswa11 data) {
        Node11 newNode = new Node11(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(Mahasiswa11 data) {
        Node11 newNode = new Node11(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void add(int index, Mahasiswa11 data) {

        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {

            Node11 current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Node11 newNode = new Node11(current.prev, data, current);

            current.prev.next = newNode;
            current.prev = newNode;

            size++;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa11 data) {

    Node11 current = head;

    while (current != null) {

        if (current.data.nim.equals(keyNim)) {

            Node11 newNode = new Node11(current, data, current.next);

            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }

            current.next = newNode;

            size++;

            return;
        }

        current = current.next;
    }

    System.out.println("Data tidak ditemukan");
}

    public void print() {

        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node11 current = head;

        while (current != null) {
            current.data.tampil();
            System.out.println("----------------------");
            current = current.next;
        }
    }

    public void printReverse() {

        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node11 current = tail;

        while (current != null) {
            current.data.tampil();
            System.out.println("----------------------");
            current = current.prev;
        }
    }

    public Node11 search(String nim) {

        Node11 current = head;

        while (current != null) {

            if (current.data.nim.equals(nim)) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    public void removeFirst() {

        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data yang dihapus:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    public void removeLast() {

        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data yang dihapus:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    public void removeAfter(String keyNim) {

    Node11 current = head;

    while (current != null) {

        if (current.data.nim.equals(keyNim)) {

            Node11 deleteNode = current.next;

            if (deleteNode == null) {
                System.out.println("Tidak ada node setelahnya");
                return;
            }

            System.out.println("Data yang dihapus:");
            deleteNode.data.tampil();

            current.next = deleteNode.next;

            if (deleteNode.next != null) {
                deleteNode.next.prev = current;
            } else {
                tail = current;
            }

            size--;

            return;
        }

        current = current.next;
    }

    System.out.println("Data tidak ditemukan");
}

    public void remove(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {

            Node11 current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            System.out.println("Data yang dihapus:");
            current.data.tampil();

            current.prev.next = current.next;
            current.next.prev = current.prev;

            size--;
        }
    }

    public void getFirst() {

        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        head.data.tampil();
    }

    public void getLast() {

        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        tail.data.tampil();
    }

    public void getIndex(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        Node11 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.data.tampil();
    }

    public int size() {
        return size;
    }  
}
