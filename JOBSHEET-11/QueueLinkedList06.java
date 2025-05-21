public class QueueLinkedList06 {
    NodeAntrian06 front, rear;
    int size;

    QueueLinkedList06() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(MahasiswaAntrian06 m) {
        NodeAntrian06 newNode = new NodeAntrian06(m);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
        } else {
            System.out.println("Memanggil: " + front.data.nama);
            front = front.next;
            if (front == null) rear = null;
            size--;
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    int getSize() {
        return size;
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi antrian:");
            NodeAntrian06 temp = front;
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }
}
