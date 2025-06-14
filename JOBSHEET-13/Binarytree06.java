public class Binarytree06 {
    Node06 root;

    public Binarytree06() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node06 current = root;
            Node06 parent = null;
            while (true) {
                parent = current;
                if (data.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        Node06 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) return true;
            current = ipk < current.mahasiswa.ipk ? current.left : current.right;
        }
        return false;
    }

    void traversePreOrder(Node06 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node06 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node06 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node06 getSuccessor(Node06 del) {
        Node06 successor = del.right;
        Node06 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void delete(double ipk) {
        Node06 current = root, parent = root;
        boolean isLeftChild = true;

        while (current != null && current.mahasiswa.ipk != ipk) {
            parent = current;
            if (ipk < current.mahasiswa.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
        }

        if (current == null) return;

        if (current.left == null && current.right == null) {
            if (current == root) root = null;
            else if (isLeftChild) parent.left = null;
            else parent.right = null;
        } else if (current.right == null) {
            if (current == root) root = current.left;
            else if (isLeftChild) parent.left = current.left;
            else parent.right = current.left;
        } else if (current.left == null) {
            if (current == root) root = current.right;
            else if (isLeftChild) parent.left = current.right;
            else parent.right = current.right;
        } else {
            Node06 successor = getSuccessor(current);
            if (current == root) root = successor;
            else if (isLeftChild) parent.left = successor;
            else parent.right = successor;
            successor.left = current.left;
        }
    }
    public void addRekursif(Mahasiswa06 data) {
    root = tambahRekursif(root, data);
}

private Node06 tambahRekursif(Node06 current, Mahasiswa06 data) {
    if (current == null) {
        return new Node06(data);
    }
    if (data.ipk < current.mahasiswa.ipk) {
        current.left = tambahRekursif(current.left, data);
    } else {
        current.right = tambahRekursif(current.right, data);
    }
    return current;
     }
    public void cariMinIPK() {
    if (isEmpty()) {
        System.out.println("Tree kosong");
        return;
    }
    Node06 current = root;
    while (current.left != null) {
        current = current.left;
    }
    System.out.println("Data Mahasiswa dengan IPK minimum:");
    current.mahasiswa.tampilInformasi();
}

public void cariMaxIPK() {
    if (isEmpty()) {
        System.out.println("Tree kosong");
        return;
    }
    Node06 current = root;
    while (current.right != null) {
        current = current.right;
    }
    System.out.println("Data Mahasiswa dengan IPK maksimum:");
    current.mahasiswa.tampilInformasi();
}
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
    tampilRekursifAtas(root, ipkBatas);
}

private void tampilRekursifAtas(Node06 node, double batas) {
    if (node != null) {
        tampilRekursifAtas(node.left, batas);
        if (node.mahasiswa.ipk > batas) {
            node.mahasiswa.tampilInformasi();
        }
        tampilRekursifAtas(node.right, batas);
    }
}


    }
