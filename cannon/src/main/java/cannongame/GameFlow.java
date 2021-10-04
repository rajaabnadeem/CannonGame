package cannongame;

import java.util.Random;

public class GameFlow implements IGameFlow{
    private int xTarget;
    private int yTarget;
    private boolean isTargetCreated = false;
    private boolean gameStillOn=false;



    public String playGame() {
        createTarget();


        gameStillOn = true;
        while (gameStillOn) {


            }



        }
    }



    private void createTarget() {
        if (isTargetCreated == false) {
            Random random = new Random();
            xTarget = random.nextInt(10) + 1;
            yTarget = random.nextInt(10) + 1;
            isTargetCreated = true;

        }
    }

    public int getxTarget() {
        return xTarget;
    }

    public int getyTarget() {
        return yTarget;
    }


}
