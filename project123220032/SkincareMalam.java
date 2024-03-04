/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project123220032;

/**
 *
 * @author zalfa
 */
public class SkincareMalam extends Skincare implements InfoProduk{
    public SkincareMalam(String jenis, String merk, int bulan){
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
        System.out.println(jenis + " tuangkan ke kapas, lalu usap ke wajah");
    }
    
    @Override
    public void manfaat(){
        System.out.println(jenis + " " + merk + " untuk double cleansing");
    }
    
    @Override
    public void masapakai(){
        System.out.println(jenis + " " + merk + " dapat digunakan selama " + bulan + " bulan" );
    }
    
}
