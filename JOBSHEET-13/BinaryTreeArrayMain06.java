public class BinaryTreeArrayMain06 {
    public static void main(String[] args) {
        BinaryTreeArray06 bt = new BinaryTreeArray06();
        bt.add(new Mahasiswa06("101", "Aji", "TI-1A", 3.2));
        bt.add(new Mahasiswa06("102", "Beni", "TI-1A", 3.7));
        bt.add(new Mahasiswa06("103", "Cici", "TI-1A", 2.9));
        bt.add(new Mahasiswa06("104", "Dina", "TI-1A", 3.5));
        bt.add(new Mahasiswa06("105", "Eko", "TI-1A", 3.8));
        bt.add(new Mahasiswa06("106", "Fani", "TI-1A", 3.3));
        bt.add(new Mahasiswa06("107", "Gina", "TI-1A", 3.9));

        System.out.println("InOrder Traversal:");
        bt.traverseInOrder(0);

        System.out.println("PreOrder Traversal:");
        bt.traversePreOrder(0);
    }
}
