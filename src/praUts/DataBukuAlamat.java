/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praUts;

/**
 *
 * @author LABMM07
 */


public class DataBukuAlamat {
    private BukuAlamat[] data;
    private int count;

    public DataBukuAlamat() {
        data = new BukuAlamat[100];
        count = 0;
    }

    public void insert(BukuAlamat bukuAlamat) {
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

    public void update(int index, BukuAlamat updatedData) {
        if (index >= 0 && index < count) {
            data[index] = updatedData;
            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public BukuAlamat[] getAll() {
        BukuAlamat[] result = new BukuAlamat[count];
        for (int i = 0; i < count; i++) {
            result[i] = data[i];
        }
        return result;
    }
}
