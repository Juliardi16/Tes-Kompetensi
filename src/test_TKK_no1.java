/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juli Omoshiroi
 */
import java.util.Scanner;
public class test_TKK_no1 {
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    int  angka;
    String keterangan="";
        System.out.println("Masukan angka : ");
        angka = input.nextInt();
        if(angka % 3 == 0 && angka % 5 == 0){
            keterangan = "Hello word";
        }else if(angka % 3 == 0){
           keterangan ="Hello"; 
        }else if (angka % 5 == 0){
            keterangan ="Word";
        }
        System.out.println(keterangan);
    }
    
}
