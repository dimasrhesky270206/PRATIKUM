public class DoubleLinkedList06 {
    Node06 head;
    Node06 tail;

    public DoubleLinkedList06(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst( Mahasiswa06 data){
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa06 data){
        Node06 newNode = new Node06(data); 
        if (isEmpty()) {
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAfter(String keyNim, Mahasiswa06 data){
        Node06 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        }

        Node06 newNode = new Node06(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode; 
        }else{
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menampilkan.");
        }else{
            Node06 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah :");
        head.data.tampil();
        if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah :");
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }
    public Node06 search(String keyNim){
        Node06 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        return current;
    }
    public void add(int index, Mahasiswa06 data){
        if (index == 0) {
            addFirst(data);
        }else{
            Node06 current = head;
            for(int i = 0; i < index - 1; i++){
            current = current.next;
            }
            if (current.next == tail) {
                addLast(data);
            }else{
                Node06 newNode = new Node06(data);
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
            }
        }

    }
    public void removeAfter(String keyNim){
        Node06 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        }else if (current.next == tail) {
            removeLast();
        }else{
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah :");
            current.next.data.tampil();
            current.next = current.next.next;
            current.next.prev = current;
        }
    }
    public void remove(int index){
        if (index == 0) {
            removeFirst();
        }else{
            Node06 current = head;
            for(int i = 0; i < index - 1; i++){
            current = current.next;
            }
            if (current.next == tail) {
                removeLast();
            }else{
                System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah :");
                current.next.data.tampil();
                current.next = current.next.next;
                current.next.prev = current;
            }
        }
    }
    public void getIndex(int index){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menampilkan.");
        }else{
            Node06 current = head;
            for(int i = 0; i < index; i++){
            current = current.next;
            }
            current.data.tampil();
        }
    }
    public int getSize(){
        Node06 current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
