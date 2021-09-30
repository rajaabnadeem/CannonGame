package cannongame;

import org.junit.Test;
import static org.junit.Assert.*;

public class AttemptsTest {


    @Test

    public void firstAttemptTest () {
//        Given: I the user hasn't shot yet
        IAttempt attempt = new Attempt();

//        When: The user shoots
        int number = attempt.increaseShotAttempt();
//        Then: The number of shots is 1
        assertEquals(1, number);
    }

    @Test
    public void SecondAttemptTest () {
//        Given: I the user hasn't shot yet
        IAttempt attempt = new Attempt();

//        When: The user shoots
        attempt.increaseShotAttempt();
        int number = attempt.increaseShotAttempt();
//        Then: The number of shots is 1
        assertEquals(2, number);
    }


}
