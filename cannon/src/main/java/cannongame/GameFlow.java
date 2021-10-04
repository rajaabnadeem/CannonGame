package cannongame;

import java.util.Random;

public class GameFlow implements IGameFlow{
    private int xTarget;
    private int yTarget;
    private boolean isTargetCreated = false;
    private boolean gameStillOn=false;



    public String playGame() {
        createTarget();
        IShotFlow shot= new ShotFlow(new AngleFlow(), new VelocityFlow(), new DegreeConversion(), new GettingFinalXCoordinate(), new CalculateYValue(), new RoundingObject(), new TargetHit() );
        IAttempt attempt = new Attempt();

        gameStillOn = true;
        while (gameStillOn) {
            if(shot.shoot(xTarget,yTarget)){
                return "The Target was hit in the" + attempt.getShot()+ "attempt!!!";
                gameStillOn = false;

            }


            }return "Sorry, you missed";



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
