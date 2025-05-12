import java.util.Scanner;

public class LayananAkademikSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);

        int pilihan;
        do {
            System.out.println("\n==== Menu Layanan Akademik ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Tampilkan Semua Antrian");
            System.out.println("5. Tampilkan Jumlah Antrian");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(m);
                    break;
                case 2:
                    Mahasiswa keluar = antrian.dequeue();
                    if (keluar != null) {
                        System.out.println("Data mahasiswa yang dipanggil:");
                        keluar.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}

