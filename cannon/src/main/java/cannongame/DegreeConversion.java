package cannongame;

public class DegreeConversion implements IDegreeConversion {

    public double ConvertToDegrees(double angle) {
        double result = (angle * (Math.PI / 180));
        return result;
    }

}
