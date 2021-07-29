/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juli Omoshiroi
 */
import java.util.ArrayList;
import java.util.List;
public class test_TKK_no2 {
     public static boolean isValidEmail(String email) {
   
         return true;
   }
   public static void main(String[] args) {
       List<String> emails = new ArrayList<String>();
       emails.add("juli@example.co.id");
       emails.add("juli.bob@example.id");
       for (String value : emails) {
           System.out.println("Alamat email " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
       }
   }
}

