Nama: Dinda Aulia Rizky NIM: 2409116076 KELAS: B'24

# ***Manajemen Daftar Obat di Apotek***

Program manajemen obat di apotek ini tidak hanya mendukung operasi CRUD, tetapi juga sudah menerapkan konsep utama pemrograman berorientasi objek (OOP). Pertama, konsep encapsulation diterapkan dengan menjadikan atribut di setiap class sebagai private, lalu menyediakan method getter dan setter untuk mengakses serta mengubah nilainya. Hal ini menjaga keamanan data obat agar tidak bisa diubah sembarangan dari luar class.

Selanjutnya, program juga menggunakan inheritance dengan menjadikan class Obat sebagai superclass yang menyimpan atribut umum, kemudian diturunkan ke dua subclass yaitu ObatBebas dan ObatResep. Masing-masing subclass memiliki tambahan atribut khusus sesuai jenisnya, sehingga kode menjadi lebih terstruktur dan tidak perlu menulis ulang atribut yang sama. Selain itu, program menerapkan overriding pada method tampilkanObat(). Dengan overriding, setiap subclass dapat menampilkan informasi tambahan sesuai kebutuhan, misalnya ObatBebas menampilkan golongan obat dan anjuran label, sedangkan ObatResep menampilkan nomor resep dan anjuran dokter.

Dengan penerapan ketiga konsep ini, program menjadi lebih aman, rapi, dan fleksibel. Data obat terjaga konsistensinya, kode lebih mudah dipahami, serta program siap dikembangkan lebih lanjut jika ingin menambah jenis obat baru di masa depan.

## A. Penjelasan Encapsulation

Penerapan encapsulation ini diterapkan pada package models, yakni pada class obat.

 - Package dan Import
     
   Kode ini menunjukkan bahwa kelas Obat berada dalam package bernama models, yang biasanya digunakan untuk menyimpan struktur data atau entitas. Selain itu, terdapat import java.time.LocalDate; yang digunakan untuk mengimpor class LocalDate dari library Java. LocalDate dipakai untuk menyimpan informasi tanggal kedaluwarsa obat, sehingga lebih akurat dibandingkan hanya menggunakan String.

   <img width="271" height="62" alt="image" src="https://github.com/user-attachments/assets/aa949e34-6297-4e5c-8ff4-18a67e0a9ad6" />

  - Deklarasi Kelas dan Konstruktor

    Kode ini mendefinisikan sebuah kelas bernama Obat yang berada dalam konsep Object-Oriented Programming (OOP). Di dalamnya terdapat atribut privat yaitu namaObat, kategori, expiredDate, stok, dan harga. Atribut-atribut ini diset sebagai private agar hanya bisa diakses melalui method khusus (getter dan setter), sehingga mendukung prinsip enkapsulasi. Pada bagian konstruktor public Obat(...), terdapat parameter untuk mengisi data awal dari atribut kelas. Keyword this digunakan untuk membedakan antara variabel lokal dengan atribut kelas, contohnya this.namaObat = namaObat;. Pada class obat ini akan dijadikan sebagai superclass, dimana nantinya akan menjadi kelas induk yang mewariskan  property dan method pada subclass

      <img width="1086" height="522" alt="image" src="https://github.com/user-attachments/assets/98b58d5f-a1b5-4ef1-a09b-e70a4676bb35" />


  - Getter dan Setter

    Bagian ini berisi kumpulan getter dan setter untuk setiap atribut. Getter seperti getNamaObat() berfungsi mengembalikan nilai dari atribut tertentu, sedangkan setter seperti setNamaObat(String namaObat) berfungsi mengubah nilai atribut tersebut. Pola ini berlaku untuk semua atribut: namaObat, kategori, expiredDate, stok, dan harga. Dengan adanya getter dan setter, akses data menjadi lebih aman dan fleksibel, karena program tidak langsung memanipulasi atribut, tetapi melalui method yang sudah disediakan.

    <img width="529" height="607" alt="image" src="https://github.com/user-attachments/assets/f6bc6a83-b071-47f9-93cb-14691026ab90" />

    <img width="519" height="603" alt="image" src="https://github.com/user-attachments/assets/67dcb2e7-5307-48d2-85d2-f866b8763b38" />

 - Method tampilkanDetail()

   <img width="479" height="64" alt="image" src="https://github.com/user-attachments/assets/cbb0bdce-0ef4-4383-976f-bcafa97b5acb" />

   Menunjukkan method public abstract void tampilkanDetail();. Method ini bersifat abstrak, artinya hanya didefinisikan tapi belum memiliki isi. Subclass yang mewarisi kelas Obat wajib mengimplementasikan method ini. Inilah salah satu cara abstraction bekerja, yaitu memaksa subclass untuk menentukan detail implementasi sesuai kebutuhan masing-masing.
   
