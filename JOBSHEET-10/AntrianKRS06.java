public class AntrianKRS06 {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahProses;

    public AntrianKRS06(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
        jumlahProses = 0;
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

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa diproses!");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa m = data[front];
            m.tampilkanData();
            for (int j = front; j < rear; j++) {
                data[j] = data[j + 1];
            }
            rear--;
            size--;
            jumlahProses++;
        }
        if (size == 0) {
            front = rear = -1;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Antrian:");
        for (int i = front; i <= rear; i++) {
            data[i].tampilkanData();
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        jumlahProses = 0;
        System.out.println("Antrian dikosongkan!");
    }

    public void infoJumlah() {
        System.out.println("Jumlah antrian saat ini           : " + size);
        System.out.println("Jumlah mahasiswa sudah diproses   : " + (jumlahProses * 2));
        int total = size + (jumlahProses * 2);
        System.out.println("Jumlah mahasiswa belum diproses   : " + (total - (jumlahProses * 2)));
    }
}

