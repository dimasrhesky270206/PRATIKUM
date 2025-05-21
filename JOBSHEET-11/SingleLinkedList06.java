public class SingleLinkedList06 {
    Node06 head;
    Node06 tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node06 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(Mahasiswa06 input) {
        Node06 ndInput = new Node06(input);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa06 input) {
        Node06 ndInput = new Node06(input);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String key, Mahasiswa06 input) {
        Node06 temp = head;
        while (temp != null && !temp.data.nim.equals(key)) {
            temp = temp.next;
        }
        if (temp != null) {
            Node06 newNode = new Node06(input);
            newNode.next = temp.next;
            temp.next = newNode;
            if (newNode.next == null) tail = newNode;
        }
    }

    void insertAt(int index, Mahasiswa06 input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node06 temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                Node06 newNode = new Node06(input);
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) tail = newNode;
            }
        }
    }
    // Mendapatkan data pada indeks tertentu
Mahasiswa06 getData(int index) {
    Node06 temp = head;
    for (int i = 0; i < index && temp != null; i++) {
        temp = temp.next;
    }
    if (temp != null) return temp.data;
    return null;
}

// Mendapatkan index berdasarkan NIM
int indexOf(String key) {
    Node06 temp = head;
    int index = 0;
    while (temp != null) {
        if (temp.data.nim.equals(key)) {
            return index;
        }
        temp = temp.next;
        index++;
    }
    return -1;
}

// Menghapus data dari awal
void removeFirst() {
    if (!isEmpty()) {
        head = head.next;
        if (head == null) tail = null;
    } else {
        System.out.println("Linked List kosong, tidak bisa dihapus");
    }
}

// Menghapus data dari akhir
void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked List kosong, tidak bisa dihapus");
    } else if (head == tail) {
        head = tail = null;
    } else {
        Node06 temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
}

void remove(String key) {
    if (isEmpty()) {
        System.out.println("Linked List kosong, tidak bisa dihapus");
        return;
    }

    if (head.data.nim.equals(key)) {
        removeFirst();
        return;
    }

    Node06 temp = head;
    while (temp.next != null) {
        if (temp.next.data.nim.equals(key)) {
            temp.next = temp.next.next;
            if (temp.next == null) tail = temp;
            break; 
        }
        temp = temp.next;
    }
}


void removeAt(int index) {
    if (index == 0) {
        removeFirst();
    } else {
        Node06 temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next == null) tail = temp;
        }
    }
}

}
