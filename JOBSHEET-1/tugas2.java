import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menampilkan menu pilihan
            System.out.println("\n=== KALKULATOR KUBUS ===");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling (Total Panjang Sisi)");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 4) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }
            
            // Meminta input panjang sisi kubus
            System.out.print("Masukkan panjang sisi kubus: ");
            double side = scanner.nextDouble();
            
            switch (choice) {
                case 1:
                    System.out.println("Volume kubus: " + calculateVolume(side));
                    break;
                case 2:
                    System.out.println("Luas permukaan kubus: " + calculateSurfaceArea(side));
                    break;
                case 3:
                    System.out.println("Keliling kubus (Total Panjang Sisi): " + calculatePerimeter(side));
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
        scanner.close();
    }

    // Fungsi menghitung volume kubus
    public static double calculateVolume(double side) {
        return Math.pow(side, 3); // Volume = sisi³
    }

    // Fungsi menghitung luas permukaan kubus
    public static double calculateSurfaceArea(double side) {
        return 6 * Math.pow(side, 2); // Luas Permukaan = 6 * sisi²
    }

    // Fungsi menghitung total panjang sisi (keliling)
    public static double calculatePerimeter(double side) {
        return 12 * side; // Keliling = 12 * sisi
    }
}
