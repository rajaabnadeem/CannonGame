package cannongame;

import java.util.Random;

public class GameFlow implements IGameFlow{
    private int xTarget;
    private int yTarget;
    private boolean isTargetCreated = false;
    private boolean gameStillOn=false;
    private IShotFlow shotFlow;


    public GameFlow(IShotFlow shotFlow){
        this.shotFlow=shotFlow;
        this.createTarget();

    }
    public void playGame() {
        createTarget();
        int attempt = 1;


        gameStillOn = true;
        while (!shotFlow.shoot(xTarget,yTarget)) {
            attempt++;

        }
        System.out.println("You hit the target in the "+ attempt+ "attempt");

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
