package cannongame;

import java.util.Scanner;

public class VelocityFlow1 implements IVelocityFlow1 {

    private IVelocityValidityCheckObj _velobj;
    public VelocityFlow1(IVelocityValidityCheckObj Vel){
        _velobj=Vel;

     }
public int getVelocity(){

    Scanner reader = new Scanner(System.in);
        System.out.println("Enter an velocity between 1 - 20:");
    int result = reader.nextInt();

        while (!_velobj.checkVelocity(result)) {
        System.out.println("Enter an velocity between 1 - 20:");
        result = reader.nextInt();
    }
        reader.close();
        return result;
}

}

