package cannongame;

public class DegreeConversion implements IDegreeConversion {

    public double ConvertToDegrees(int angle) {
        double result = (angle * (Math.PI / 180));
        System.out.println(result);
        return result;
    }

}