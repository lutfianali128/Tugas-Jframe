

package prak5;

public class akun1 {
    String nama,alamat;
    double saldo;
    
    public void isiData(String n, String al, double sal){
        nama =n;
        alamat = al;
        saldo =sal;
    }
    public void tampil(){
        System.out.println("Data Akun");
        System.out.println("Nama :"+ nama);
        System.out.println("Alamat:"+alamat);
        System.out.printf("Saldo :%,.2f",saldo);
        
    }
}
