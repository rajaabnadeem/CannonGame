package cannongame;

import cannongame.IRoundingObject;
import java.lang.Math;

public class RoundingObject implements IRoundingObject {

    public int roundNumber (double num){
       return (int)Math.round(num);

    }
}
