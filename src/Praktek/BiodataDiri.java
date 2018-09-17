/*import java.util.Scanner;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Praktek;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class BiodataDiri {
    public static void main (String[]args){
        Scanner y = new Scanner(System.in);
        
        String nama, tl  , alm , mt , js;
        int nis , ttl ;
        
        System.out.print("Nama : ");
        nama = y.next();
        
        System.out.print("NIS");
        nis = y.nextInt();
        
        System.out.print("Tempat lahir : ");
        tl = y.next();
        
        System.out.print("Tanggal Lahir : ");
        ttl= y.nextInt();
        
        System.out.print("Jenis kelamin : ");
        js= y.next();
        
        System.out.print("Alamat Di malang : ");
        alm = y.next();
        
        System.out.print("Motto Hidup : ");
        mt = y.next();
        
    }
}
