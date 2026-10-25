/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.poskedaikopi;

import java.util.ArrayList;

public class Transaksi {

    private ArrayList<Produk> keranjang = new ArrayList<>();
    private ArrayList<Integer> jumlahPesanan = new ArrayList<>();

    public void tambahPesanan(Produk produk, int jumlah) {
        if (jumlah > 0) {
            keranjang.add(produk);
            jumlahPesanan.add(jumlah);
            System.out.println("Pesanan berhasil ditambahkan!");
        } else {
            System.out.println("Jumlah harus lebih dari 0!");
        }
    }

    public void tampilkanKeranjang() {
        if (keranjang.isEmpty()) {
            System.out.println("Keranjang masih kosong.");
            return;
        }

        int total = 0;

        for (int i = 0; i < keranjang.size(); i++) {
            int subtotal = keranjang.get(i).getHarga()
                    * jumlahPesanan.get(i);

            System.out.println("\nNama Produk: "
                    + keranjang.get(i).getNama());
            System.out.println("Jumlah: " + jumlahPesanan.get(i));
            System.out.println("Subtotal: Rp" + subtotal);

            total += subtotal;
        }

        System.out.println("\nTotal Pesanan: Rp" + total);
    }

    public int hitungTotal() {
        int total = 0;

        for (int i = 0; i < keranjang.size(); i++) {
            total += keranjang.get(i).getHarga()
                    * jumlahPesanan.get(i);
        }

        return total;
    }

    public boolean isKosong() {
        return keranjang.isEmpty();
    }

    public void kosongkanKeranjang() {
        keranjang.clear();
        jumlahPesanan.clear();
    }
    
    public void tampilkanStruk(int uang) {
        System.out.println("\n================================");
        System.out.println("       STRUK KEDAI KOPI");
        System.out.println("================================");

    int total = hitungTotal();

    for (int i = 0; i < keranjang.size(); i++) {
        int subtotal = keranjang.get(i).getHarga()
                * jumlahPesanan.get(i);

        System.out.println(keranjang.get(i).getNama());
        System.out.println("Harga  : Rp" + keranjang.get(i).getHarga());
        System.out.println("Jumlah : " + jumlahPesanan.get(i));
        System.out.println("Subtotal: Rp" + subtotal);
        System.out.println("--------------------------------");
    }

    System.out.println("Total      : Rp" + total);
    System.out.println("Uang Bayar : Rp" + uang);
    System.out.println("Kembalian  : Rp" + (uang - total));
    System.out.println("================================");
    System.out.println("    Terima kasih telah membeli!");
    System.out.println("================================");
}

}
