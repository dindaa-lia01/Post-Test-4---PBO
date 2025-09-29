package models;
import java.time.LocalDate;

public class ObatBebas extends Obat implements CetakInfo  {
    private String anjuranLabel;
    private String golongan;  

    public ObatBebas(String namaObat, String kategori, LocalDate expiredDate, int stok, double harga,
                 String anjuranLabel, String golongan) {
        super (namaObat, kategori, expiredDate, stok, harga);
        this.anjuranLabel = anjuranLabel;
        this.golongan = golongan;
    }

    public String getAnjuranLabel() { return anjuranLabel; }
    public void setAnjuranLabel(String anjuranLabel) { this.anjuranLabel = anjuranLabel; }

    public String getGolongan() { return golongan; }
    public void setGolongan(String golongan) { this.golongan = golongan; }

    @Override
       public String getKategori() {
           return "Obat Bebas";
       }
    public void tampilkanDetail() {
    System.out.println("[Obat Bebas]");
    System.out.println("Nama Obat: " + getNamaObat());
    System.out.println("Kategori: " + getKategori());
    System.out.println("Expired Date: " + getExpiredDate());
    System.out.println("Stok: " + getStok());
    System.out.println("Harga: Rp" + getHarga());
    System.out.println("Golongan : " + golongan);
    System.out.println("Anjuran  : " + anjuranLabel);
    }
}           
