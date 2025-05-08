
|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020209|
| Nama |  Dimas HandaRhesky Irianto |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/dimasrhesky270206/dimass) |

# ARRAY OF OBJECT
## 3.2 Membuat Array dari Object, Mengisi dan Menampilkan


![Screenshot](/JOBSHEET-3/img/Screenshot%202025-02-27%20112147.png)
***
*Penjelesan singkat:* 
Disini ada 5 step utama: 

1.  **Buat folder baru dengan nama Praktikum03.**
    
2.  **Buat class Mahasiswa:**
3. **Buat class MahasiswaDemo kemudian tambahkan fungsi main**
4. **Kemudian isikan masing-masing atributnya**
5. **Cetak ke layar semua atribut dari objek arrayOfMahasiswa**
 ***
  *Pertanyaan :*
  1. *Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!*
   - Tidak Harus, bahkan bisa tidak memakai keduanya tapi tak ada gunanya .
 2. *Apa yang dilakukan oleh kode program berikut?*
 Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3] .
  -  Untuk membuat object dalam bentuk array .
 
 3. **Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?**
arrayOfMahasiswa = new Mahasiswa[3] . 
  - Ada, tapi karna default jadi tidak wajib di inisiasi
 
4. *Apa yang dilakukan oleh kode program berikut?*

       arrayOfMahasiswa[0] =  new  Mahasiswa18();
       arrayOfMahasiswa[0].nim  =  "244107060033";
       arrayOfMahasiswa[0].nama  =  "AGNES TITANIA KINANTI";
       arrayOfMahasiswa[0].kelas  =  "SIB-1E";
       arrayOfMahasiswa[0].ipk  = (float) 3.75;
-  Mengisi Attribute dari object
  
  5. **Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?**
  - Karna class mahasiswa bekerja sebagai class sedangkan mahasiswaDemo untuk membuat object
	
***
## 3.3 Menerima Input Isian Array Menggunakan Looping


 ![Screenshot](/JOBSHEET-3/img/Screenshot%202025-02-27%20113112.png)	
***
*Penjelesan singkat:* 
Disini ada 3 step utama: 

1. **Mendeklarasikan Scanner diclass MahasiswaDemo18**
   - MahasiswaMain18.java
2.  **Mengubah pengisian dan penampilan attribute menjadi menggunakan for**
3. **Pada praktikum 3.2 poin nomor 5, modifikasi kode program sebagai berikut. Lakukan looping untuk mengakses elemen array objek mahasiswa dan menampilkan informasinya ke layar**
 ***
  *Pertanyaan :*
  1. **Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.**
- Method cetakInfo() .

      void  cetakInfo(){
           System.out.println("Nim : "  +  nim);
           System.out.println("Nama : "  +  nama);
           System.out.println("Kelas : "  +  kelas);
           System.out.println("IPK : "  +  ipk);
           System.out.println("--------------------------------------------");
      }
      
 -  Modifikasi no3. 
   
        for(int  i  =  0; i  <  3; i++){
               arrayOfMahasiswa[i].cetakInfo();
        }  

 2. **Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?**

        Mahasiswa[] myArrayOfMahasiswa  =  new  Mahasiswa[3];
        myArrayOfMahasiswa[0].nim  =  "244107060033";
        myArrayOfMahasiswa[0].nama  =  "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas  =  "SIB-1E";
        myArrayOfMahasiswa[0].ipk  = (float) 3.75;
- Karna kita baru menginisiasi arraynya bukan objectnya, jika ingin tidak erro kita harus manambahkan myArrayOfMahasiswa[0] =  new  Mahasiswa(); sebelum mengisi attributenya

 ***
## 3.4 Constructor Berparameter

 ![Screenshot](/JOBSHEET-3/img/Screenshot%202025-02-27%20234053.png)

***
*Penjelesan singkat:* 
Disini ada 3 step utama: 


1.**Buatlah class baru dengan nama Matakuliah dengan constructor berparameter**
2.**Buatlah class baru MatakuliahDemo dan tambahkan fungsi main(). Kemudian sehingga instansiasi array object Matakuliah dilakukan menggunakan constructor berparameter**
3.**Modifikasi class MatakuliahDemo sehingga dapat menampilkan hasil inputan variable array of object Matakuliah di layer**
  *Pertanyaan :*
  1. *Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya*
 - Bisa, contohnya ada pada jobsheet pekan lalu
 2. **Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah**
