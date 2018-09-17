/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanDasar;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class InputanKeybroad {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
    int a , b ;
   System.out.print("Masukan Nilai a : ");
    a=masukan.nextInt ();
        System.out.print("Masukan nilai b :");
        b= masukan.nextInt();
        System.out.println();
        System.out.println("Nilai Variable yang ada pada progam :");
        System.out.println("a ="+a);
        System.out.println("b ="+b);
}
}