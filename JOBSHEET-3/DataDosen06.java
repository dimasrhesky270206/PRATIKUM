
public class DataDosen06 {
    void dataSemuaDosen(Dosen06[] arrayOfDosen06){
        int j = 1;
        for (Dosen06 dosen06 : arrayOfDosen06) {
            System.out.println("Data Dosen ke-" + (j++));
            System.out.println("  - Kode                  : " + dosen06.kode);
            System.out.println("  - Nama                  : " + dosen06.nama);
            String jK;
            if (dosen06.jeniskelamin == true) {
                jK = "Wanita";
            }else{ jK = "Pria"; }
            System.out.println("  - Jenis Kelamin         : " + jK);
            System.out.println("  - Usia                  : " + dosen06.usia);
            System.out.println("---------------------------");
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen06[] arrayOfDosen06s){
        int l = 0, p = 0;
        for (Dosen06 dosen06 : arrayOfDosen06s) {
            if (dosen06.jeniskelamin == true) {
                p++;
            }else{ l++; }
        }
        System.out.println("Jumlah Dosen Pria     : " + l);
        System.out.println("Jumlah Dosen Wanita   : " + p);
    }
    void rerataUsiaDosenPerJenisKelamin(Dosen06[] arrayOfDosen06s){
        int l = 0, p = 0, jL = 0, jP = 0;
        double rL = 0, rP = 0;
        for (Dosen06 dosen06 : arrayOfDosen06s) {
            if (dosen06.jeniskelamin == true) {
                p++;
                jP += dosen06.usia;
            }else{ 
                l++;
                jL += dosen06.usia;
            }
        }
        rL = (double) jL / l;
        rP = (double) jP / p;
        System.out.println("Rata - rata usia Dosen Pria     : " + rL);
        System.out.println("Rata - rata usia Dosen Wanita   : " + rP);
    }
    void infoDosenPalingTua(Dosen06[] arrayOfDosen18s, int jumlahDosen){
        int index = 0;
        for(int i = 0; i < jumlahDosen; i++){
            if (arrayOfDosen18s[index].usia < arrayOfDosen18s[i].usia) {
                index = i;
            }
        }
        System.out.println("Data Dosen paling tua ");
        System.out.println("  - Kode                  : " + arrayOfDosen18s[index].kode);
        System.out.println("  - Nama                  : " + arrayOfDosen18s[index].nama);
        String jK;
        if (arrayOfDosen18s[index].jeniskelamin == true) {
            jK = "Wanita";
        }else{ jK = "Pria"; }
        System.out.println("  - Jenis Kelamin         : " + jK);
        System.out.println("  - Usia                  : " + arrayOfDosen18s[index].usia);
        System.out.println("---------------------------");
    }
    void infoDosenPalingMuda(Dosen06[] arrayOfDosen18s, int jumlahDosen){
        int index = 0;
        for(int i = 0; i < jumlahDosen; i++){
            if (arrayOfDosen18s[index].usia > arrayOfDosen18s[i].usia) {
                index = i;
            }
        }
        System.out.println("Data Dosen paling muda ");
        System.out.println("  - Kode                  : " + arrayOfDosen18s[index].kode);
        System.out.println("  - Nama                  : " + arrayOfDosen18s[index].nama);
        String jK;
        if (arrayOfDosen18s[index].jeniskelamin == true) {
            jK = "Wanita";
        }else{ jK = "Pria"; }
        System.out.println("  - Jenis Kelamin         : " + jK);
        System.out.println("  - Usia                  : " + arrayOfDosen18s[index].usia);
        System.out.println("---------------------------");
    }
}