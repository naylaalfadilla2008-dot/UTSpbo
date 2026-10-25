/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poskedaikopi;

/**
 *
 * @author ASUS
 */
public class Makanan extends Produk {

    private String jenis;

    public Makanan(String nama, int harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Makanan : " + getNama());
        System.out.println("Harga        : Rp" + getHarga());
        System.out.println("Jenis        : " + jenis);
    }
}
