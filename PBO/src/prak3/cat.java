
package prak3;

public class cat {
    int  Umur ;
    String warna;
    String suara;
    
    
     void beriumur(int UmurKucing){
        Umur = UmurKucing;
    }
    void beriwarnabulu(String warnaBulukucing){
        warna = warnaBulukucing;
    }
    void berisuara(String suarakucing){
        suara = suarakucing;
    }
     void printInfo (){
        System.out.println(
                "BeriUmur :"+"\n"+
                "Beriwarna :"+"\n"+
                "Berisuara :"+suara);
                }
}
           
                
                
    

