public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 dosen1 = new Dosen06();
        dosen1.idDosen = "P90";
        dosen1.nama = "Zaki";
        dosen1.bidangKeahlian = "MLan";
        dosen1.tahunBergabung = 2000;
        dosen1.statusAktif = false;
        dosen1.tampilInformasi();
        dosen1.ubahKeahlian("Tidur");
        dosen1.setStatus(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.tampilInformasi();

        System.out.println("==================================================");

        Dosen06 dosen2 = new Dosen06("P90", "Dimas Handayana", true, 2015, "Makan");
        dosen2.tampilInformasi();
        dosen2.ubahKeahlian("Main");
        dosen2.setStatus(false);
        dosen2.hitungMasaKerja(2010);
        dosen2.tampilInformasi();
    }
}

