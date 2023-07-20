/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.amel040423;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class latihan72NilaiTerbesar {
    public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] angka = new int[10];

    try {
      for (int i = 0; i < 10; i++) {
        String input = JOptionPane.showInputDialog(null, "Masukkan nomor ke-" + (i+1));
        angka[i] = Integer.parseInt(input);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "Input harus berupa angka");
      System.exit(1);
    }

    int maxAngka = angka[0];
    for (int i = 1; i < 10; i++) {
      if (angka[i] > maxAngka) {
        maxAngka = angka[i];
      }
    }

    JOptionPane.showMessageDialog(null, "Nomor terbesar yang Anda masukkan adalah " + maxAngka);
  }

}
