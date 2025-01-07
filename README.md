🎯 HRM Web Automation Testing
📘 Tentang Project
Proyek ini merupakan bagian dari kerja praktek dalam Bootcamp Juara Coding SQA-RPA Batch 19 yang dipandu oleh instruktur Yanwar Solahuddin. Selama kerja praktek, kami berkesempatan untuk menguji sebuah website Human Resources Management (HRM) menggunakan pendekatan real case scenario.

Proses pengujian dimulai dengan System Integration Testing (SIT) dan manual testing, yang kemudian dilanjutkan dengan automation testing menggunakan alat dan framework modern. Waktu yang diberikan untuk menyelesaikan proyek ini adalah sekitar dua minggu, dan semua kegiatan pengujian dilakukan secara kolaboratif oleh kelompok 3.

🛠️ Tools/Alat yang Digunakan
Proyek ini menggunakan berbagai alat dan teknologi untuk mendukung proses pengujian manual dan otomatis. Berikut adalah daftar alat yang digunakan:

Selenium: Digunakan untuk melakukan web automation testing, memungkinkan pengujian interaksi pengguna dengan website.
TestNG: Digunakan untuk unit testing dan integrasi, serta untuk mengatur pengujian dalam skenario berbasis Java.
Cucumber BDD: Memfasilitasi pengujian berbasis Behavior-Driven Development dengan menggunakan skenario dalam format Gherkin.
Java: Bahasa pemrograman utama yang digunakan untuk pengembangan automation testing.
Git: Untuk version control dan manajemen kode sumber selama pengembangan proyek.
Maven: Digunakan untuk mengelola dependensi dan build project.
ChromeDriver: Driver yang digunakan oleh Selenium untuk mengontrol browser Chrome saat pengujian otomatis.
🔍 Modul/Fitur yang Diuji
Selama proyek ini, beberapa modul dan fitur utama dari website HRM diuji untuk memastikan kinerja dan fungsionalitasnya berjalan dengan baik. Berikut adalah daftar fitur yang diuji:

1. Fitur Izin Pulang Cepat
Menguji proses pengajuan izin untuk pulang lebih cepat.
Verifikasi apakah pengajuan izin diproses dan disetujui sesuai dengan alur yang benar.
2. Fitur Absen Point
Menguji sistem absensi berbasis point.
Memastikan bahwa sistem mencatat kehadiran karyawan dan menghasilkan point yang sesuai dengan absen harian.
3. Fitur Client Upliner
Menguji pengelolaan data client upliner dalam sistem.
Memastikan data client upliner ditambahkan dan ditampilkan dengan benar di halaman sistem.
4. Fitur Divisi
Menguji fitur untuk menambah, mengedit, dan menghapus data divisi.
Memastikan bahwa perubahan data divisi tercermin dengan tepat dalam sistem.
5. Fitur Jabatan
Menguji pengelolaan jabatan karyawan.
Verifikasi apakah jabatan yang ditetapkan untuk karyawan sesuai dan tercatat dengan benar.
🛠️ Instalasi
Untuk memulai dengan proyek ini, ikuti langkah-langkah instalasi berikut:

Clone repository ini:

bash
Copy code
git clone https://github.com/username/nama-repository.git
Masuk ke direktori proyek:

bash
Copy code
cd nama-repository
Instal dependensi menggunakan Maven: Pastikan Anda telah menginstal Maven di sistem Anda, kemudian jalankan:

bash
Copy code
mvn install
Persiapkan ChromeDriver: Unduh dan tempatkan ChromeDriver sesuai versi browser Chrome yang Anda gunakan. Pastikan path ke ChromeDriver diatur dalam kode (misalnya, C:\MyTools\chromedriver.exe).

Jalankan pengujian: Untuk menjalankan semua pengujian otomatis menggunakan TestNG, gunakan perintah berikut:

bash
Copy code
mvn test
Hasil pengujian akan tersedia dalam folder target/reports.

