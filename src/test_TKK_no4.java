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
public class test_TKK_no4 {
     public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("hasil = ");
        String data = key.next();
        
        int lengthkata = data.length();
        String[] arrkata = new String[1000];
        for (int i = 0; i < lengthkata;i++){
              int j = i;
              j++;
              arrkata[i] = data.substring(i,j);
           }
        for (int i = lengthkata-1;i >= 0;i--){
              System.out.print(arrkata[i]);       
           }
     }    
}
