package cannongame;

public class AngleValidator implements IAngleV {
    public boolean input_1(double angle) {
        //System.out.println("Given: The user is asked for an angle input");
        //System.out.println("Enter an angle input ranging from 1 to 90");


        //Scanner inputScanner = new Scanner(System.in);
        //int userInput = inputScanner.nextInt();
        //System.out.println("When: The user inputs an angle of " +userInput);


        if (angle >= 1.0 && angle <= 90.0) {
            return true;
        } else {
            return false;
        }
    }
}

