package cannongame;

import static org.junit.Assert.*;
import org.junit.Test;

public class DegreeConversionTest {

    @Test
    public void DegreeConversion1() {
        // Given: I have an angle of 45
        // When: I need it to be converted to degrees
        // Then: I would pass the angle into the degree function and get back 0.78
        IDegreeConversion test1 = new DegreeConversion();
        double result = test1.ConvertToDegrees(45);

        assertEquals(0.78, result, 0.01);

    }

    @Test
    public void DegreeConversion2() {
        // Given: I have an angle of 1
        // When: I need it to be converted to degrees
        // Then: I would pass the angle into the degree function and get back 0.017
        IDegreeConversion test1 = new DegreeConversion();
        double result = test1.ConvertToDegrees(1);

        assertEquals(0.017, result, 0.01);

    }

}
