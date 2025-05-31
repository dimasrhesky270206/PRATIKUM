

|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020209|
| Nama |  DIMAS HANDARHESKY IRIANTO |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/dimasrhesky270206) |

# Double Linked Lists

## 12.2.1 Percobaan 1
 ![Screenshot](/img/Screenshot%202025-05-25%20015125.png)	
***

  **Pertanyaan :**
  1. **Jelaskan perbedaan antara single linked list dengan double linked lists!**
Perbedaan utama antara _single linked list_ dan _double linked list_ terletak pada arah hubungan antar nodenya:

-   Single linked list : Setiap node hanya memiliki satu pointer yang menunjuk ke node berikutnya.
    
-   Double linked list : Setiap node memiliki dua pointer, yaitu ke node sebelumnya (_prev_) dan node berikutnya (_next_), sehingga traversal bisa dilakukan dua arah.
 2. **Perhatikan class Node01, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?**
- Atribut `next` digunakan untuk menunjuk ke node berikutnya, sedangkan `prev` digunakan untuk menunjuk ke node sebelumnya. Keduanya memungkinkan traversal data dalam dua arah pada struktur double linked list.

 3. **Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan dari konstruktor tersebut?**

	    public  DoubleLinkedlist18(){
		    head  =  null;
		    tail  =  null;
	    }
- Konstruktor `DoubleLinkedlist18()` berfungsi untuk menginisialisasi linked list saat pertama kali dibuat. Dengan menetapkan `head` dan `tail` ke `null`, konstruktor menandakan bahwa linked list masih kosong.
 4. **Pada method addFirst(), apa maksud dari kode berikut?**

	    if (isEmpty()) {
		    head  =  tail  =  newNode;

- Untuk Menambahkan data pertama kali saat linkedlist masih kosong.
5. **Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?**
- Statement `head.prev = newNode;` berarti menghubungkan node baru ke node yang sebelumnya menjadi head. Ini dilakukan dengan menjadikan `newNode` sebagai node sebelumnya (prev) dari `head`, sehingga terbentuk koneksi dua arah antar node dalam double linked list.
6. **Modifikasi code pada fungsi print() agar dapat menampilkan warning/ pesan bahwa linked lists masih dalam kondisi kosong.**
 ![Screenshot](/img/Screenshot%202025-05-25%20015152.png)	
7. **Pada insertAfter(), apa maksud dari kode berikut ?**

	    current.next.prev  =  newNode;

- Kode `current.next.prev = newNode;` berarti mengatur node baru (`newNode`) sebagai node sebelumnya (`prev`) dari node yang awalnya berada setelah `current`.
8. **Modifikasi menu pilihan dan switch-case agar fungsi insertAfter() masuk ke dalam menu pilihan dan dapat berjalan dengan baik.**
 ![Screenshot](/img/Screenshot%202025-05-25%20015414.png)	
***
## 12.3.1 Tahapan Percobaan 2


 ![Screenshot](/img/Screenshot%202025-05-25%20015537.png)
***
  **Pertanyaan :**
  1. **Apakah maksud statement berikut pada method removeFirst()?**

		 head  =  head.next;
		 head.prev  =  null;
- Kedua baris itu digunakan untuk menghapus node pertama dari double linked list dan memastikan hubungan dua arah tetap konsisten.
2. **Modifikasi kode program untuk menampilkan pesan “Data sudah berhasil dihapus. Data yang terhapus adalah …**
 ![Screenshot](/img/Screenshot%202025-05-25%20015611.png)
 ***

## Tugas 1
![Screenshot](/img/Screenshot%202025-05-25%20013659.png)

![Screenshot](/img/Screenshot%202025-05-25%20013726.png) 

![Screenshot](/img/Screenshot%202025-05-25%20013753.png) 

![Screenshot](/img/Screenshot%202025-05-25%20013825.png) 

![Screenshot](/img/Screenshot%202025-05-25%20013846.png)

![Screenshot](/img/Screenshot%202025-05-25%20013905.png) 
***

***
## Terima Kasih :)