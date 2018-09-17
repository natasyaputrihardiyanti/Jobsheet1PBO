/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanLanjutan;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Lat2 {
    public static void main (String[]args){
       Scanner hm = new Scanner(System.in);
       int pilihan=9 ;
       
       do{ 
           System.out.println("\nMENU LUAS BANGUN\n");
           System.out.println("1. Menghitung luas persegi");
           System.out.println("2. Menghitung Luas Persegi Panjang");
           System.out.println("3. Keluar");
           System.out.println("Masukan Pilihan Anda : ");
           pilihan = hm.nextInt();
           
           switch(pilihan){
               case 1 : luaspersegi();break;
               case 2 : luaspersegipanjang(); break;
           }
       } while (pilihan !=3);
    }
    private static void luaspersegi(){
        Scanner hm = new Scanner(System.in);
        float sisi , luas;
        System.out.print("Masukan nilai sisi : ");
        sisi = hm.nextFloat();
        luas= sisi*sisi;
        System.out.println("Luas Persegi adalah : "+luas);
    }

                 private static void luaspersegipanjang(){
                      Scanner hm = new Scanner(System.in);
                      float panjang , lebar , luas ;
                      System.out.print("Masukan nilai panjang : ");
                      panjang = hm.nextFloat();
                      System.out.print("Masukan nilai lebar : ");
                      lebar = hm.nextFloat();
                      luas = panjang *lebar ;
                      System.out.println("Luas Persegi Panjang Adalah : "+ luas);
                      
                      
           }
       }
    

