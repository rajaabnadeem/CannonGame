package cannongame;

public class ShotFlow implements IShotFlow {

    public boolean shoot(int targetX, int targetY, IAngleFlow angleFlow, IVelocityFlow velocityFlow,
            IDegreeConversion degreeConversion, IGettingFinalXCoordinate finalXCoordinate,
            ICalculateYValue finalYCoordinate, IRoundingObject roundingObject, ITargetHit targetHit) {

        int angle = angleFlow.getAngle();
        int velocity = velocityFlow.getVelocity();
        double degree = degreeConversion.ConvertToDegrees(angle);
        double X = finalXCoordinate.gettingFinalXCoordinate(degree, velocity);
        double Y = finalYCoordinate.YValue(degree, velocity);
        int finalX = roundingObject.roundNumber(X);
        int finalY = roundingObject.roundNumber(Y);
        System.out.println("Your shot hit X: " + finalX + " Y: " + finalY);
        return targetHit.hit(finalX, finalY, targetX, targetY);
    }
}
