import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
         // Array kode plat nomor
         char[] CODE = {'A', 'B','D','E','F','G','H','L','N','T'};
         // Array nama kota
         String[] CITY = {
              "BANTEN",
              "JAKARTA",
              "BANDUNG",
              "CIREBON",
              "BOGOR",
              "PEKALONGAN",
              "SEMARANG",
              "SURABAYA",
              "MALANG",
              "TEGAL",
        };
        // Scanner untuk input user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputCode = scanner.next().toUpperCase().charAt(0);
        scanner.close();

        // Mencari kota berdasarkan kode plat
        boolean found = false;
        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == inputCode) {
                System.out.println("Nama kota: " + CITY[i]);
                found = true;
                break;
            }
        }

        // Jika kode tidak ditemukan
        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");

        }
    }
}
    

