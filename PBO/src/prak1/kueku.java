
package prak1;


public class kueku {
     String warna;
     String rasa;
     int berat;
     double harga;
     void beriWarna(String warnakue){
         warna = warnakue;
     } 
     void beriRasa(String rasakue){
         rasa = rasakue;
     }
     void timbangBerat (int beratkue){
         berat = beratkue;
     }
     void hargaJual (double hargakue){
         harga = hargakue;
     }
     void infoRoti (){
         System.out.println(
                 "Warna kue : "+warna+"\n"+
                 "Rasa kue: "+rasa+"\n"+
                 "Berat kue : "+berat+"\n"+"gr"+
                 "Harga kue : Rp."+harga);
     } 
}
