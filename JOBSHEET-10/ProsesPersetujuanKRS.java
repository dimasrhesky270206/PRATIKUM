import java.util.Scanner;

public class ProsesPersetujuanKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS06 antrian = new AntrianKRS06(10);

        int pilihan;
        do {
            System.out.println("\n===== Menu Persetujuan KRS =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Belakang");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Informasi Jumlah Antrian & Proses");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buffer

            switch (pilihan) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh, tidak dapat menambahkan.");
                        break;
                    }
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.print();
                    break;
                case 6:
                    antrian.infoJumlah();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
