import java.util.Scanner;

public class MainAntrian06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList06 antrian = new QueueLinkedList06();
        int pilih;

        do {
            System.out.println("\n--- MENU ANTRIAN UNIT KEMAHASISWAAN ---");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // clear newline

            switch (pilih) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String kep = sc.nextLine();
                    MahasiswaAntrian06 mhs = new MahasiswaAntrian06(nim, nama, kep);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.printQueue();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getSize());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
