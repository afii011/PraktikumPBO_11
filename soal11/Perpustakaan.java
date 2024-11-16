/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal11;
import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;
    
    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }
    public void tambahkanBuku(Buku buku) {
        daftarBuku.add(buku);
    }
    public void tampilkanInfoBuku() {
        System.out.println("Daftar Buku");
        for (Buku buku : daftarBuku) {
            buku.infoBuku();
        }
    }
}
