public class UTS06 {
    private static int findMaxUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int leftMax = findMaxUTS(uts, left, mid);
        int rightMax = findMaxUTS(uts, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    private static int findMinUTS(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int leftMin = findMinUTS(uts, left, mid);
        int rightMin = findMinUTS(uts, mid + 1, right);
        return Math.min(leftMin, rightMin);
    }

    private static double calculateAverageUAS(int[] uas) {
        double total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return total / uas.length;
    }

    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

        int maxUTS = findMaxUTS(uts, 0, uts.length - 1);
        int minUTS = findMinUTS(uts, 0, uts.length - 1);
        double avgUAS = calculateAverageUAS(uas);

        System.out.println("Nilai UTS tertinggi (Divide and Conquer): " + maxUTS);
        System.out.println("Nilai UTS terendah (Divide and Conquer): " + minUTS);
        System.out.println("Rata-rata nilai UAS (Brute Force): " + avgUAS);
    }
}
