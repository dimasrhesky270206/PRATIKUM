public class Queue {
    int[] data;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        data[rear] = dt;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return -1;
        }
        int temp = data[front];
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
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue kosong!");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
        } else {
            System.out.print("Isi Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Queue berhasil dikosongkan");
    }
}