## B. Penjelasan Inheritance & Overiding

Penerapan inheritance ini dilakukan pada package models dengan menjadikan class obat menjadi superclass, lalu menambahkan 2 subclass yakni ObatBebas dan ObatResep.

### 1. Subclass ObatBebas

  - Konstruktor dan Atribut

    Pada gambar ini terlihat deklarasi class ObatBebas yang merupakan subclass dari Obat dan juga mengimplementasikan interface CetakInfo. Di dalamnya terdapat atribut tambahan anjuranLabel dan golongan yang khusus dimiliki oleh obat bebas. Constructor digunakan untuk menginisialisasi atribut dari superclass (Obat) sekaligus atribut tambahan tersebut. Jadi setiap kali objek ObatBebas dibuat, nama obat, kategori, expired date, stok, harga, serta anjuran dan golongan langsung tersimpan.   
    <img width="1113" height="366" alt="image" src="https://github.com/user-attachments/assets/3440a835-9c94-4133-aa1f-32af5e6bec52" />

 
  - Getter dan Setter

    Method getter dan setter yang digunakan sebagai penerapan encapsulation. Method getAnjuranLabel() dan setAnjuranLabel() digunakan untuk mengambil dan mengubah aturan pemakaian obat yang tertera pada label, sedangkan getGolongan() dan setGolongan() digunakan untuk membaca serta mengubah kategori atau golongan obat. Dengan cara ini, data tetap terjaga karena atribut bersifat private dan hanya bisa diakses melalui method resmi.

    <img width="800" height="166" alt="Screenshot 2025-09-21 032616" src="https://github.com/user-attachments/assets/ec98bbf3-6d44-4a20-a23a-adb172e83724" />
     
  - Overriding Method
    
    Menunjukkan implementasi overriding pada method tampilkanDetail(). Method ini menimpa method abstrak dari superclass Obat, sehingga detail khusus untuk obat bebas dapat ditampilkan. Di sini dicetak informasi seperti nama obat, kategori, expired date, stok, harga, golongan, dan anjuran label. Ada juga method tambahan getKategori() yang mengembalikan string "Obat Bebas". Jadi saat dipanggil, sistem tahu bahwa ini adalah obat bebas, bukan obat resep.
    
    <img width="656" height="518" alt="image" src="https://github.com/user-attachments/assets/b051e9b8-1906-4935-acd8-2eda2abf95f5" />

### 2. Subclass ObatResep

  - Konstruktor dan Atribut
 
    Kode ini mendefinisikan kelas ObatResep yang merupakan subclass dari Obat sekaligus mengimplementasikan interface CetakInfo. Di dalamnya terdapat dua atribut khusus, yaitu anjuranDokter yang menyimpan instruksi dari dokter mengenai penggunaan obat, dan nomorResep yang menyimpan identitas resep obat. Konstruktor pada kelas ini menerima parameter tambahan berupa anjuranDokter dan nomorResep, lalu menginisialisasinya ke atribut kelas. Dengan cara ini, setiap objek ObatResep akan memiliki informasi tambahan yang hanya dimiliki obat yang membutuhkan resep.
    <img width="1146" height="362" alt="image" src="https://github.com/user-attachments/assets/f2d772cd-d1e4-43b2-98e2-232bdc47690a" />

  - Getter dan Setter

    Gambar ini menunjukkan penerapan encapsulation. Atribut anjuranDokter dan nomorResep bersifat private, sehingga tidak bisa diakses langsung dari luar class. Untuk itu, dibuat method getter (getAnjuranDokter(), getNomorResep()) untuk mengambil data, dan setter (setAnjuranDokter(), setNomorResep()) untuk mengubah data. Dengan cara ini, keamanan dan keteraturan data lebih terjaga karena hanya bisa diakses melalui method yang sudah disediakan.

    <img width="829" height="187" alt="image" src="https://github.com/user-attachments/assets/4665640a-f6ac-410c-8837-e5bd07ca6a9b" />

  - Overriding Method

     Kode ini menunjukkan implementasi metode tampilkanDetail() yang merupakan bentuk overriding dari metode abstrak yang ada di superclass Obat. Dalam metode ini, informasi detail obat resep dicetak ke layar, meliputi nama obat, kategori, tanggal kedaluwarsa, stok, harga, serta tambahan khusus berupa nomorResep dan anjuranDokter. Overriding ini memungkinkan tampilan data obat resep berbeda dengan obat bebas, sehingga program mendukung polymorphism saat memanggil metode yang sama (tampilkanDetail) tapi dengan hasil berbeda sesuai subclass-nya.

     <img width="658" height="397" alt="image" src="https://github.com/user-attachments/assets/4810576e-7878-435a-815e-287b965d566e" />

