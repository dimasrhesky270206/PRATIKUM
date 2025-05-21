public class SLLMain06 {
    public static void main(String[] args) {
        SingleLinkedList06 data = new SingleLinkedList06();
        System.out.println("Linked list kosong");
        data.print(); 

        
        Mahasiswa06 mhs1 = new Mahasiswa06("21212203", "Dirga", "4D", 3.6);
        data.addFirst(mhs1);
        data.print();

        
        Mahasiswa06 mhs2 = new Mahasiswa06("24212200", "Alvaro", "1A", 4.0);
        data.addLast(mhs2);
        data.print();

        
        Mahasiswa06 mhs3 = new Mahasiswa06("22212202", "Cintia", "3C", 3.5);
        Mahasiswa06 mhs4 = new Mahasiswa06("23212201", "Bimon", "2B", 3.8);
        data.insertAfter("21212203", mhs3); 
        data.insertAt(2, mhs4);             
        data.print();

        
        System.out.println("Hapus data awal:");
        data.removeFirst();
        data.print();

        
        System.out.println("Hapus data akhir:");
        data.removeLast();
        data.print();

        
        System.out.println("Hapus data berdasarkan NIM (225150700111004):");
        data.remove("225150700111004"); 
        data.print();

        
        System.out.println("Hapus data pada index ke-0:");
        data.removeAt(0);
        data.print();

        
        System.out.println("Index dari NIM 225150700111002:");
        System.out.println(data.indexOf("225150700111002"));

        
        System.out.println("Data pada index ke-0:");
        Mahasiswa06 mhs = data.getData(0);
        if (mhs != null) {
            mhs.tampilInformasi();
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}
