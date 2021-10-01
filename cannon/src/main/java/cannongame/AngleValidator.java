package cannongame;

public class AngleValidator implements IAngleV {

    public boolean input_1(double angle) {

        if (angle >= 1.0 && angle <= 90.0) {
            return true;
        } else {
            return false;
        }
    }
}