### 3. Pembaruan pada package service

   Pembaruan pada package service ini dilakukan karena adanya penambahan inheritance pada package models sebelumnya.

   - Konstruktor

     Pada bagian ini, konstruktor obatService() langsung menambahkan beberapa data obat contoh ke dalam daftarObat. Data tersebut menggunakan subclass ObatBebas dan ObatResep. Tujuannya agar saat program pertama dijalankan, sudah ada data obat yang bisa ditampilkan tanpa harus menambahkannya secara manual dulu. Ini juga menunjukkan implementasi inheritance, karena objek dari subclass bisa dimasukkan ke ArrayList yang bertipe Obat (superclass).

     <img width="962" height="385" alt="Screenshot 2025-09-21 145900" src="https://github.com/user-attachments/assets/aa13aec0-054f-46f9-961d-47e50a59963d" />

   - Method tambahObat()

     Method ini digunakan untuk menambah obat baru. Program menampilkan pilihan jenis obat (bebas atau resep), kemudian meminta input dari pengguna untuk mengisi data dasar seperti nama obat, kategori, tanggal kedaluwarsa, stok, dan harga. Input ini berlaku untuk semua jenis obat, karena bagian ini masih mencakup atribut dari superclass Obat.

     <img width="737" height="782" alt="Screenshot 2025-09-21 150121" src="https://github.com/user-attachments/assets/bd970dde-c128-4925-8f4c-e22976c8d109" />

     Bagian ini memisahkan logika berdasarkan pilihan jenis obat:

     - Jika Obat Bebas, pengguna diminta mengisi anjuran label dan golongan obat. Namun, jika golongan obat diisi "KERAS", program akan menolak dengan pesan bahwa obat keras tidak bisa dibeli tanpa resep dokter.

     - Jika Obat Resep, pengguna diminta memasukkan nomor resep dan anjuran dokter.
Setelah data dilengkapi, objek obat baru dibuat sesuai jenisnya lalu dimasukkan ke dalam daftarObat.

       <img width="847" height="794" alt="Screenshot 2025-09-21 150315" src="https://github.com/user-attachments/assets/d902439a-2e59-4754-a137-089f2adcd4bd" />

  - Method updateObat()

    Method ini digunakan untuk memperbarui data obat yang sudah ada. Pertama, daftar obat ditampilkan lalu pengguna memilih nomor obat yang ingin diupdate. Setelah itu, program memberikan kesempatan untuk mengganti atribut umum seperti nama, kategori, stok, dan harga. Jika input dibiarkan kosong, maka data lama tetap dipakai.

    <img width="664" height="695" alt="Screenshot 2025-09-21 150357" src="https://github.com/user-attachments/assets/43dbddc0-603d-42c6-b27b-e030109e4166" />

     Bagian ini menggunakan instanceof untuk mengecek apakah obat yang dipilih merupakan ObatBebas atau ObatResep.

     - Jika ObatBebas, pengguna bisa memperbarui anjuran label dan golongan obat.

     - Jika ObatResep, pengguna bisa memperbarui nomor resep dan anjuran dokter. Dengan begitu, setiap jenis obat punya data spesifik yang bisa dikelola sesuai kebutuhannya.

       <img width="612" height="766" alt="Screenshot 2025-09-21 150413" src="https://github.com/user-attachments/assets/162d2c83-6c15-4245-9f25-749ebab17643" />

  - Overloading

    Pada gambar ini terlihat ada dua method cariObat dengan parameter berbeda. Method pertama hanya menerima parameter String keyword, yang berfungsi untuk mencari obat berdasarkan nama obat. Sedangkan method kedua memiliki parameter tambahan boolean byKategori, yang dipakai untuk membedakan pencarian berdasarkan kategori obat. Kedua method ini adalah contoh Polymorphism melalui Overloading, karena nama method sama (cariObat) tetapi jumlah atau tipe parameternya berbeda. Dengan begitu, pengguna bisa memanggil method yang sesuai kebutuhan apakah ingin mencari berdasarkan nama atau kategori.

    <img width="945" height="875" alt="image" src="https://github.com/user-attachments/assets/d1dee28e-1caa-44ab-9518-103deb412726" />

  - Interface

    Pada gambar ini terlihat sebuah interface bernama CetakInfo yang memiliki satu method abstrak tampilkanDetail(). Interface ini digunakan sebagai kontrak bahwa setiap class yang mengimplementasikannya harus menyediakan implementasi dari method tersebut. Dalam programmu, ObatBebas dan ObatResep mengimplementasikan interface ini, sehingga mereka wajib menuliskan kode untuk menampilkan detail obat sesuai tipe masing-masing. Ini adalah penerapan dari Abstraction dengan cara menggunakan interface.

    <img width="328" height="193" alt="Screenshot 2025-09-29 153730" src="https://github.com/user-attachments/assets/14f4fefa-17a5-4756-b222-58c6cd01639a" />

   - Penggunaan Polymorphism (overloading) di package main
        
     Pada foto pertama terlihat potongan kode di bagian case 5 dalam kelas Apotek.java, di mana program memberikan opsi kepada pengguna untuk melakukan pencarian obat berdasarkan dua kriteria, yaitu nama obat atau kategori. Jika pengguna memilih opsi 1, maka program akan memanggil method cariObat(keyword) untuk mencari obat berdasarkan nama, sedangkan jika memilih opsi 2 maka program akan memanggil method cariObat(keyword, true) untuk mencari obat berdasarkan kategori. Struktur ini menunjukkan penerapan polymorphism melalui method overloading, karena terdapat dua method cariObat dengan parameter berbeda yang dipanggil sesuai kebutuhan input pengguna.

     <img width="626" height="651" alt="Screenshot 2025-09-29 170857" src="https://github.com/user-attachments/assets/6908b4fb-399a-4c83-936a-ad89a5cb2578" />


