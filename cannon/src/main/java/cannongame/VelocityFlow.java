package cannongame;

import java.util.Scanner;

public class VelocityFlow implements IVelocityFlow {

    private IVelocityValidityCheckObj _velocityValidate;

    public VelocityFlow(IVelocityValidityCheckObj velocityValidate) {
        _velocityValidate = velocityValidate;
    }

    public int getVelocity() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an angle between 1 - 90:");
        int result = reader.nextInt();

        while (!_velocityValidate.checkVelocity(result)) {
            System.out.println("Enter an angle between 1 - 90:");
            result = reader.nextInt();
        }
        reader.close();
        return result;
    }
}
