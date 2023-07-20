/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.amel280323;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class latihan64ForLoop {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int nilai = input.nextInt();
        System.out.println("masukkan pangkat : ");
        int pkt = input.nextInt();

        int h = 1;

        for (int i = 1; i < pkt;i++){
        h = h * nilai;
        }
        System.out.println(nilai+ " ^ " + pkt + " = " +h);
         }
}
