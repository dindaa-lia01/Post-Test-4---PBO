package service;
import models.Obat;
import models.ObatBebas;
import models.ObatResep;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class obatService {
    private ArrayList<Obat> daftarObat = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // Konstruktor (isi data awal)
    public obatService() {;
        daftarObat.add(new ObatBebas("Amoxcillin", "Antibiotik",
                LocalDate.parse("01-12-2027", formatter), 120, 5000, "2x sehari sesudah makan", "Obat Keras"));
        daftarObat.add(new ObatBebas("Paracetamol", "Analgesik",
                LocalDate.parse("22-03-2028", formatter), 80, 12000, "3x sehari habis makan", "Bebas Terbatas"));
        daftarObat.add(new ObatResep("Ibuprofen", "Analgesik",
                LocalDate.parse("28-02-2028", formatter), 50, 8000, "2x sehari sesudah makan", "RX001"));
        daftarObat.add(new ObatResep("Vitamin C", "Suplemen",
                LocalDate.parse("01-01-2026", formatter), 100, 4000, "2x sehari sesudah makan", "ZR015"));
    }

    // Tambah Obat
    public void tambahObat() {
        try {
            System.out.println("1. Obat Bebas");
            System.out.println("2. Obat Resep");
            System.out.print("Pilih jenis: ");
            int jenis = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan nama obat: ");
            String nama = scanner.nextLine();
            if (nama.isEmpty()) {
                System.out.println("Nama obat tidak boleh kosong!");
                return;
            }

            System.out.print("Masukkan kategori: ");
            String kategori = scanner.nextLine();

            System.out.print("Masukkan expired date (dd-MM-yyyy): ");
            LocalDate expiredDate = LocalDate.parse(scanner.nextLine(), formatter);

            System.out.print("Masukkan stok: ");
            int stok = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan harga: ");
            double harga = Double.parseDouble(scanner.nextLine());

            if (jenis == 1) {
                // Obat Bebas
                System.out.print("Masukkan anjuran label: ");
                String anjuran = scanner.nextLine();

                System.out.print("Masukkan golongan (BEBAS/BEBAS_TERBATAS/KERAS): ");
                String golongan = scanner.nextLine();

                if (golongan.equalsIgnoreCase("KERAS")) {
                    System.out.println("❌ Obat keras tidak bisa dibeli tanpa resep dokter!");
                    return;
                }

                daftarObat.add(new ObatBebas(nama, kategori, expiredDate, stok, harga, anjuran, golongan));
            } else {
                // Obat Resep
                System.out.print("Masukkan nomor resep: ");
                String nomorResep = scanner.nextLine();

                System.out.print("Masukkan anjuran dokter: ");
                String anjuranDokter = scanner.nextLine();

                daftarObat.add(new ObatResep(nama, kategori, expiredDate, stok, harga, anjuranDokter, nomorResep));
            }

            System.out.println("Obat berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Input tidak valid! Silakan coba lagi.");
        }
    }

    // Tampilkan Daftar Obat
    public void tampilkanObat() {
        if (daftarObat.isEmpty()) {
            System.out.println("Daftar obat kosong.");
        } else {
            System.out.println("\n===== < Daftar Obat > =====");
            for (int i = 0; i < daftarObat.size(); i++) {
                System.out.println((i + 1) + ".");
                daftarObat.get(i).tampilkanDetail(); 
                System.out.println("---------------------------------");
            }
        }
    }

    // Update Obat
    public void updateObat() {
        tampilkanObat();
        if (daftarObat.isEmpty()) return;

        System.out.print("Pilih nomor obat yang ingin diupdate: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < daftarObat.size()) {
            Obat o = daftarObat.get(index);

            System.out.print("Nama baru (" + o.getNamaObat() + "): ");
            String namaBaru = scanner.nextLine();
            if (!namaBaru.isEmpty()) o.setNamaObat(namaBaru);

            System.out.print("Kategori baru (" + o.getKategori() + "): ");
            String kategoriBaru = scanner.nextLine();
            if (!kategoriBaru.isEmpty()) o.setKategori(kategoriBaru);

            System.out.print("Stok baru (" + o.getStok() + "): ");
            String stokInput = scanner.nextLine();
            if (!stokInput.isEmpty()) o.setStok(Integer.parseInt(stokInput));

            System.out.print("Harga baru (" + o.getHarga() + "): ");
            String hargaInput = scanner.nextLine();
            if (!hargaInput.isEmpty()) o.setHarga(Double.parseDouble(hargaInput));

            // Tambahan khusus ObatBebas
            if (o instanceof ObatBebas) {
                ObatBebas ob = (ObatBebas) o;
                System.out.print("Anjuran label baru (" + ob.getAnjuranLabel() + "): ");
                String anjuranBaru = scanner.nextLine();
                if (!anjuranBaru.isEmpty()) ob.setAnjuranLabel(anjuranBaru);

                System.out.print("Golongan baru (" + ob.getGolongan() + "): ");
                String golonganBaru = scanner.nextLine();
                if (!golonganBaru.isEmpty()) ob.setGolongan(golonganBaru);
            }

            // Tambahan khusus ObatResep
            if (o instanceof ObatResep) {
                ObatResep or = (ObatResep) o;
                System.out.print("Nomor resep baru (" + or.getNomorResep() + "): ");
                String resepBaru = scanner.nextLine();
                if (!resepBaru.isEmpty()) or.setNomorResep(resepBaru);

                System.out.print("Anjuran dokter baru (" + or.getAnjuranDokter() + "): ");
                String anjuranBaru = scanner.nextLine();
                if (!anjuranBaru.isEmpty()) or.setAnjuranDokter(anjuranBaru);
            }

            System.out.println("Obat berhasil diupdate!");
        } else {
            System.out.println("Nomor obat tidak valid!");
        }
    }

    // Hapus Obat
    public void hapusObat() {
        tampilkanObat();
        if (daftarObat.isEmpty()) return;

        System.out.print("Pilih nomor obat yang ingin dihapus: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < daftarObat.size()) {
            daftarObat.remove(index);
            System.out.println("Obat berhasil dihapus!");
        } else {
            System.out.println("Nomor obat tidak valid!");
        }
    }

    // Search Obat
   public void cariObat(String keyword) {
    boolean ditemukan = false;
    for (Obat o : daftarObat) {
        if (o.getNamaObat().toLowerCase().contains(keyword.toLowerCase())) {
            o.tampilkanDetail();
            ditemukan = true;
        }
    }
    if (!ditemukan) {
        System.out.println("Obat dengan kata kunci '" + keyword + "' tidak ditemukan.");
    }
}

public void cariObat(String keyword, boolean byKategori) {
    boolean ditemukan = false;
    for (Obat o : daftarObat) {
        if (o.getKategori().toLowerCase().contains(keyword.toLowerCase())) {
            o.tampilkanDetail();
            ditemukan = true;
        }
    }
    if (!ditemukan) {
        System.out.println("Obat dengan kategori '" + keyword + "' tidak ditemukan.");
    }
}
}
