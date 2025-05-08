import java.util.Scanner;

public class SumMain {
    private double[] keuntungan;

    public SumMain(int elemen) {
        keuntungan = new double[elemen];
    }

    public double totalBF17() {
        double total = 0;
        for (double k : keuntungan) {
            total += k;
        }
        return total;
    }

    public double totalDC17(double[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        double leftSum = totalDC17(arr, left, mid);
        double rightSum = totalDC17(arr, mid + 1, right);
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        SumMain sm = new SumMain(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan BRUTEFORCE: " + sm.totalBF17());
        System.out.println("Total keuntungan menggunakan DIVIDE AND CONQUER: " + sm.totalDC17(sm.keuntungan, 0, elemen - 1));
    }
}
