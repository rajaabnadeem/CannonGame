package cannongame;

import org.junit.Test;

import static org.junit.Assert.*;



public class AngleTest {

//    //Given: We have an angle 1
//    When: we validate the angle
//    Then: That angle is valid

//    Given: We have angle 91
//    When: we validate the angle
//    Then: That angle is invalid

//    Given: We have angle of 90
//    When: we validate the angle
//    Then: The angle is valid

//    Given: We have angle of 0
//    When: We validate the angle
//    Then: The angle is invalid

    @Test
    public void checkAngle1() {
        //Given: We have an angle 1
        //When: we validate the angle

        IAngleV obj1 = new AngleValidator();
        boolean resolvedEquals = obj1.input_1(1);
    }
        @Test
        public void checkAngle2 ()

        {

            IAngleV obj2 = new AngleValidator();
            boolean resolvedEqualsone = obj2.input_1(91);

            //Then: That angle is valid
            assertFalse(resolvedEqualsone);
        }
        @Test
        public void checkAngle3 () {

            IAngleV obj3 = new AngleValidator();
            boolean resolvedEqualstwo = obj3.input_1(90);


            //Then: That angle is valid
            assertTrue(resolvedEqualstwo);
        }

        @Test
        public void checkAngle4 () {

            IAngleV obj4 = new AngleValidator();
            boolean resolvedEqualsthree = obj4.input_1(0);

            assertFalse(resolvedEqualsthree);
        }


    }



