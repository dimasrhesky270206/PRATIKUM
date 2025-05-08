public class MataKuliahMain06 {
    public static void main(String[] args) {
        MataKuliah06 mk1 = new MataKuliah06();
        mk1.kodeMK = "P90";
        mk1.nama = "Matematika Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(9);
        mk1.tampilInformasi();

        System.out.println("===============================");
        System.out.println("===============================");

        MataKuliah06 mk2 = new MataKuliah06("MP40", " Dasar Pemerograman", 2, 5);
        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(3);
        mk2.tampilInformasi();
    }
}

