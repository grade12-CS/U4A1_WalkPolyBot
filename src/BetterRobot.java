import becker.robots.*;

public class BetterRobot extends RobotSE {
    public BetterRobot(City city, int y, int x) {
        super(city, y, x, Direction.NORTH, 0); 
    }

    public void print(String s) {
        System.out.println(s);
    }

    public int getX() {
        return getAvenue();
    }
    
    public int getY() {
        return getStreet();
    }

    public Point getCurrentPoint() {
        return new Point(getX(), getY());
    }

    public void move(Direction dir, int n) {
        if (n < 0) return;
        turn(dir);
        super.move(n);
    }

    public void move(int x, int y) {
        move(x > 0 ? Direction.EAST : Direction.WEST, Math.abs(x));
        move(y > 0 ? Direction.SOUTH : Direction.NORTH, Math.abs(y));
    }

    public void move(Point p) {
        move(p.x, p.y);
    }

    public void turn(Direction target) {
        Direction current = getDirection();
        if (current == target) return;
        if (current.right() == target) {
            turnRight();
        } else if (current.left() == target) {
            turnLeft();
        } else {
            turnAround();
        }
    }

    public void goTo(int x, int y) {
        move(x - getX(), y - getY());
    }

    public void goTo(Point p) {
        goTo(p.x, p.y);
    }
}
