import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah mata kuliah yang ingin dimasukkan
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline setelah nextInt()

        // Mendeklarasikan array untuk menyimpan informasi mata kuliah
        String[] courseNames = new String[n];
        int[] creditHours = new int[n];
        int[] semesters = new int[n];
        String[] lectureDays = new String[n];

        // Memasukkan data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            courseNames[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            creditHours[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semesters[i] = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline setelah nextInt()
            System.out.print("Hari Perkuliahan: ");
            lectureDays[i] = scanner.nextLine();
        }

        while (true) {
            // Menampilkan menu
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Semua Mata Kuliah");
            System.out.println("2. Tampilkan Mata Kuliah Berdasarkan Hari");
            System.out.println("3. Tampilkan Mata Kuliah Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah Berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline setelah nextInt()

            switch (choice) {
                case 1:
                    displayAllCourses(courseNames, creditHours, semesters, lectureDays);
                    break;
                case 2:
                    System.out.print("Masukkan hari (contoh: Monday, Tuesday): ");
                    String day = scanner.nextLine();
                    displayCoursesByDay(courseNames, creditHours, semesters, lectureDays, day);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int semester = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi newline
                    displayCoursesBySemester(courseNames, creditHours, semesters, lectureDays, semester);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String searchName = scanner.nextLine();
                    searchCourse(courseNames, creditHours, semesters, lectureDays, searchName);
                    break;
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    // Menampilkan semua mata kuliah
    public static void displayAllCourses(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays) {
        System.out.println("\n=== DAFTAR SEMUA MATA KULIAH ===");
        for (int i = 0; i < courseNames.length; i++) {
            System.out.println("Nama: " + courseNames[i] + ", SKS: " + creditHours[i] + 
                               ", Semester: " + semesters[i] + ", Hari: " + lectureDays[i]);
        }
    }

    // Menampilkan mata kuliah berdasarkan hari
    public static void displayCoursesByDay(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, String day) {
        System.out.println("\n=== MATA KULIAH PADA HARI " + day.toUpperCase() + " ===");
        boolean found = false;
        for (int i = 0; i < lectureDays.length; i++) {
            if (lectureDays[i].equalsIgnoreCase(day)) {
                System.out.println("Nama: " + courseNames[i] + ", SKS: " + creditHours[i] + 
                                   ", Semester: " + semesters[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Tidak ada mata kuliah pada hari ini.");
    }

    // Menampilkan mata kuliah berdasarkan semester
    public static void displayCoursesBySemester(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, int semester) {
        System.out.println("\n=== MATA KULIAH SEMESTER " + semester + " ===");
        boolean found = false;
        for (int i = 0; i < semesters.length; i++) {
            if (semesters[i] == semester) {
                System.out.println("Nama: " + courseNames[i] + ", SKS: " + creditHours[i] + 
                                   ", Hari: " + lectureDays[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Tidak ada mata kuliah untuk semester ini.");
    }

    // Mencari mata kuliah berdasarkan nama
    public static void searchCourse(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, String searchName) {
        System.out.println("\n=== HASIL PENCARIAN MATA KULIAH ===");
        boolean found = false;
        for (int i = 0; i < courseNames.length; i++) {
            if (courseNames[i].equalsIgnoreCase(searchName)) {
                System.out.println("Nama: " + courseNames[i] + ", SKS: " + creditHours[i] + 
                                   ", Semester: " + semesters[i] + ", Hari: " + lectureDays[i]);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Mata kuliah tidak ditemukan.");
}
   }
    

