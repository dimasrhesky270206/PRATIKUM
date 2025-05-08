public class MahasiswaBerprestasi {
    Mahasiswa[] listMhs;
    int idx;

    public MahasiswaBerprestasi(int kapasitas) {
        listMhs = new Mahasiswa[kapasitas];
        idx = 0;
    }
    public void tambah(Mahasiswa mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void tampilDataSearch(double x, int pos){
        if(pos!=-1){
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t :"+listMhs[pos].nama);
            System.out.println("kelas\t :"+listMhs[pos].kelas);
            System.out.println("ipk\t :"+listMhs[pos].ipk);
        }
        else{
            System.out.println("Data mahasiswa dengan Ipk"+x+"tidak ditemukan");
        }
    }

    public void tampilPosisi(double x,int pos) {
        if(pos!=-1){
            System.out.println("data mahasiswa dengan Ipk :" +x+" ditemukan pada indeks"+ pos);
        }
        else{
            System.out.println("data"+x+"tidak ditemukan");
        }
    }

    public int sequentialSearching(double cari) {;
        int posisi = -1;
        for (int j = 0; j <listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    
    public int binarySearch(double cari) {
        int left = 0, right = idx - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listMhs[mid].ipk == cari) {
                return mid;
            }
            if (listMhs[mid].ipk < cari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
        

