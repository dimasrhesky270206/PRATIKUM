import java.util.Scanner;

public class SuratDemo06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat06 stack = new StackSurat06(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Lihat Semua Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat          : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa    : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas             : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I)  : ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari)     : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat06 surat = new Surat06(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat berhasil ditambahkan.");
                    break;

                case 2:
                    Surat06 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.printf("Surat dari %s telah diproses.\n", diproses.namaMahasiswa);
                    } else {
                        System.out.println("Tidak ada surat untuk diproses.");
                    }
                    break;

                case 3:
                    Surat06 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.printf("Surat terakhir dari %s (%s)\n", terakhir.namaMahasiswa, terakhir.idSurat);
                    } else {
                        System.out.println("Belum ada surat.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Surat Izin:");
                    System.out.println("ID\tNama\tKelas\tJenis\tDurasi");
                    stack.print();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        scan.close();
    }
}
