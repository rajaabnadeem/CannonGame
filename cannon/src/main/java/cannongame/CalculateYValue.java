package cannongame;

public class CalculateYValue implements ICalculateYValue {

       public double YValue(double degree,double velocity){
           double result= Math.sin(degree)*velocity;
           return result;


       }


}
