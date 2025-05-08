public class Dosen06 {
    String idDosen;
    String nama;
    int tahunBergabung;
    boolean statusAktif;
    String  bidangKeahlian;
    String status;

    void tampilInformasi(){
        System.out.println("ID dosen : " + idDosen);
        System.out.println("Nama dosen : " + nama);
        if (statusAktif == true) {
            status = "Aktif";
        }else { status = "Non Aktif"; }
        System.out.println("Status : " + status);
        System.out.println("Tahun bergabung : " + tahunBergabung);
        System.out.println("Bidang keahlian : " + bidangKeahlian);
        System.out.println("===============");
    }
    public Dosen06(){}
    public Dosen06(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.tahunBergabung = tahunBergabung;
        this.statusAktif = statusAktif;
        this.bidangKeahlian = bidangKeahlian;
    }
    void ubahKeahlian(String bidangKeahlianNew){
        String dump = bidangKeahlian;
        bidangKeahlian = bidangKeahlianNew;
        System.out.println("Bidang keahlian dosen berhasil diubah dari " + dump + " menjadi " + bidangKeahlianNew);
        System.out.println("===============");
    }
    void setStatus(boolean statusNew){
        if (statusAktif == true) {
            status = "Aktif";
        }else { status = "Non Aktif"; }
        String dump = status;
        statusAktif = statusNew;
        if (statusAktif == true) {
            status = "Aktif";
        }else { status = "Non Aktif"; }

        System.out.println("Status berhasil diset dari " + dump + " menjadi " + status);
        System.out.println("===============");
    }
    void hitungMasaKerja(int thnSkrg){
        int dump = thnSkrg;
        if (tahunBergabung > thnSkrg) {
            System.out.println("Tahun Sekarang Invalid");
        }else{
            thnSkrg -= tahunBergabung ;
            System.out.println("Masa kerja dosen adalah " + thnSkrg + " tahun dari " + tahunBergabung + " sampai " + dump);
            System.out.println("===============");
        }
    }
}

