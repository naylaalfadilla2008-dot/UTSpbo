/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poskedaikopi;

/**
 *
 * @author ASUS
 */
public class Minuman extends Produk {
    private String ukuran;

    public Minuman(String nama, int harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Minuman : " + getNama());
        System.out.println("Harga        : Rp" + getHarga());
        System.out.println("Ukuran       : " + ukuran);
    }
    
}
