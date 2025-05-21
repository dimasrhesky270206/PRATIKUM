**LAPORAN JOBSHEET 11 - LINKED LIST**

**Nama**     : \[Dimas HandaRhesky irianto]
**NIM**      : \[244107020209]
**Kelas**    : \[TI-1H]
**No Absen** : 06
**github**   :[https://github.com/dimasrhesky270206/PRATIKUM]

---


---

### 2. Praktikum

#### 2.1 Pembuatan Single Linked List

**Langkah-langkah:**

1. Membuat package `Pertemuan12`.
2. Menambahkan class:

   * `Mahasiswa06.java`
   * `Node06.java`
   * `SingleLinkedList06.java`
   * `SLLMain06.java`
3. Implementasi class `Mahasiswa06`:

   * Menyimpan atribut `nim`, `nama`, `kelas`, dan `ipk`.
   * Konstruktor dan method `tampilInformasi()` dibuat sesuai diagram.
4. Implementasi class `Node06`:

   * Menyimpan objek `Mahasiswa06` dan pointer `next`.
5. Menambahkan atribut `head` dan `tail` pada `SingleLinkedList06`.
6. Menambahkan method berikut:

   * `isEmpty()`
   * `print()` untuk menampilkan data dengan traversal.
   * `addFirst()` untuk menambahkan data di depan.
   * `addLast()` untuk menambahkan data di belakang.
   * `insertAfter(String key, Mahasiswa06 data)` untuk menyisipkan setelah NIM tertentu.
   * `insertAt(int index, Mahasiswa06 data)` untuk menyisipkan di posisi tertentu.
7. Pada class `SLLMain06`, dilakukan:

   * Pembuatan objek `SingleLinkedList06`.
   * Pembuatan 4 data mahasiswa.
   * Penambahan data dan pencetakan setelah setiap penambahan.
   * Penerapan method penghapusan dan pencarian.

**Screenshot Program:** (disesuaikan dengan output yang ada)

#### 2.1.2 Jawaban Pertanyaan

1. Karena linked list belum memiliki node (head masih null), sehingga cetakan awal menunjukkan list kosong.
2. Digunakan sebagai pointer bantu untuk traversal tanpa mengubah head.
3. Menggunakan Scanner untuk input pengguna di class SLLMain06.

---

#### 2.2 Modifikasi Elemen pada Single Linked List

**Langkah-langkah:**

1. Menambahkan method `getData(int index)` untuk mengakses data tertentu.
2. Menambahkan method `indexOf(String key)` untuk mencari posisi NIM.
3. Menambahkan method `removeFirst()` dan `removeLast()` untuk menghapus dari awal dan akhir.
4. Menambahkan method `remove(String key)` dan `removeAt(int index)` untuk menghapus berdasarkan NIM dan posisi.
5. Mencetak hasil percobaan di `SLLMain06` setelah penghapusan.

**Jawaban Pertanyaan:**

1. Untuk menghentikan proses pencarian setelah node ditemukan dan dihapus.
2. Untuk memastikan tail menunjuk ke node terakhir yang baru jika node terakhir sebelumnya dihapus.

---