# B. Penjelasan Alur Output

Penjelasan alur output ini hanya pada kode yang dilakukan perubahan, yakni terdapat pada menu tampilkan obat, tambah obat, dan update.

1. Tampilkan Obat

   Program menampilkan semua obat yang ada di daftarObat, baik Obat Bebas maupun Obat Resep. Setiap obat ditampilkan dengan detail atributnya seperti nama, kategori, tanggal kedaluwarsa, stok, harga, serta atribut tambahan (misalnya golongan dan anjuran pada obat bebas, atau nomor resep dan anjuran dokter pada obat resep).
   
   <img width="718" height="1011" alt="image" src="https://github.com/user-attachments/assets/88be87c6-30e8-4563-9bf3-498d625bf061" />
   
2. Tambah Obat

   Saat user memilih menu 2 (Tambah Obat) lalu memilih jenis Obat Bebas. User diminta mengisi data obat baru, termasuk nama, kategori, expired date, stok, harga, anjuran, dan golongan. Jika data valid, objek ObatBebas baru dibuat menggunakan constructor dan ditambahkan ke daftarObat. Pesan “Obat berhasil ditambahkan!” muncul sebagai konfirmasi.
   
   <img width="583" height="422" alt="image" src="https://github.com/user-attachments/assets/fd8fe64b-4a9d-4b97-baa0-dffe08e0337e" />

   <img width="460" height="221" alt="image" src="https://github.com/user-attachments/assets/8ff1ad4a-b919-4c8e-b7c9-c388aab92b94" />


3. Update Obat

   Saat user memilih menu 3 (Update Obat) lalu memilih obat nomor 4. Program menampilkan data lama obat (Vitamin C), lalu meminta input baru untuk tiap atribut. User dapat mengosongkan input jika tidak ingin mengubah nilai lama. Setelah update, obat tersebut diperbarui di dalam list dan ditampilkan pesan “Obat berhasil diupdate!”.
   
   <img width="975" height="189" alt="image" src="https://github.com/user-attachments/assets/68e265d8-0e7b-4f49-b4e0-de41fab5e550" />

   <img width="664" height="218" alt="image" src="https://github.com/user-attachments/assets/38024667-5203-4f38-a537-b9b392c8c291" />


4. Cari Obat

   berikut hasil output program ketika dijalankan, yang membuktikan bahwa kedua pilihan pencarian berjalan dengan baik. Saat pengguna memilih opsi pencarian berdasarkan nama obat dan memasukkan keyword Amoxcillin, program berhasil menampilkan detail lengkap obat tersebut mulai dari kategori, tanggal kedaluwarsa, stok, harga, hingga informasi golongan dan anjuran. Selanjutnya ketika pengguna memilih pencarian berdasarkan kategori dengan keyword Analgesik, program menemukan obat dengan kategori tersebut yaitu Ibuprofen, dan menampilkan informasi detail yang sama lengkapnya. Hal ini menunjukkan bahwa overloading method cariObat benar-benar berfungsi sesuai dengan tujuan yang diinginkan.

   <img width="526" height="772" alt="Screenshot 2025-09-29 171048" src="https://github.com/user-attachments/assets/d8af7e72-ca72-45bb-b316-48d6ba891d2b" />

















