/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal11;
public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Leila S. Chudori");
        Pengarang pengarang2 = new Pengarang("Toshikazu Kawaguchi");

        Buku buku1 = new Buku("Laut Bercerita", pengarang1);
        Buku buku2 = new Buku("Funiculi Funicula", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahkanBuku(buku1);
        perpustakaan.tambahkanBuku(buku2);
        
        perpustakaan.tampilkanInfoBuku();
    }
}
