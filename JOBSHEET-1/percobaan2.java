import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

        // Input validation for scores between 0 and 100
        nilaiTugas = getValidInput(scanner, "Masukkan nilai tugas  : ");
        nilaiKuis = getValidInput(scanner, "Masukkan nilai kuis   : ");
        nilaiUTS = getValidInput(scanner, "Masukkan nilai UTS    : ");
        nilaiUAS = getValidInput(scanner, "Masukkan nilai UAS    : ");

        // Compute final score
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        // Convert numeric score to letter grade
        String nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);

        // Display results
        System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + (isLulus(nilaiHuruf) ? "LULUS" : "TIDAK LULUS"));

        // Close the scanner
        scanner.close();
    }

    // Method to ensure input is between 0 and 100
    public static double getValidInput(Scanner scanner, String message) {
        double nilai;
        while (true) {
            System.out.print(message);
            nilai = scanner.nextDouble();
            if (nilai >= 0 && nilai <= 100) {
                break;
            }
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0 - 100.");
        }
        return nilai;
    }

    // Method to convert numeric grades to letter grades
    public static String konversiNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 85) return "A";
        else if (nilaiAkhir >= 80) return "B+";
        else if (nilaiAkhir >= 75) return "B";
        else if (nilaiAkhir >= 65) return "C+";
        else if (nilaiAkhir >= 50) return "C";
        else if (nilaiAkhir >= 40) return "D";
        else return "E";
    }

    // Method to determine pass/fail status
    public static boolean isLulus(String nilaiHuruf) {
        return nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || 
               nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || 
               nilaiHuruf.equals("C");
    }
}
