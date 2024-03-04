/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project123220032;

/**
 *
 * @author zalfa
 */
public class Pusat {
    public static void main(String[] args) {
        SkincarePagi skincarepagi = new SkincarePagi("Moisturizer", "Avoskin", 5);
        skincarepagi.status();
        skincarepagi.tutorial();
        skincarepagi.manfaat();
        skincarepagi.masapakai();
        
        SkincareSiang skincaresiang = new SkincareSiang("Sunscreen spray", "Skintific", 3);
        skincaresiang.status();
        skincaresiang.tutorial();
        skincaresiang.manfaat();
        skincaresiang.masapakai();
        
        SkincareMalam skincaremalam = new SkincareMalam("Micellar water", "Facetology", 7);
        skincaremalam.status();
        skincaremalam.tutorial();
        skincaremalam.manfaat();
        skincaremalam.masapakai();
    }
}
