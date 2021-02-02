
package prak1;


public class kueenak {
     public static void main(String[] args) {
         kueku kueenak = new kueku();
         kueenak.beriWarna("Cokelat");
         kueenak.beriRasa("Pisang Coklat");
         kueenak.timbangBerat(50);
         kueenak.hargaJual(5000);
         kueenak.infoRoti();
         
         kueku donat = new kueku();
         kueenak.beriWarna("ungu");
         kueenak.beriRasa("anggur");
         kueenak.timbangBerat(30);
         kueenak.hargaJual(7000);
         kueenak.infoRoti();
         
         kueku madumongso = new kueku();
         kueenak.beriWarna("hitam");
         kueenak.beriRasa("ketan");
         kueenak.timbangBerat(30);
         kueenak.hargaJual(5000);
         kueenak.infoRoti();
     } 
}
