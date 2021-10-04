package cannongame;

import java.util.Scanner;

public class AngleFlow implements IAngleFlow {

    private IAngleV _Angle1;

    public AngleFlow(IAngleV Angle1) {
        _Angle1 = Angle1;
    }

    public int getAngle() {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an angle between 1 - 90:");
        int result = reader.nextInt();

        while (!_Angle1.validate(result)) {
            System.out.println("Enter an angle between 1 - 90:");
            result = reader.nextInt();
        }
        reader.close();
        return result;
    }

}
