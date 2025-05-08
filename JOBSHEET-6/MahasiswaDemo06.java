import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 5;

        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        Mahasiswa06 m1 = new Mahasiswa06("123", "Zidan", "2A", 3.2f);
        Mahasiswa06 m2 = new Mahasiswa06("124", "Ayu", "2A", 3.5f);
        Mahasiswa06 m3 = new Mahasiswa06("125", "Sofi", "2A", 3.8f);
        Mahasiswa06 m4 = new Mahasiswa06("126", "Sita", "2A", 3.9f);
        Mahasiswa06 m5 = new Mahasiswa06("127", "Miki", "2A", 3.7f);

        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        
        list.bubbleSort();

        
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.tampil();

        input.close();
    }
}