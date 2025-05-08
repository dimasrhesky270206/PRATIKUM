|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020209|
| Nama |  Dimas HandaRhesky Irianto |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/dimasrhesky270206/dimass) |

# ARRAY OF OBJECT
## 5.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

*Maaf tidak ada bukti screenshot karna progam saya tidak bisa dirun dikarenakan tidak ada fungsi main*
***
*Penjelesan singkat:* 
Disini ada 3 step utama: 
1.  **Membuat Class Faktorial**
    -   Menambahkan *metode faktorialBF* untuk menghitung faktorial dengan perulangan (Brute Force).
    -   Menambahkan *metode faktorialDC* untuk menghitung faktorial dengan rekursi (Divide and Conquer).
2.  **Membuat Class MainFaktorial**
    -   Menambahkan *Scanner* untuk menerima input angka dari pengguna.
    -   Membuat objek dari class Faktorial untuk memanggil metode faktorial.
    -   Menampilkan hasil faktorial dengan kedua metode.
3.  *Testing Program*    -   Menjalankan program dan memasukkan berbagai angka untuk memastikan hasilnya benar.
    -   Memeriksa apakah hasil dari *Brute Force* dan *Divide and Conquer* selalu sama.
  *Pertanyaan :*
  1. *Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!*
   - Pada algoritma *Divide and Conquer (DC)* untuk faktorial, bagian *if* digunakan sebagai *base case* untuk menghentikan rekursi saat n == 1, sehingga tidak terus memanggil dirinya sendiri.

- Bagian *else* adalah *recursive case*, di mana fungsi akan memanggil dirinya sendiri dengan n-1, lalu mengalikan hasilnya dengan n, hingga mencapai base case.
 2. *Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!*
  -  Ya, perulangan pada method faktorialBF() bisa diubah menggunakan *while* .

			nt faktorialBF(int n){
			    int fakto = 1;
			    while (n > 0) {
			        fakto *= n;
			        n--;
			    }
			    return fakto;
			}

 
 3. **Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !**
arrayOfMahasiswa = new Mahasiswa[3] . 
- Perbedaannya:

	-   **fakto *= i;** (Brute Force) → Menggunakan perulangan untuk menghitung faktorial secara langsung.
    
	-   **int fakto = n * faktorialDC(n - 1);** (Divide & Conquer) → Menggunakan rekursi, di mana n dikalikan dengan hasil faktorial dari n-1.
 
4. **Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!**

-  Kesimpulannya:

	-   **faktorialBF()** menggunakan perulangan (while) untuk menghitung faktorial secara iteratif.
    
	-   **faktorialDC()** menggunakan rekursi, memecah masalah menjadi sub-masalah lebih kecil hingga mencapai kondisi dasar (n == 1).
    

- BF lebih sederhana dan langsung, sedangkan DC lebih elegan tetapi bisa memakan lebih banyak memori karena rekursi.

	
***
## 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer


 ![Screenshot](Screenshot2025-03-13105641.png)	
***
*Penjelesan singkat:* 
Disini ada 3 step utama: 
-   *Membuat Kelas Faktorial*
    -   Menyediakan dua metode untuk menghitung faktorial:
        -   faktorialBF(int n): Menggunakan perulangan (Brute Force).
        -   faktorialDC(int n): Menggunakan rekursi (Divide and Conquer).
-   *Membuat Kelas Pangkat*
    -   Menyediakan metode untuk menghitung perpangkatan:
        -   pangkatBF(): Menggunakan perulangan.
        -   pangkatDC(int x, int y): Menggunakan rekursi (Divide and Conquer).
-   *Membuat Kelas MainFaktorial*
    -   Meminta input angka dari pengguna.
    -   Memanggil metode faktorial dengan dua cara dan menampilkan hasilnya.
-   *Membuat Kelas MainPangkat*
    -   Meminta input jumlah elemen, nilai basis, dan pangkatnya.
    -   Menggunakan dua metode untuk menghitung pangkat (Brute Force & Divide and Conquer).
    -   Menampilkan hasil perhitungan.
 ***
  *Pertanyaan :*
  1. *Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!*
-   *pangkatBF()* → Menggunakan perulangan untuk mengalikan bilangan berulang kali.
    
-   *pangkatDC()* → Menggunakan rekursi untuk membagi perhitungan, lebih efisien untuk pangkat besar.
 2. *Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!*

- Ya, tahap *combine* ada di method *pangkatDC()*.  
Terlihat pada baris:

	    int hasil = setengahPangkat * setengahPangkat;
			if (p > 1 && p % 2 != 0) {
		    hasil *= n;
		}

- Bagian ini menggabungkan hasil dari pemanggilan rekursif sebelumnya.
3. **Pada method `pangkatBF()`terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?**
- Method *pangkatBF()* sebenarnya bisa dibuat tanpa parameter karena atribut *nilai* dan *pangkat* sudah ada di dalam class *Pangkat*. Namun, jika tanpa parameter, perhitungan hanya bisa dilakukan untuk objek yang sudah memiliki nilai dan pangkat yang ditentukan sebelumnya.

	    
		int pangkatBF() {
		    int hasil = 1;
		    for (int i = 0; i < pangkat; i++) {
		        hasil *= nilai;
		    }
		    return hasil;
		}
