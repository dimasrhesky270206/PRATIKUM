public class BinaryTreeMain06 {
    public static void main(String[] args) {
        Binarytree06 bt = new Binarytree06();
        bt.add(new Mahasiswa06("123", "Budi", "TI-1A", 3.4));
        bt.add(new Mahasiswa06("124", "Ani", "TI-1B", 3.9));
        bt.add(new Mahasiswa06("125", "Siti", "TI-1A", 3.2));
        bt.add(new Mahasiswa06("126", "Rudi", "TI-1C", 3.7));

        System.out.println("Traversal Pre Order:");
        bt.traversePreOrder(bt.root);
        System.out.println("Traversal In Order:");
        bt.traverseInOrder(bt.root);
        System.out.println("Traversal Post Order:");
        bt.traversePostOrder(bt.root);

        System.out.println("Cari IPK 3.2: " + bt.find(3.2));
        System.out.println("Hapus IPK 3.4");
        bt.delete(3.4);
        System.out.println("Traversal In Order setelah delete:");
        bt.traverseInOrder(bt.root);
    }
}

