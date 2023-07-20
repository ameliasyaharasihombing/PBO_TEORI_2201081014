/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.amel280323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class getinputFromKeyeord {
     public static void main(String[] args){
         BufferedReader dataIn=
                 new  BufferedReader (
                    new InputStreamReader(System.in));
         String name ="";
         int umur =0;
         try {
             System.out.print("Please enter your nsme :");
             name = dataIn.readLine();
             
             System.out.print("Age : ");
             umur =Integer.parseInt(dataIn.readLine()) ;
             
         }catch (IOException ex){
             System.out.println("Error!");
             
         }
         System.out.println("Hrllo "+ name +"!");
         System.out.println("Umur Anda "+ umur +"!");
                        
     }
}
