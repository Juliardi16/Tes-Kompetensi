/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juli Omoshiroi
 */

public class test_TKK_no3 {
    public static void main(String[] args) {
    String datawaktu ="12:00:00 AM";
    String[] kata = datawaktu.split(" ");
    String[] pisahWaktu = kata[0].split(":");
    int jam = Integer.parseInt(pisahWaktu[0]);
    String menit = pisahWaktu[1];
    int detik = Integer.parseInt(pisahWaktu[2]);
    
    
    if (kata[1].equalsIgnoreCase("PM")) {
       if (jam >=1 && jam <= 12) {
         int jamKonversi =12 + jam;
         System.out.println(jamKonversi + ":" + menit);
       } else {
         System.out.println(jam + ":" + menit );
       }
       
    } else if (kata[1].equalsIgnoreCase("AM")) {
       if (jam >=1 && jam <= 12) {
         int jamKonversi =  12-jam;
         System.out.println("0"+jamKonversi + ":" + menit);
       } else {
          System.out.println(jam + ":" + menit );
       }
      
    }
   
  }
}

