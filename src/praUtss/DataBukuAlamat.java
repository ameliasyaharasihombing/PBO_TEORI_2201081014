/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praUtss;

/**
 *
 * @author Asus
 */
public class DataBukuAlamat {
   private praUts.BukuAlamat[] data;
    private int count;

    public DataBukuAlamat() {
        data = new praUts.BukuAlamat[100];
        count = 0;
    }

    public void insert(praUts.BukuAlamat bukuAlamat) {
        if (count < data.length) {
            data[count] = bukuAlamat;
            count++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Data sudah mencapai batas maksimum.");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                data[i] = data[i + 1];
            }
            count--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void update(int index, praUts.BukuAlamat updatedData) {
        if (index >= 0 && index < count) {
            data[index] = updatedData;
            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public praUts.BukuAlamat[] getAll() {
        praUts.BukuAlamat[] result = new praUts.BukuAlamat[count];
        for (int i = 0; i < count; i++) {
            result[i] = data[i];
        }
        return result;
    } 
}
