package main;
import service.obatService;
import java.util.Scanner;


public class Apotek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        obatService obatService = new obatService();
        
        int pilihan;
        do {
            System.out.println("\n---------< Manajemen Daftar Obat di Apotek >---------");
            System.out.println("1. Tampilkan Daftar Obat");
            System.out.println("2. Tambah Obat");
            System.out.println("3. Update Stok");
            System.out.println("4. Hapus Daftar");
            System.out.println("5. Cari Obat");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu:  ");
            
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1 -> obatService.tampilkanObat();
                case 2 -> obatService.tambahObat();
                case 3 -> obatService.updateObat();
                case 4 -> obatService.hapusObat();
                case 5 -> {System.out.println("Cari berdasarkan: ");
                                System.out.println("1. Nama Obat");
                                System.out.println("2. Kategori");
                                System.out.print("Pilih: ");
                                int pilihCari = scanner.nextInt();
                                scanner.nextLine(); 

                                System.out.print("Masukkan keyword: ");
                                String keyword = scanner.nextLine();

                                if (pilihCari == 1) {
                                    obatService.cariObat(keyword);          
                                } else if (pilihCari == 2) {
                                    obatService.cariObat(keyword, true);    
                                } else {
                                    System.out.println("Pilihan tidak valid!");
                                }
                            }
                case 6 -> System.out.println("Terima kasih telah menggunakan program! \nProgram selesai.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
    }
}
