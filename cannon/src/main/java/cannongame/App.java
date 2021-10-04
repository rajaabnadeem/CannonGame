package cannongame;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        IShotFlow shotFlow = new ShotFlow(new AngleFlow(new AngleV()), new VelocityFlow(new VelocityValidityCheckObj()),
                new DegreeConversion(), new GettingFinalXCoordinate(), new CalculateYValue(), new RoundingObject(),
                new TargetHit()
                );
        IGameFlow gameFlow = new GameFlow(shotFlow);
        gameFlow.playGame();
    }
}
