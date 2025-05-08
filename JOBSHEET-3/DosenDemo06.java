import java.util.Scanner;
     public class DosenDemo06 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Dosen06[] arrayOfDosen = new Dosen06[3];
            String kode, nama, dummy;
            int usia;
            Boolean jeniskelamin;
    
            for(int i=0; i < 3; i++) {
                System.out.println("Masukkan Data Dosen ke-" + (i + 1));
                System.out.print("Kode    : ");
                kode = sc.nextLine();
                System.out.print("Nama    : ");
                nama = sc.nextLine();
                System.out.print("Jenis Kelamin : ");
                dummy = sc.nextLine();
                jeniskelamin = dummy.equalsIgnoreCase("Wanita");
                System.out.print("Usia     : ");
                dummy = sc.nextLine();
                usia = Integer.parseInt(dummy);
                System.out.println("-------------------------------------");
    
                arrayOfDosen[i] = new Dosen06(kode, nama, jeniskelamin, usia );
            }
            
        }
    }
        
    