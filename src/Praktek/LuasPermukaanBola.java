/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class LuasPermukaanBola {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        System.out.println("Menghitung Luas Permukaan Balok ");
        System.out.println("======================================");
        int  r ;
       
       
        
      
        System.out.print("Masukan jari- jari :");
        r = masukan.nextInt();
  
        
        System.out.println("Luas permukaan bola adalah = "+(4*r*r*22/7));
        
        
        
    }
}
