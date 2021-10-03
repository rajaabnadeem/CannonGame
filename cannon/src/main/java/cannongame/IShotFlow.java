package cannongame;

public interface IShotFlow {
    boolean shoot(int targetX, int targetY, IAngleFlow angleFlow,
                  IVelocityFlow velocityFlow, IDegreeConversion degreeConversion,
                  IGettingFinalXCoordinate finalXCoordinate, ICalculateYValue finalYCoordinate,
                  IRoundingObject roundingObject, ITargetHit targetHit

    );
}
