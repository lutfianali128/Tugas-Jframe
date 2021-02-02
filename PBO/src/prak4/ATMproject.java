
package prak4;

public class ATMproject {

        
    String nama;
    int norek;
    double saldo;
    double tariktunai;
    double menabung;
    double transfer;
    
    void Nama (String NamaPengguna){
        nama =NamaPengguna;
    }
    void Nomor (int NomorRekening){
        norek =NomorRekening;
    }
    void Ceksaldo (double JumlahSaldo){
        saldo =JumlahSaldo;
    }
    void Menarik (double Tariktunai){
        tariktunai = Tariktunai;
    }
    void Nabung(double JumlahTabungan ){
        menabung =JumlahTabungan;
    }
    void Transfer (double JumlahTransfer){
        transfer =JumlahTransfer;
    }
    void printInfo(){
        System.out.println(
            "Nama :"+nama+"\n"+
            "Nomor :"+norek+"\n"+
            "Ceksaldo :"+saldo+"\n"+
            "Menarik :"+tariktunai+"\n"+
            "Nabung :"+menabung+"\n"+
            "Transfer :"+transfer);  
        
    }
      }

