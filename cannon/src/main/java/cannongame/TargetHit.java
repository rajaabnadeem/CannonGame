package cannongame;

public class TargetHit implements ITargetHit {
    public boolean hit(int shotX, int shotY, int targetX, int targetY) {
        return shotX == targetX && shotY == targetY;
    }
}
