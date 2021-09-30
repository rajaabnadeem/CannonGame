package cannongame;
import org.junit.Test;
import cannongame.IRoundingObject;
import cannongame.RoundingObject;
import static org.junit.Assert.*;


public class RoundingObjectTest {
    @Test
    //Given: I have a number 7.5
    public void givenSevenFiveGet8(){
        double number = 7.5;

    //When: I round the number up

        IRoundingObject RoundUp = new RoundingObject();

        int result = RoundUp.roundNumber(number);

        //Then: I should get 8
        assertEquals(8, result);



    }

}
