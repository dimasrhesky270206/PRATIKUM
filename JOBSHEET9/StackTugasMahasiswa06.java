 class StackTugasMahasiswa06 {
    Mahasiswa06[] stack;
        int top;
        int size;
    
        public StackTugasMahasiswa06(int size) {
            this.size = size;
            stack = new Mahasiswa06[size];
            top = -1;
        }
    
        public boolean isfull() {
            if (top == size -1) {
                return true;
            }else {
                return false;
            }
        }
    
        public boolean isEmpty() {
            if (top == -1) {
                return true;
            } else {
                return false;
            }
        }
    
        public void push (Mahasiswa06 mhs) {
            if (!isfull()) {
                top++;
                stack[top] = mhs;
            }else {
                System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
            }
        }
    
        public Mahasiswa06 pop() {
            if (!isEmpty()) {
                Mahasiswa06 m = stack[top];
                top--;
                return m;
            } else {
                System.out.println("Stack kosong! TIdak ada tugas untuk dinilai");
                return null;
            }
        }
    
        public Mahasiswa06 peek() {
            if (!isEmpty()) {
                return  stack[top];
            } else {
                System.out.println("Stack kosong! TIdak ada tugas yang dikumpulkan");
                return null;
            }
        }
    
        public void print() {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
            System.out.println("");
        }
        public Mahasiswa06 dataFirst() {
            if (!isEmpty()) {
                return stack[0];
            }else{
                System.out.println("Stack kosong! Tidak ada tugas yang dikumpul");
                return null;
            }
        }

        public int jmlhTgs() {
            return(top + 1);
        }

        String konversiDesimalkeBiner(int nilai) {
            StackKonversi06 stack = new StackKonversi06();
            while (nilai !=0) {
                int sisa = nilai% 2;
                stack.push(sisa);
                nilai/=2;
            }
            String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
        
        }
   
    }
    
       