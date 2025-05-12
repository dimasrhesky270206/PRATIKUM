public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max;

    public AntrianLayanan(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = mhs;
        size++;
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa temp = data[front];
        for (int i = front; i < rear; i++) {
            data[i] = data[i + 1];
        }
        rear--;
        size--;
        if (size == 0) {
            front = rear = -1;
        }
        return temp;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi Antrian:");
            for (int i = front; i <= rear; i++) {
                data[i].tampilkanData();
            }
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}

