/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */




package com.mycompany.poskedaikopi;

import java.util.Scanner;

public class POSKedaiKopi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        Produk[] daftarProduk = {
            new Minuman("Kopi Hitam", 10000, "Regular"),
            new Minuman("Cappuccino", 15000, "Large"),
            new Minuman("Cafe Latte", 18000, "Large"),
            new Makanan("Roti Bakar", 12000, "Camilan"),
            new Makanan("Kentang Goreng", 15000, "Camilan")
        };

        Transaksi transaksi = new Transaksi();

        do {
            System.out.println("\n================================");
            System.out.println("       POS KEDAI KOPI JAVA");
            System.out.println("================================");
            System.out.println("1. Lihat Daftar Menu");
            System.out.println("2. Tambah Pesanan");
            System.out.println("3. Lihat Keranjang");
            System.out.println("4. Pembayaran");
            System.out.println("5. Keluar");
            System.out.println("================================");
            System.out.print("Pilih menu: ");
     
        try {
            pilihan = input.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input harus berupa angka!");

            input.nextLine();
            continue;
        }

            switch (pilihan) {
                case 1:
                    System.out.println("\n========== DAFTAR MENU ==========");

                    for (int i = 0; i < daftarProduk.length; i++) {
                        System.out.println("\nNomor Menu: " + (i + 1));
                        daftarProduk[i].tampilkanInfo();
                    }
                    break;

                case 2:
                    System.out.println("\n========== TAMBAH PESANAN ==========");

                    for (int i = 0; i < daftarProduk.length; i++) {
                        System.out.println((i + 1) + ". "
                                + daftarProduk[i].getNama()
                                + " - Rp" + daftarProduk[i].getHarga());
                    }

                    System.out.print("Pilih nomor menu: ");
                    int nomor = input.nextInt();

                    if (nomor >= 1 && nomor <= daftarProduk.length) {
                        
                    System.out.print("Masukkan jumlah: ");

                    int jumlah;

                    try {
                        jumlah = input.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Jumlah harus berupa angka!");
                        input.nextLine();
                        break;
                    }


                        transaksi.tambahPesanan(
                                daftarProduk[nomor - 1], jumlah);
                    } else {
                        System.out.println("Nomor menu tidak valid!");
                    }
                    break;

                case 3:
                    System.out.println("\n========== KERANJANG ==========");
                    transaksi.tampilkanKeranjang();
                    break;

                case 4:
                    System.out.println("\n========== PEMBAYARAN ==========");

                    if (transaksi.isKosong()) {
                        System.out.println("Belum ada pesanan!");
                    } else {
                        int total = transaksi.hitungTotal();

                        System.out.println("Total pembayaran: Rp" + total);                        
                        System.out.print("Masukkan uang pembayaran: Rp");
                        int uang;

                        try {
                            uang = input.nextInt();
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Uang pembayaran harus berupa angka!");
                            input.nextLine();
                            break;
                        }
                        
                    if (uang >= total) {
                        System.out.println("Pembayaran berhasil!");

                        transaksi.tampilkanStruk(uang);
                        transaksi.kosongkanKeranjang();
                    } else {
                        System.out.println("Uang tidak cukup!");
                        System.out.println("Pesanan tetap tersimpan.");
                    }

                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan POS!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
