
package prak5;

public class akun {
     String nama;
 String alamat;
 double saldo;
 
 public void tampil(){
     System.out.println(nama);
     System.out.println("(");
     System.out.println(alamat);
     System.out.println(") mempunyai Rp ");
     System.out.println(saldo);
  
 }
 public double getBunga(double persenRata){
     return saldo * persenRata / 100;
 }
}
