public class MataKuliah06 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + nama);
        System.out.println("Jumlah SKS MK : " + sks);
        System.out.println("Jumlah jam MK : " + jumlahJam);
    }
    public MataKuliah06(){}
    public MataKuliah06(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void ubahSKS(int sksNew){
        int dump = sks;
        sks = sksNew;
        System.out.println("Jumlah SKS berhasil diubah dari " + dump + " menjadi " + sksNew);
    }
    void tambahJam(int jumlahJamNew){
        int dump = jumlahJam;
        jumlahJam += jumlahJamNew;
        System.out.println("Jumlah jam berhasil ditambah dari " + dump + " menjadi " + jumlahJamNew);
    }
    void kurangiJam(int jumlahJamNew){
        int dump = jumlahJam;
        if (jumlahJamNew >= jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        }else{
            jumlahJam -= jumlahJamNew;
            System.out.println("Jumlah jam berhasil dikurangi dari " + dump + " menjadi " + jumlahJamNew);
        }
    }
}
