/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praUtss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class MenuBukuAlamat {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        praUts.DataBukuAlamat data = new praUts.DataBukuAlamat();
        int pil=0;
        try {
            
            while(pil!=5){
                System.out.println("1.Input Data");
                System.out.println("2.Hapus Data");
                System.out.println("3.Update Data");
                System.out.println("4.Tampilkan");
                System.out.println("5.Keluar");
                System.out.print("Pilihan Anda ?");
                pil =Integer.parseInt(dataIn.readLine());
                switch(pil){
                    case 1:
                        praUts.BukuAlamat temp = new praUts.BukuAlamat();
                        System.out.print("Nama      :");
                        temp.setNama(dataIn.readLine());
                        System.out.print("Alamat    :");
                        temp.setAlamat(dataIn.readLine());
                        System.out.print("No Telp   :");
                        temp.setNotelp(dataIn.readLine());
                        System.out.print("Email     :");
                        temp.setEmail(dataIn.readLine());
                        data.insert(temp); 
                        break;
                    case 2:
                        System.out.print("Masukkan indeks data yang ingin dihapus: ");
                        int index = Integer.parseInt(dataIn.readLine());
                        data.delete(index);
                        System.out.println("Data berhasil dihapus.");
                        break;
                    case 3:
                        System.out.print("Masukkan indeks data yang ingin diupdate: ");
                        int indexToUpdate = Integer.parseInt(dataIn.readLine());
                        praUts.BukuAlamat updatedData = new praUts.BukuAlamat();
                        System.out.print("Nama      :");
                        updatedData.setNama(dataIn.readLine());
                        System.out.print("Alamat    :");
                        updatedData.setAlamat(dataIn.readLine());
                        System.out.print("No Telp   :");
                        updatedData.setNotelp(dataIn.readLine());
                        System.out.print("Email     :");
                        updatedData.setEmail(dataIn.readLine());
                        data.update(indexToUpdate, updatedData);
                        System.out.println("Data berhasil diupdate.");
                        break;
                    case 4:
                        praUts.BukuAlamat[] list = data.getAll();
                        for(int i=0;i<list.length;i++){
                            System.out.println("Buku Alamat ke--->"+(i+1));
                            System.out.println("Nama    :"+list[i].getNama());
                            System.out.println("Alamat  :"+list[i].getAlamat());
                            System.out.println("No Telp :"+list[i].getNotelp());
                            System.out.println("Email   :"+list[i].getEmail());
                        }
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan program ini. Sampai jumpa!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih nomor menu yang tersedia.");
                        break;
                }
            }

        } catch (IOException ex) {
            System.out.println("Terjadi kesalahan pada masukan/keluaran.");
            ex.printStackTrace();
        }
    catch (NumberFormatException ex) {
                System.out.println("Masukan tidak valid. Harap masukkan angka yang benar.");
            } 
    }
}
