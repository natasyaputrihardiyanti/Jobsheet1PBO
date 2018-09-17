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
public class lat3 {
    public static void main(String args[]){
        Scanner hm = new Scanner(System.in);
        int a, b , c;
        System.out.println("Progam Munjumlahkan 2 nilai");
        System.out.print("Masukan nilai a : ");
        a = hm.nextInt();
        System.out.print("Masukan nilai b : ");
        b = hm.nextInt();
        System.out.print("Masukan nilai c : ");
        c = hm.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));
    }
    private static int jumlah(int a , int b){
        int hasil = a +b ;
        return hasil;
                
            
        }
    }

