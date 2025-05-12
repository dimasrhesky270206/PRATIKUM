|                | Algorithm and Data Structure                                         |
| -------------- | -------------------------------------------------------------------- |
| **NIM**        | 244107020209                                                         |
| **Nama**       | Dimas HandaRhesky Irianto                                            |
| **Kelas**      | TI - 1H                                                              |
| **Repository** | https://github.com/dimasrhesky270206/PRATIKUM

# Jobsheet 11

## 1. Tujuan Praktikum

* Mengenal struktur data Queue.
* Membuat dan mendeklarasikan struktur data Queue.
* Menerapkan algoritma Queue menggunakan array dan objek.

## 2. Percobaan 1: Operasi Dasar Queue (Array)

### 2.1 Deskripsi Program

Program ini mengimplementasikan struktur queue menggunakan array bertipe integer. Operasi yang tersedia: `enqueue`, `dequeue`, `peek`, `print`, dan `clear`.

### 2.2 Source Code

* **Queue.java**: berisi class `Queue`.
* **QueueMain.java**: berisi menu interaktif untuk menggunakan operasi queue.

### 2.3 Hasil Uji Coba

Program berhasil dijalankan, menampilkan menu interaktif dan hasil dari setiap operasi.

### 2.4 Kesimpulan

Struktur queue dapat diimplementasikan menggunakan array dengan indeks `front` dan `rear` untuk melacak elemen depan dan belakang.

## 3. Percobaan 2: Antrian Layanan Akademik (Objek)

### 3.1 Deskripsi Program

Program memodelkan antrian layanan akademik menggunakan objek `Mahasiswa`. Operasi antrian dimodifikasi untuk menyimpan dan memproses objek.

### 3.2 Source Code

* **Mahasiswa.java**: class berisi data mahasiswa.
* **AntrianLayanan.java**: class queue dengan array objek `Mahasiswa`.
* **LayananAkademikSIAKAD.java**: program utama berisi menu interaktif.

### 3.3 Hasil Uji Coba

Pengguna dapat menambahkan mahasiswa, memanggil, melihat elemen terdepan, dan mencetak seluruh antrian.

### 3.4 Kesimpulan

Queue tidak hanya menyimpan data primitif, tetapi juga dapat menyimpan objek kompleks.

## 4. Tugas: Antrian Persetujuan KRS

### 4.1 Deskripsi Program

Mengilustrasikan proses antrian persetujuan KRS oleh DPA, di mana tiap pemrosesan memanggil 2 mahasiswa sekaligus.

### 4.2 Source Code

* **AntrianKRS.java**: class antrian objek dengan logika pemrosesan KRS.
* **ProsesPersetujuanKRS.java**: class utama dengan menu interaktif.

### 4.3 Fitur Program

* Tambah antrian.
* Proses 2 mahasiswa sekaligus.
* Cek antrian depan dan belakang.
* Tampilkan semua antrian.
* Informasi jumlah total, terproses, dan belum terproses.
* Kosongkan antrian.

### 4.4 Hasil pratikum
Screenshot20250512 103259.png




### 4.5 Diagram Class

```
+----------------+
| Mahasiswa      |
+----------------+
| - nim          |
| - nama         |
| - prodi        |
| - kelas        |
+----------------+
| + tampilkanData|
+----------------+

+----------------+
| AntrianKRS     |
+----------------+
| - data[]       |
| - front, rear  |
| - size, max    |
| - jumlahProses |
+----------------+
| + enqueue()    |
| + prosesKRS()  |
| + print()      |
| + peek()       |
| + peekRear()   |
| + clear()      |
| + infoJumlah() |
+----------------+
```

### 4.6 Kesimpulan

Penggunaan queue dalam konteks nyata seperti persetujuan KRS mempermudah pemrosesan secara tertib dan efisien.

## 5. Penutup

Praktikum ini menunjukkan bagaimana konsep queue dapat diimplementasikan dalam berbagai bentuk (array dan objek) serta digunakan dalam konteks yang berbeda seperti antrian layanan akademik dan persetujuan KRS.
