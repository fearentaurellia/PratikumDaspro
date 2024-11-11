//package Praktikum06;
import java.util.Scanner;

public class Pemilihan2Percobaan206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon = 0, harga = 0;
        double totalBayar;
        int potonganQris = 1000;

        System.out.println("--------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("--------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = sc.nextLine();
        System.out.println("------------------------------");

        if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            // Menghitung total bayar setelah diskon
            double total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else if (member.equalsIgnoreCase("n")) { // Menggunakan equalsIgnoreCase untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("==============================");


    totalBayar = harga - (harga * diskon);
    System.out.println("Total bayar setelah diskon: " + totalBayar);

    System.out.print("Jenis Pembayaran: ");
    String jenisPembayaran = sc.next();
    System.out.println("---------------------------------------");

    if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
        totalBayar -= potonganQris;
        System.out.println("Potongan QRIS sebesar Rp. 1.000 diterapkan.");
   
        System.out.println("Total bayar setelah diskon dan potongan: " + totalBayar);
        System.out.println("---------------------------------------");
   
   }        
    }
}

