package cannongame;

public class GettingFinalXCoordinate implements IGettingFinalXCoordinate {


    public double gettingFinalXCoordinate(double degree, int velocity) {

        return Math.cos(degree) * velocity;

    }

}