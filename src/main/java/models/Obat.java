package models;
import java.time.LocalDate;

public abstract class Obat {
    private String namaObat;
    private String kategori;
    private LocalDate expiredDate;
    private int stok;
    private double harga;

    public Obat(String namaObat, String kategori, LocalDate expiredDate, int stok, double harga) {
        this.namaObat = namaObat;
        this.kategori = kategori;
        this.expiredDate = expiredDate;
        this.stok = stok;
        this.harga = harga;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

//    public void tampilkanObat() {
//        System.out.println("Nama Obat: " + namaObat);
//        System.out.println("Kategori: " + kategori);
//        System.out.println("Expired Date: " + expiredDate);
//        System.out.println("Stok: " + stok);
//        System.out.println("Harga: Rp" + harga);
//    }
  
    public abstract void tampilkanDetail();


}
