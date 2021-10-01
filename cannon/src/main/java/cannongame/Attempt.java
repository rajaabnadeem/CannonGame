package cannongame;

public class Attempt implements IAttempt{

    private int shot;
    public Attempt() {
        shot = 0;
    }


    public int increaseShotAttempt(){
        shot++;
        return shot;
    }

}
