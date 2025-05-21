public class MahasiswaAntrian06 {
    String nim;
    String nama;
    String keperluan;

    MahasiswaAntrian06(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    void tampil() {
        System.out.println(nim + " | " + nama + " | " + keperluan);
    }
}

