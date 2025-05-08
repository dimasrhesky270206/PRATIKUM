public class Sum {
    double keuntungan[];

    Sum (int el){
        keuntungan = new double[el];
    }

    double totalBF17() {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC17(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } 

        int mid = (l + r) / 2;
        double lsum = totalDC17(arr, l, mid);
        double rsum = totalDC17(arr, mid + 1, r);
        return lsum + rsum;
    } 
}