- Cara ini tetap bisa digunakan, tetapi kurang fleksibel jika ingin menghitung pangkat untuk nilai lain tanpa membuat objek baru.
4. **Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!**
- *Cara kerja method pangkatBF() dan pangkatDC():*

	-   *pangkatBF()* menggunakan perulangan (*Brute Force*) untuk mengalikan basis sebanyak pangkatnya. Lebih sederhana tapi kurang efisien jika pangkatnya besar.
    
	-   *pangkatDC()* menggunakan *Divide and Conquer*, membagi masalah menjadi lebih kecil, lalu menggabungkan hasilnya. Lebih cepat karena mengurangi jumlah perkalian dengan strategi pemecahan masalah.
 ***
## 3.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

 ![Screenshot](Screenshot2025-03-13111009.png)

***
*Penjelesan singkat:* 
Disini ada 2 step utama: 
*Alur Pembuatan Program:*
1.  **Buat class Sum**
    -   Menyediakan array keuntungan untuk menyimpan data.
    -   Method totalBF() menjumlahkan semua elemen dengan perulangan (Brute Force).
    -   Method totalDC() menggunakan Divide and Conquer dengan rekursi untuk membagi dan menjumlahkan elemen secara efisien.
2.  **Buat class MainSum**
    -   Meminta input jumlah elemen dari pengguna.
    -   Mengisi array keuntungan dengan nilai yang dimasukkan.
    -   Menampilkan hasil perhitungan total keuntungan dengan Brute Force dan Divide and Conquer.
 ***
  *Pertanyaan :*
  1. **Kenapa dibutuhkan variable mid pada method TotalDC() ?**
 - Variable mid digunakan untuk membagi array menjadi dua bagian dalam metode *Divide and Conquer*. Dengan membagi array di tengah (mid), metode ini dapat menghitung total keuntungan secara rekursif untuk masing-masing bagian, lalu menggabungkan hasilnya.
 2. **Untuk apakah statement di bawah ini dilakukan dalam TotalDC() ?**

	    double  lsum  =  totalDC(arr, l, mid);
	    double  rsum  =  totalDC(arr, mid  +  1, r);
- Statement tersebut digunakan untuk membagi proses pencarian total keuntungan menjadi dua bagian:
	-   **double lsum = totalDC(arr, l, mid);**  
    → Menghitung total keuntungan dari bagian kiri array (dari indeks l sampai mid).

	-   **double rsum = totalDC(arr, mid + 1, r);**  
    → Menghitung total keuntungan dari bagian kanan array (dari indeks mid + 1 sampai r).
    

- Dengan cara ini, algoritma *Divide and Conquer* bekerja dengan membagi masalah menjadi submasalah yang lebih kecil hingga mencapai kondisi dasar (satu elemen), lalu menggabungkan hasilnya.
3. *Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?*

	    return lsum+ rsum;

  - Penjumlahan lsum + rsum diperlukan karena algoritma *Divide and Conquer* membagi array menjadi dua bagian, menghitung total keuntungan di masing-masing bagian secara rekursif, lalu menggabungkan hasilnya.

- Tanpa penjumlahan ini, metode totalDC() hanya akan menghitung sebagian dari array, bukan keseluruhan total keuntungan. Jadi, **lsum + rsum memastikan bahwa hasil akhirnya adalah jumlah total dari seluruh elemen array.**

4. *Apakah base case dari totalDC()?*


- *Base case* dari totalDC() adalah saat **l == r**, yaitu ketika hanya ada satu elemen yang tersisa dalam array.

	    if (l == r) {
		    return arr[l];
		}

- Pada kondisi ini, fungsi langsung mengembalikan nilai elemen tersebut tanpa melakukan pemanggilan rekursif lagi. *Base case ini penting untuk menghentikan rekursi agar tidak berjalan tanpa batas.*
5. *Tarik Kesimpulan tentang cara kerja totalDC()*
- Metode ini menggunakan *Divide and Conquer, di mana array dibagi menjadi dua bagian hingga tersisa satu elemen (base case). Kemudian, hasil dari kedua bagian dijumlahkan secara rekursif hingga diperoleh total keseluruhan. **Proses ini lebih efisien dibandingkan iterasi pada dataset besar karena mengurangi jumlah operasi perhitungan.*
	
***
## Tugas 1

 ![Screenshot](Screenshot2025-03-13113814.png)

***
*Penjelesan singkat:* 
Disini ada 7 step utama: 

1.  **Buat class Mahasiswa**
    
    -   Tambahkan atribut: nama, nim, thnMasuk, uts, uas.
    -   Buat constructor untuk inisialisasi data.
    -   Buat method rekursif utsTertinggi() untuk mencari mahasiswa dengan nilai UTS tertinggi (divide and conquer).
    -   Buat method rekursif utsTerendah() untuk mencari nilai UTS terendah.
    -   Buat method rataNilaiUAS() untuk menghitung rata-rata UAS semua mahasiswa.
2.  **Buat class MahasiswaMain**
    
    -   Buat array berisi beberapa objek Mahasiswa.
    -   Tampilkan nama mahasiswa dengan UTS tertinggi dan terendah.
    -   Tampilkan rata-rata nilai UAS dengan format 2 angka di belakang koma.
3.  *Jalankan program* untuk melihat hasilnya.
***
## Terima Kasih :)