- Membuat method tambahData() di class mataKuliah18 dengan kode seperti dibawah .

	    void  tambahData(){
		    String  dummy;
		    System.out.print(" - Kode : ");
		    kode  =  sc.nextLine();
		    System.out.print(" - Nama : ");
		    nama  =  sc.nextLine();
		    System.out.print(" - SKS : ");
		    dummy  =  sc.nextLine();
		    sks  =  Integer.parseInt(dummy);
		    System.out.print(" - Jumlah Jam : ");
		    dummy  =  sc.nextLine();
		    jumlahJam  =  Integer.parseInt(dummy);
	    }
- Lalu isi dari for untuk menambahkan data dengan meamanggil method yang baru dibuat seperti kode dibawah .

	    for(int  i  =  0; i  <  3; i++){
		    System.out.println("Masukkan Data Mata Kuliah ke-"  + (i  +  1));
		    arrayOfMataKuliah[i] =  new  MataKuliah18();
		    arrayOfMataKuliah[i].tambahData();
		    System.out.println("------------------------------");
	    }

3. **Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar**
  -  Membuat method cetakInfo() di class MataKuliah18 dengan kode seperti dibawah .

		    void  cetakInfo(MataKuliah18  arrayOfMataKuliah){
		        System.out.println(" - Kode : "  +  arrayOfMataKuliah.kode);
		        System.out.println(" - Nama : "  +  arrayOfMataKuliah.nama);
		        System.out.println(" - SKS : "  +  arrayOfMataKuliah.sks);
		        System.out.println(" - Jumlah Jam : "  +  arrayOfMataKuliah.jumlahJam);
	    	    System.out.println("------------------------------");
	        }

 
4. *Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner*
- Menambahkan variable didalam fungsi main class MataKuliahDemo() sebelum pembuatan object dengan array yang diinput sesuai  keinginan panjang (jumlah elemen) dari user seperti kode dibawah .

	    System.out.print("Masukkan jumlah Mata Kuliah : ");
		    int  jumlahMataKuliah  =  sc.nextInt();
- Modifikasi kode saat pembuatan object dibagian panjang (jumlah elemen) menjadi variable yang baru dibuat seperti kode dibawah .

	    MataKuliah18[] arrayOfMataKuliah  =  new  MataKuliah18[jumlahMataKuliah];
***
## Tugas 
 ![Screenshot](/JOBSHEET-3/img/Screenshot%202025-03-06%20214131.png)

***
*Penjelesan singkat:* 
Disini ada 5 step utama: 

1.  **Membuat Class `Dosen06`**
    
    -   **Class ini berfungsi sebagai template untuk objek dosen, dengan atribut:**
        -   `kode` → Kode dosen
        -   `nama` → Nama dosen
        -   `jenisKelamin` → Boolean (`true` untuk Wanita, `false` untuk Pria)
        -   `usia` → Usia dosen
2.  **Program Utama (`DosenDemo06`)**
    
    -   **Menggunakan `Scanner` untuk input data** dari pengguna.
    -   **Membuat array `Dosen06` untuk menyimpan 3 objek dosen**.
    -   **Mengisi array dengan data dosen** menggunakan perulangan:
        -   Meminta input **kode, nama, jenis kelamin, dan usia**.
        -   Mengonversi input **jenis kelamin** ke boolean (`true` untuk Wanita, `false` untuk Pria).
    -   **Setelah semua data diinput, array berisi 3 objek `Dosen06`**.
3.  **Mengelola Data Dosen dengan `DataDosen06`**
    
    -   **Menampilkan semua data dosen** (`dataSemuaDosen`).
    -   **Menghitung jumlah dosen pria dan wanita** (`jumlahDosenPerJenisKelamin`).
    -   **Menghitung rata-rata usia dosen pria dan wanita** (`rerataUsiaDosenPerJenisKelamin`).
    -   **Menampilkan data dosen paling tua** (`infoDosenPalingTua`).
    -   **Menampilkan data dosen paling muda** (`infoDosenPalingMuda`).
4.  **Proses Perhitungan dan Analisis Data**
    
    -   **Perulangan digunakan untuk membaca data dari array dan melakukan perhitungan:**
        -   Mencari jumlah dosen berdasarkan jenis kelamin
        -   Menghitung rata-rata usia untuk masing-masing jenis kelamin
        -   Mencari dosen dengan usia tertinggi dan terendah
5.  **Menampilkan Hasil**
    
    -   **Data dosen ditampilkan sesuai dengan hasil perhitungan dan analisis.**

***
## Terima Kasih :)
