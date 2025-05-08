import java.util.Scanner;

public class percobaan3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();

        int n = nim.charAt(nim.length() - 1) - '0';

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {

            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
