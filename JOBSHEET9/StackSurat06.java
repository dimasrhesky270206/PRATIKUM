public class StackSurat06 {
    Surat06[] stack;
    int top, size;

    public StackSurat06(int size) {
        this.size = size;
        stack = new Surat06[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat06 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack surat penuh.");
        }
    }

    public Surat06 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            return null;
        }
    }

    public Surat06 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat.");
            return;
        }

        for (int i = top; i >= 0; i--) {
            Surat06 s = stack[i];
            System.out.printf("%s\t%s\t%s\t%c\t%d hari\n",
                              s.idSurat, s.namaMahasiswa, s.kelas, s.jenisIzin, s.durasi);
        }
    }
}
