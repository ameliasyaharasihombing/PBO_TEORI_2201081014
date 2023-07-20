/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amel280323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class latihan51 {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader ( new InputStreamReader(System.in));

            String name = "";

            System.out.print ("Please enter your words 1 = ");

            try {

            name = dataIn.readLine();

            }catch (IOException e){

            System.out.println ("Error ");

            }
            
         BufferedReader dataMasuk = new BufferedReader (new InputStreamReader(System.in));

                String nama ="";

                System.out.print ("Please enter your words 2 =" );

                try{

                nama = dataMasuk.readLine();

                }catch(IOException e){

                System.out.println ("Error !");

                } 
                
         BufferedReader dataMlebu = new BufferedReader (new InputStreamReader(System.in));

                String namawa ="";

                System.out.print("Please enter your words 3 =" );

                try{

                namawa = dataMlebu.readLine();

                }catch(IOException e){

                System.out.println ("Error !");

                }

                System.out.println (name +" "+ nama +" "+ namawa);

                } 
}
