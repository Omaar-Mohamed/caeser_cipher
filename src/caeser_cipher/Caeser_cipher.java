/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caeser_cipher;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Caeser_cipher {

    /**
     * @param args the command line arguments
     */
     public static String encrypt(String message ,int key){
            String test="";
            for(int i = 0; i< message.length();i++){
                test += (char)((message.charAt(i)+key));
            }
            return test;
        }
     
     public static String decrypt(String message ,int key){
            String test="";
            for(int i = 0; i< message.length();i++){
                test += (char)((message.charAt(i)-key));
            }
            return test;
        }
     
        
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter plane text:");
        String plane=sc.nextLine();

       System.out.println("Enter integer key:");

       int key=sc.nextInt();
       System.out.println("cipher text is :" + " " + encrypt(plane , key));
       
    }
    
}
