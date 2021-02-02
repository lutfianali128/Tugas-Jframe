
package prak5;

import prak5.akun;


public class PakaiAkun {
    public static void main(String []args){
        akun akunku = new akun();
        akun akunAnda = new akun();
        akunku.nama = "sofyan";
        akunku.alamat = "Banjarejo";
        akunku.saldo = 6498;
        
        akunAnda.nama = "ilham";
        akunAnda.alamat = "paleran";
        akunAnda.saldo= 7345;
        
        akunku.tampil();
        
        System.out.println("ditambah bunga Rp");
        System.out.println("Akunku.getBunga(5)");
        
        akunAnda.tampil();
        double andaBungaRata = 7;
        System.out.print("ditambah bunga Rp ");
        double andaBungaJumlah = akunAnda.getBunga(andaBungaRata);
        System.out.println(andaBungaJumlah);

        
    }
}
