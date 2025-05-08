import java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;
        MahasiswaBerprestasi list = new MahasiswaBerprestasi(jumMhs);
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());
            
            list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
        }
        
        System.out.println("\nData Mahasiswa:");
        System.out.println("\n--------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

    }
}

