import java.util.Scanner;
public class DLLMain06 {
    public static void main(String[] args) {
        DoubleLinkedList06 list = new DoubleLinkedList06();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal ");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("7. Tambahkan setelah mahasiswa x :");
            System.out.println("0.keluar");
            System.out.print("Pilih Menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa06 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa06 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);;
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari : ");
                    String nim = scan.nextLine();
                    Node06 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan :");
                        found.data.tampil();
                    }else{
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    Mahasiswa06 mhs = inputMahasiswa(scan);
                    System.out.print("Masukkan NIM yang ingin ditambahkan setelahnya : ");
                    String nim = scan.nextLine();
                    list.insertAfter(nim, mhs);
                }
                case 8 -> {
                    Mahasiswa06 mhs = inputMahasiswa(scan);
                    System.out.print("Masukkan index : ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.print("Masukkan NIM yang ingin dihapus setelahnya : ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                }
                case 10 -> {
                    System.out.print("Masukkan index : ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.remove(index);
                }
                case 11 -> list.head.data.tampil();
                case 12 -> list.tail.data.tampil();
                case 13 -> {
                    System.out.print("Masukkan index : ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(index);
                }
                case 14 -> System.out.println("Jumlah data : " + list.getSize());
                case 0 -> System.out.println("Keluar dari program");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }
    public static Mahasiswa06 inputMahasiswa(Scanner sc){
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
        return mhs;
    }
}


