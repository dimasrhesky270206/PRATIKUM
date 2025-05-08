 import java.util.Scanner;
    public class MahasiswaDemo06 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Mahasiswa06[] arrayofMahasiswa06 = new Mahasiswa06[3];
            String dummy;
        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa06[i]=new Mahasiswa06();
            System.out.println("Masukkan Data Mahasiswa ke-"+ (i+1)); 
            System.out.print("NIM     : ");
            arrayofMahasiswa06[i].nim=sc.nextLine();
            System.out.print("Nama     : ");
            arrayofMahasiswa06[i].nama=sc.nextLine();
            System.out.print("Kelas     : ");
            arrayofMahasiswa06[i].kelas=sc.nextLine();
            System.out.print("IPK     : ");
            dummy=sc.nextLine();
            arrayofMahasiswa06[i].ipk=Float.parseFloat(dummy);
            System.out.println("----------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-"+ (i+1)); 
            System.out.println("NIM     : "+ arrayofMahasiswa06[i] .nim);
            System.out.println("Nama    : "+ arrayofMahasiswa06[i].nama);
            System.out.println("Keals   : "+arrayofMahasiswa06[i].kelas);
            System.out.println("IPK     : "+ arrayofMahasiswa06[i].ipk);
            System.out.println("----------------------------------");
        }
        }
    }
