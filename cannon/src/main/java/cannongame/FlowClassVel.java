package cannongame;

import java.util.Scanner;

public class FlowClassVel implements IFlowClassVel {
    private IVelocityValidityCheckObj _Vel;

public FlowClassVel(IVelocityValidityCheckObj Vel){
            _Vel = Vel;
}
    public Double FlowVel(Double velInput) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an Velocity between 1 - 20:");
        Double result = reader.nextDouble();

        while (!_Vel.checkVelocity(result)) {
            System.out.println("Enter an Velocity between 1 - 20:");
            result = reader.nextDouble();
        }
        reader.close();
        return result;
    }

}
