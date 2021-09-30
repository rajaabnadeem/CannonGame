package cannongame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateYValueTest {
    @Test
//Given degree 0.78 and velocity 10
    public void ValueOfY(){
        double degree =  0.78;
      int velocity=10;
//when I calculate Y value
      ICalculateYValue calY=new CalculateYValue();
      double Y=calY.YValue(degree,velocity);
      //I would pass the degree and velocity into the sine function and get back 7.03
assertEquals(7.03,Y,0);
    }

@Test
        //Given degree 0.78 and velocity 10
        public void ValueOfY1(){
            double degree =  0.523;
            int velocity=15;
//when I calculate Y value
            ICalculateYValue calY=new CalculateYValue();
            double Y=calY.YValue(degree,velocity);
            //I would pass the degree and velocity into the sine function and get back 7.03
            assertEquals(7.49,Y,0);

        }



}
