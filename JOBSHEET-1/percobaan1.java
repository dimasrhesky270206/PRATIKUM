import java.util.Scanner;
public class percobaan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila", 
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", 
            "Bahasa Inggris", 
            "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", 
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 3, 2, 3, 2, 3, 2, 2};

        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversiBobotNilai(nilaiHuruf[i]);
        }

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-35s %-10s %-10s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------");
        
        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-35s %-10.2f %-10s %-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobot / totalSKS;
        System.out.println("--------------------------------------------------");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        
        input.close();
    }

    public static String konversiNilaiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 80) return "A-";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "C+";
        else if (nilai >= 60) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }

    public static double konversiBobotNilai(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A": return 4.00;
            case "A-": return 3.75;
            case "B+": return 3.50;
            case "B": return 3.00;
            case "C+": return 2.50;
            case "C": return 2.00;
            case "D": return 1.00;
            case "E": return 0.00;
            default: return 0.00;
        }
    }
}
