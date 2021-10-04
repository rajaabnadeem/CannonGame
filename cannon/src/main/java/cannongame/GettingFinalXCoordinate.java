package cannongame;

public class GettingFinalXCoordinate implements IGettingFinalXCoordinate {


    public double gettingFinalXCoordinate(double degree, double velocity) {

        return Math.cos(degree) * velocity;

    }

}