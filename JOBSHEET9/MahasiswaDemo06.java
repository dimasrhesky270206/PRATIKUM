import java.util.Scanner;

 public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa06 stack = new StackTugasMahasiswa06(5);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM  : ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa06 mhs = new Mahasiswa06(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa06 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.printf("Menilai tugas dari %s\n", dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine(); 
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    } else {
                        System.out.println("Tidak ada tugas untuk dinilai.");
                    }
                    break;
                case 3:
                    Mahasiswa06 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas\tNilai");
                    stack.print();
                    break;
                case 5:
                     lihat = stack.dataFirst();
                     if (lihat != null) {

                     }
                     break;
                case 6:
                     System.out.println("Jumlah tugas saat ini adalah" + stack.jmlhTgs());
                     break;
                default:
                    System.out.println("pilihan tidak valid");
            }

        } while (pilih >= 1 && pilih <= 6);

        scan.close();
    }
}
