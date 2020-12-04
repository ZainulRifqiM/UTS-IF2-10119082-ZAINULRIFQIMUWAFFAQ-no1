/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119082.zainulrifqimuwaffaq.no1;
import java.util.Scanner;
/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: UTS no1
 */
public class UTSIF210119082ZAINULRIFQIMUWAFFAQNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age a = new Age(2018);
        Scanner s = new Scanner(System.in);
        int tahunLahir;
        
        System.out.print("Masukkan Tahun Lahir Anda : " );
        tahunLahir=s.nextInt();
        a.setYearBirth(tahunLahir);
        System.out.println();
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + a.getYearBirth());
        System.out.println("Hari ini tahun : " + a.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + a.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + a.tandanyaKamu(a.hitungUmur()));
    }
    
}
