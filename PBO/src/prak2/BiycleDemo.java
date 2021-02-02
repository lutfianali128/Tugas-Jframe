
package prak2;

public class BiycleDemo {
    int ChangeCadance;
    int SpeedUp;
    int ChangeGear;
    
    void cadance(int Changecadance){
        ChangeCadance = Changecadance;
    }
    void speedup(int Speedup){
        SpeedUp = Speedup;
    }
    void gear(int Changegear){
        ChangeGear =Changegear;
    }
    void printInfo (){
        System.out.println(
                "ChangeCadance :" +ChangeCadance+"\n"+
                "Speedup : "+SpeedUp+"\n"+
                "ChangeGear : "+ChangeGear);
    }
        
}


