|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020209|
| Nama |  Dimas HandaRhesky Irianto |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/dimasrhesky270206/dimass/tree/main/JOBSHEET%202) |

# SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)
## 6.2 Mengimplementasikan Sorting menggunakan object

*Maaf tidak ada bukti screenshot karna progam saya tidak bisa dirun dikarenakan tidak ada fungsi main*
***
*Penjelesan singkat:* 
Disini ada 3 step utama: 
-   *Membuat Kelas Sorting18*
    -   Menyimpan array data yang akan diurutkan.
    -   Implementasi tiga metode sorting:
        -   *Bubble Sort:* Menukar elemen secara berulang hingga data terurut.
        -   *Selection Sort:* Mencari elemen terkecil lalu menempatkannya di posisi yang benar.
        -   *Insertion Sort:* Menyisipkan elemen ke posisi yang tepat dalam urutan yang sudah tersusun.
-   *Membuat Kelas SortingMain*
    -   Mendeklarasikan tiga array data yang berbeda.
    -   Membuat objek dari kelas Sorting18 untuk setiap array.
    -   Menampilkan data sebelum sorting.
    -   Melakukan sorting menggunakan *Bubble Sort*.
    -   Menampilkan hasil setelah sorting.
-   *Eksekusi Program*
    -   Data awal ditampilkan.
    -   Data diurutkan menggunakan Bubble Sort.
    -   Hasil ditampilkan setelah proses pengurutan selesai.
 ***
  *Pertanyaan :*
  1. *Jelaskan fungsi kode program berikut*

	     if (data[j  -  1] >  data[j]){
		    temp  =  data[j];
		    data[j] =  data[j  -  1];
		    data[j  -  1] =  temp;
		 }

   - Kode tersebut merupakan bagian dari algoritma *Bubble Sort. Fungsinya adalah untuk **menukar posisi dua elemen yang berurutan* jika elemen sebelumnya (data[j - 1]) lebih besar dari elemen saat ini (data[j]).

	 - Jika kondisi if (data[j - 1] > data[j]) terpenuhi, berarti elemen yang lebih besar dipindahkan ke kanan dengan cara swap menggunakan variabel sementara (temp).  
	 - Proses ini memastikan bahwa elemen terbesar akan "mengambang" ke posisi akhir setelah beberapa iterasi, sehingga data akan terurut secara *ascending*.
 2. *Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!*

	    for(int i = 0; i < jumData - 1; i++){
		    int min = i;
		    for(int j = i + 1; j < jumData; j++){
		        if (data[j] < data[min]){
	            min = j;
		        }
		    }
		}

 3. *Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan .*

	     while (j  >=  0  &&  data[j] >  temp){

- Kondisi pada perulangan **while (j >= 0 && data[j] > temp)** dalam *Insertion Sort* memiliki maksud sebagai berikut:

	- **j >= 0** → Memastikan indeks tidak keluar dari batas array saat membandingkan elemen sebelumnya.  
	- **data[j] > temp** → Jika elemen sebelumnya (data[j]) lebih besar dari elemen yang sedang dipindahkan (temp), maka elemen tersebut harus digeser ke kanan.

-  *Tujuan:* Menggeser elemen yang lebih besar ke kanan agar elemen yang lebih kecil bisa dimasukkan ke posisi yang tepat.
 
4. *Pada Insertion sort, apakah tujuan dari perintah*

	    data[j  +  1] =  data[j];

-  *Tujuannya* adalah untuk *menggeser elemen ke kanan* agar memberi ruang bagi elemen yang sedang disisipkan (temp).

	- Jika elemen sebelumnya (data[j]) lebih besar dari temp, maka elemen tersebut digeser satu posisi ke kanan (data[j + 1]).  
	- Proses ini terus berulang sampai menemukan posisi yang tepat untuk temp.

- *Hasilnya:* Array tetap tersusun secara terurut setelah elemen baru dimasukkan.

	
***
## 6.3 (Sorting Menggunakan Array of Object)


 ![Screenshot](Screenshot%202025-02-19%20112051.png)	
***
*Penjelesan singkat:* 
Disini ada 3 step utama: 
1.  *Membuat Class Mahasiswa18 (Tidak ada di kode, tapi diasumsikan ada)*
    -   Berisi atribut *nama, NIM, kelas, dan IPK*.
    -   Memiliki method tampilInformasi() untuk menampilkan data mahasiswa.
2.  *Membuat Class MahasiswaBerprestasi18*
    -   Menyimpan array listMhs untuk 5 mahasiswa.
    -   Method tambah() untuk menambahkan data mahasiswa ke array.
    -   Method tampil() untuk menampilkan semua data mahasiswa.
    -   Method bubbleSort() untuk mengurutkan mahasiswa berdasarkan IPK *(descending)*.
3.  *Membuat Class MahasiswaDemo18 (Program Utama)*
    -   Menggunakan *Scanner* untuk input data mahasiswa (nama, NIM, kelas, IPK).
    -   Menyimpan data mahasiswa ke dalam *listMhs* menggunakan tambah().
    -   Menampilkan data sebelum sorting dengan tampil().
    -   Mengurutkan mahasiswa berdasarkan *IPK tertinggi ke terendah* dengan bubbleSort().
    -   Menampilkan data setelah sorting.
    - ***
  *Pertanyaan :*
  1. *Perhatikan perulangan di dalam bubbleSort() di bawah ini:*

	      for(int  i  =  0; i  <  listMhs.length; i++){
		    for(int  j  =  1; j  <  listMhs.length; j++){

- a. Mengapa syarat dari perulangan i adalah i < listMhs.lenght - 1 ?
	- Syarat i < listMhs.length - 1 digunakan karena dalam *Bubble Sort, setelah **n-1* iterasi, seluruh elemen sudah terurut, jadi iterasi tambahan tidak diperlukan.
	- b. Mengapa syarat dari perulangan j adalah j < listMhs.lenght ?
- Syarat j < listMhs.length digunakan agar setiap elemen dibandingkan dengan elemen sebelumnya, memastikan elemen terbesar berpindah ke posisi akhirnya di setiap iterasi.
- c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?  
	- Perulangan i akan berlangsung *49 kali* (50 - 1).  
	- Tahap (pass) Bubble Sort yang ditempuh juga *49 tahap*.sebagai satu tahap pengurutan. 
 2. *Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!*
 ![Screenshot](Screenshot%202025-02-19%20115952.png)
 ***
## 6.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

 ![Screenshot](Screenshot%202025-02-19%20115952.png)

***
*Penjelesan singkat:* 
Disini ada 3 step utama: 
-   **Menambahkan Metode insertionSort()**
    -   *Sebelumnya*: Sorting hanya menggunakan Bubble Sort dan Selection Sort.
    -   *Update*: Ditambahkan metode **insertionSort()** untuk mengurutkan mahasiswa  menggunakan algoritma *Insertion Sort*.
-   **Memodifikasi MahasiswaDemo18 untuk Memanggil insertionSort()**
    -   *Sebelumnya*: Program hanya menampilkan hasil sorting dengan Bubble Sort dan Selection Sort.
    -   *Update*: Ditambahkan pemanggilan insertionSort() setelah selectionSort().
 ***
  *Pertanyaan :*
  1. *Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending*

		    void  insertionSort(){
					for(int  i  =  1; i  <  listMhs.length; i++){
						Mahasiswa18  temp  =  listMhs[i];
						int  j  =  i;
						while (j  >  0  &&  listMhs[j  -  1].ipk  <  temp.ipk) {
							listMhs[j] =  listMhs[j  -  1];
							j--;
						}
						listMhs[j] =  temp;
					}
			}

 ![Screenshot](Screenshot%202025-02-19%20131313.png)
***
## Tugas 1

 ![Screenshot]()

***
*Penjelesan singkat:* 
Disini ada 3 step utama: 
### *Alur Pembuatan Program*
1.  **Membuat Class Dosen**
    -   Menyimpan atribut dosen: kode, nama, jenisKelamin, usia.
    -   Metode tampil() untuk menampilkan informasi dosen.
    -   Metode jnsKlminBooleanToString() untuk mengonversi jenis kelamin dari boolean ke teks ("Pria"/"Wanita").
2.  **Membuat Class DataDosen**
    -   Array dataDosen untuk menyimpan maksimal 10 data dosen.
    -   Metode tambah(Dosen dsn) untuk menambahkan data dosen ke dalam array.
    -   Metode tampil() untuk menampilkan seluruh data dosen.
    -   *Sorting Methods*:
        -   sortingASC() → Bubble Sort *(Usia ASCENDING - dari muda ke tua)*.
        -   sortingDsc() → Selection Sort *(Usia DESCENDING - dari tua ke muda)*.
        -   insertionSort() → Insertion Sort *(Usia DESCENDING - dari tua ke muda)*.
3.  **Membuat Class DosenMain (Main Program)**
    -   Menggunakan Scanner untuk input data 10 dosen dari user.
    -   Data dosen dimasukkan ke dalam objek Dosen dan ditambahkan ke DataDosen.
    -   Menampilkan *data sebelum sorting*.
    -   Menjalankan *Bubble Sort (ASC), Selection Sort (DSC), dan Insertion Sort (DSC)* untuk mengurutkan data berdasarkan usia.
    -   Menampilkan *data setelah sorting*.
***
## Terima Kasih :)