import java.util.Scanner;
 public class MatakuliahDemo06 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah06[] arrayofMatakuliah06 = new Matakuliah06[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan kode matakuliah:");
            kode = sc.nextLine();
            System.out.println("Masukkan nama matakuliah:");
            nama = sc.nextLine();
            System.out.println("Masukkan sks:");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("jumlah jam:");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------");
        
            arrayofMatakuliah06[i] = new Matakuliah06(kode, nama, sks, jumlahJam);
        }
        

       
          for(int i = 0; 1 < 3; i++) {
           System.out.println("Data Matakuliah ke-" + (i + 1));
           System.out.println("kode    :" + arrayofMatakuliah06[i].kode);
           System.out.println("Nama    :" + arrayofMatakuliah06[i].nama);
           System.out.println("Sks :" + arrayofMatakuliah06[i].sks);
           System.out.println("Jumlah Jam :" + arrayofMatakuliah06[i].jumlahJam);
           System.out.println("------------------------------");
           
        }
        }
    }

