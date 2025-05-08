public class Dosen06 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen06(String kd, String name, boolean jk, int age) {
       this. kode = kd;
       this. nama = name;
       this. jenisKelamin = jk;
       this. usia = age;
    }

    public void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("--------------------------");
    }
}
