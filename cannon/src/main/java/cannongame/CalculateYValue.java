package cannongame;

public class CalculateYValue implements ICalculateYValue {
       public double YValue(double degree,int velocity){
           double result= Math.sin(degree)*velocity;
          // Y=Math.round(Y*100.0)/100.0;
           return result;


       }


}
