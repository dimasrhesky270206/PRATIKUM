public class BinaryTreeArray06 {
    Mahasiswa06[] data;
    int idxLast;

    public BinaryTreeArray06() {
        data = new Mahasiswa06[10]; // ukuran default
        idxLast = -1;
    }

    public void add(Mahasiswa06 mhs) {
        if (idxLast < data.length - 1) {
            idxLast++;
            data[idxLast] = mhs;
        } else {
            System.out.println("Tree penuh!");
        }
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            data[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            data[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
