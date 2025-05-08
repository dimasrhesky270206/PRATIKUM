|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020209|
| Nama |  DIMAS HANDARHESKY IRIANTO |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/dimasrhesky270206/dimass.git) |

# Labs #1 Programming Fundamentals Review

## 2.1. Pemilihan


![Screenshot](/img/Screenshot%202025-02-13%20191515.png)

*Penjelesan singkat:* 
Disini ada 5 step utama: 
1. *Inisialisasi Data*
   - Menyimpan daftar mata kuliah dan jumlah SKS dalam array.
   - Menyiapkan array untuk menyimpan nilai angka, nilai huruf, dan bobot nilai.

2. *Input Nilai*
   - Pengguna memasukkan nilai angka untuk setiap mata kuliah.
   - Program mengonversi nilai angka ke nilai huruf (konversiNilaiHuruf()).
   - Nilai huruf dikonversi ke bobot nilai (konversiBobotNilai()).

3. *Perhitungan IP*
   - Program menampilkan tabel berisi MK, nilai angka, nilai huruf, dan bobot nilai.
   - Menghitung *IP Semester* dengan rumus:
     
     IP = (Σ (bobot × SKS)) / (Σ SKS)
     
   - Menampilkan hasil IP Semester ke layar.

4. *Menutup Scanner*
   - input.close() digunakan untuk mencegah *resource leak*.


## 2.2. Perulangan


![Screenshot](/img/Screenshot%202025-02-13%20193925.png)

*Penjelesan singkat:* 
Disini ada 5 step utama: 
1. *Input Nilai*  
   - Meminta input nilai tugas, kuis, UTS, dan UAS (0-100).
   - Validasi input agar berada dalam rentang yang benar.

2. *Perhitungan Nilai Akhir*  
   - Menggunakan formula:  
     
     nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * UTS) + (0.4 * UAS)
     

3. *Konversi Nilai*  
   - Mengubah nilai angka menjadi nilai huruf berdasarkan skala tertentu.

4. *Menentukan Status Kelulusan*  
   - Jika nilai huruf A, B+, B, C+, atau C → LULUS  
   - Jika nilai D atau E → TIDAK LULUS  

5. *Output Hasil*  
   - Menampilkan nilai akhir, nilai huruf, dan status kelulusan.




## 2.3. Array


![Screenshot](/img/Screenshot%202025-02-13%20194223.png)

*Penjelesan singkat:* 
Disini ada 3 step utama: 
1. *Input NIM*  
   - User memasukkan NIM (Nomor Induk Mahasiswa).
   - Digit terakhir dari NIM digunakan sebagai nilai n.

2. **Penyesuaian Nilai n**  
   - Jika n < 10, maka n ditambah 10 agar minimal 10.

3. *Menampilkan Pola*  
   - Loop dari 1 hingga n.
   - Melewati angka 6 dan 10 (continue).
   - Jika angka ganjil → cetak "*"
   - Jika angka genap → cetak angka itu sendiri.


## 2.4. Fungsi


![Screenshot](/img/Screenshot%202025-02-13%20194530.png)

*Penjelesan singkat:* 
Disini ada 6 step utama: 
1. *Inisialisasi Data*  
   - Stok bunga pada 4 toko RoyalGarden disimpan dalam array stokBunga.
   - Harga tiap jenis bunga ada dalam array hargaBunga.

2. *Menghitung Pendapatan per Toko*  
   - Perkalian stok dengan harga tiap jenis bunga.
   - Menampilkan total pendapatan tiap toko.

3. *Mengurangi Stok RoyalGarden 4*  
   - User memasukkan jumlah bunga yang berkurang.
   - Stok setelah pengurangan ditampilkan.



## Tugas 1


![Screenshot](/img/Screenshot%202025-02-20%20203738.png)

*Penjelesan singkat:* 
Disini ada 3 step utama: 

### *1. Inisialisasi Data*  
- **Array CODE** menyimpan daftar kode plat nomor.  
- **Array CITY** menyimpan daftar nama kota yang sesuai dengan kode plat nomor.  
- *Scanner* digunakan untuk menerima input dari pengguna.

---

### *2. Input Kode Plat Nomor*  
- Pengguna memasukkan satu karakter kode plat nomor.  
- Program mengonversi input ke huruf kapital menggunakan .toUpperCase() untuk memastikan perbandingan tidak case-sensitive.

---

### *3. Pencarian Kota Berdasarkan Kode*  
- Program melakukan pencarian dengan **perulangan for**.  
- Jika kode ditemukan, nama kota akan ditampilkan, dan pencarian berhenti (break).  
- Jika tidak ditemukan, program menampilkan pesan *"Kode plat tidak ditemukan."*.

---


## Tugas 2


![Screenshot](/img/Screenshot%202025-02-20%20203829.png)

*Penjelesan singkat:* 
Disini ada 5 step utama: 
# *Alur Program Kalkulator Kubus*  

1. *Menampilkan Menu*  
   Program menampilkan pilihan perhitungan:  
   - Volume kubus  
   - Luas permukaan kubus  
   - Keliling kubus (total panjang sisi)  
   - Keluar dari program  

2. *Meminta Input Pengguna*  
   - Pengguna diminta memilih opsi (1-4).  
   - Jika memilih perhitungan (1-3), program meminta input panjang sisi kubus.  
   - Jika memilih opsi 4, program berhenti.  

3. *Melakukan Perhitungan*  
   - Volume dihitung dengan rumus sisi³  
   - Luas permukaan dihitung dengan rumus 6 × sisi²  
   - Keliling dihitung dengan rumus 12 × sisi  

4. *Menampilkan Hasil*  
   - Program menampilkan hasil perhitungan sesuai pilihan pengguna.  

5. *Mengulang atau Keluar*  
   - Jika pengguna memilih opsi 4, program berhenti dengan pesan penutupan.  
   - Jika tidak, program kembali ke men

## Tugas 3


![Screenshot](/img/Screenshot%202025-02-20%20204139.png)
![Screenshot](/img/Screenshot%202025-02-20%20204154.png)
![Screenshot](/img//Screenshot%202025-02-20%20204207.png
)

*Penjelesan singkat:* 
Disini ada 4 step utama: 

1. *Meminta Input Data Mata Kuliah*  
   - Pengguna memasukkan jumlah mata kuliah yang ingin dicatat.  
   - Setiap mata kuliah memiliki informasi: nama, jumlah SKS, semester, dan hari perkuliahan.  

2. *Menampilkan Menu Pilihan*  
   - Opsi yang tersedia:  
     1. Tampilkan semua mata kuliah  
     2. Tampilkan mata kuliah berdasarkan hari  
     3. Tampilkan mata kuliah berdasarkan semester  
     4. Cari mata kuliah berdasarkan nama  
     5. Keluar dari program  

3. *Menjalankan Fitur Berdasarkan Pilihan*  
   - *Opsi 1:* Menampilkan seluruh data mata kuliah.  
   - *Opsi 2:* Pengguna memasukkan hari, lalu program menampilkan mata kuliah yang diadakan pada hari tersebut.  
   - *Opsi 3:* Pengguna memasukkan semester, lalu program menampilkan mata kuliah yang ada di semester tersebut.  
   - *Opsi 4:* Pengguna memasukkan nama mata kuliah, lalu program mencari dan menampilkan informasi mata kuliah tersebut.  
   - *Opsi 5:* Program berhenti dengan menampilkan pesan penutupan.  

4. *Perulangan Menu*  
   - Setelah menjalankan opsi 1-4, program kembali ke menu utama hingga pengguna memilih opsi 5 (keluar).  


## Terima Kasih :)