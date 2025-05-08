import java.util.Scanner;

public class DosenMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen06 listDosen = new DataDosen06();

        while (true) {
            System.out.println("\n======== Menu ========");
            System.out.println("1. Tambahkan Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Data Bubble Sort (ASC)");
            System.out.println("4. Urutkan Data Selection Sort (DSC)");
            System.out.println("5. Urutkan Data Insertion Sort (DSC)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            if (!sc.hasNextInt()) {
                System.out.println("Masukkan angka yang valid untuk pilihan menu!");
                sc.next(); // Membuang input yang salah
                continue;
            }

            int pilihan = sc.nextInt();
            sc.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan jumlah dosen yang ingin ditambahkan: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Masukkan angka yang valid!");
                        sc.next();
                        continue;
                    }

                    int jumlah = sc.nextInt();
                    sc.nextLine(); 

                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nDosen ke-" + (i + 1));

                        System.out.print("Kode : ");
                        String kode = sc.nextLine().trim();

                        System.out.print("Nama : ");
                        String nama = sc.nextLine().trim();

                        System.out.print("Jenis Kelamin (L = Laki-laki, P = Perempuan): ");
                        char jkChar;
                        while (true) {
                            String inputJK = sc.nextLine().trim();
                            if (inputJK.length() == 1 && (inputJK.equalsIgnoreCase("L") || inputJK.equalsIgnoreCase("P"))) {
                                jkChar = inputJK.charAt(0);
                                break;
                            }
                            System.out.print("Masukkan hanya 'L' atau 'P' untuk jenis kelamin: ");
                        }
                        boolean jk = (jkChar == 'L' || jkChar == 'l');

                        System.out.print("Usia : ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Usia harus berupa angka!");
                            sc.next();
                        }
                        int usia = sc.nextInt();
                        sc.nextLine(); // Konsumsi newline

                        Dosen06 dsn = new Dosen06(kode, nama, jk, usia);
                        listDosen.tambah(dsn);
                    }
                    break;

                case 2:
                    System.out.println("\n=== Data Keseluruhan ===");
                    listDosen.tampil();
                    break;

                case 3:
                    System.out.println("\nData telah diurutkan (ASC - Bubble Sort).");
                    listDosen.sortingASC();
                    listDosen.tampil();
                    break;

                case 4:
                    System.out.println("\nData telah diurutkan (DSC - Selection Sort).");
                    listDosen.sortingDSC();
                    listDosen.tampil();
                    break;

                case 5:
                    System.out.println("\nData telah diurutkan (DSC - Insertion Sort).");
                    listDosen.insertionSort();
                    listDosen.tampil();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}
