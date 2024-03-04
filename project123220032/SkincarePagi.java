/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project123220032;

/**
 *
 * @author zalfa
 */
public class SkincarePagi extends Skincare implements InfoProduk{
    public SkincarePagi(String jenis, String merk, int bulan){
        super(jenis, merk, bulan);
    }
    
    @Override
    public void status(){
        System.out.println("Info Produk :");
        System.out.println("Jenis     : " + jenis);
        System.out.println("Merk      : " + merk);
    }
    
    @Override
    public void tutorial(){
        System.out.println(jenis + " dioleskan ke seluruh wajah");
    }
    
    @Override
    public void manfaat(){
        System.out.println(jenis + " " + merk + " untuk melembabkan wajah");
    }
    
    @Override
    public void masapakai(){
        System.out.println(jenis + " " + merk + " dapat digunakan selama " + bulan + " bulan" );
    }
    
}
