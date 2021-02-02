
package prak4;

public class ATM_project {
    public static void main(String []args){
        ATMproject ATM_project = new ATMproject();
        ATM_project.Nama("Ilham");
        ATM_project.Nomor(8754);
        ATM_project.Ceksaldo(15000);
        ATM_project.Menarik(7000);
        ATM_project.Nabung(500);
        ATM_project.Transfer(100000);
        ATM_project.printInfo();
        
        ATMproject ATM_projectku = new ATMproject();
        ATM_projectku.Nama("sofyan");
        ATM_projectku.Nomor(4356);
        ATM_projectku.Ceksaldo(200000);
        ATM_projectku.Menarik(100000);
        ATM_projectku.Nabung(400);
        ATM_projectku.Transfer(50000);
        ATM_projectku.printInfo();
        
        
    }
}