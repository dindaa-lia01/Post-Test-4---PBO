package models;
import java.time.LocalDate;

public class ObatResep extends Obat implements CetakInfo {
    private String anjuranDokter;
    private String nomorResep;

    public ObatResep(String namaObat, String kategori, LocalDate expiredDate, int stok, double harga,
                    String anjuranDokter, String nomorResep) {
        super(namaObat, kategori, expiredDate, stok, harga);
        this.anjuranDokter = anjuranDokter;
        this.nomorResep = nomorResep;
    }

    public String getAnjuranDokter() { return anjuranDokter; }
    public void setAnjuranDokter(String anjuranDokter) { this.anjuranDokter = anjuranDokter; }

    public String getNomorResep() { return nomorResep; }
    public void setNomorResep(String nomorResep) { this.nomorResep = nomorResep; }

    @Override
    public void tampilkanDetail() {
         System.out.println("[Obat Resep]");
    System.out.println("Nama Obat: " + getNamaObat());
    System.out.println("Kategori: " + getKategori());
    System.out.println("Expired Date: " + getExpiredDate());
    System.out.println("Stok: " + getStok());
    System.out.println("Harga: Rp" + getHarga());
    System.out.println("Nomor Resep : " + nomorResep);
    System.out.println("Anjuran     : " + anjuranDokter);
    }
}
