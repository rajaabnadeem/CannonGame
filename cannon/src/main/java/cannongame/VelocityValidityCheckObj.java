package cannongame;

public class VelocityValidityCheckObj implements IVelocityValidityCheckObj {

    public boolean checkVelocity(double input) {

        if (input >= 1 && input <= 20) {

            return true;
        }
        return false;

    }
}
