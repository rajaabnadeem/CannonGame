package cannongame;

public class GettingFinalXCoordinate implements IGettingFinalXCoordinate {


    public Double gettingFinalXCoordinate(double degree, int velocity){

        return Math.cos(degree)*velocity;
    }




}
