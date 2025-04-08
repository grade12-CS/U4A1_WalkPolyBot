import becker.robots.*;

public class WalkPolyBot extends BetterRobot{
    /**
     * The point the robot is initially created
     */
    private final Point home;

    public WalkPolyBot(City city, int y, int x) {
        super(city, y, x);
        home = new Point(x, y);
        print("my home is at: " + home.toString());
    }

    /**
     * find things by following a rectangular path
     */
    public void findThing() {
        while (frontIsClear()) {
            if (getCurrentPoint().equals(new Point(3 + 1, 6 - 1))) {
                return;
            }
            move();
            if (canPickThing()) {
                pickAllThings();
            } else {
                turnAround();
                move();
                turnRight();
            }
        }
    }

    /**
     * goes to home point where the robot was created
     */
    public void goHome() {
        System.out.println("go home");
       goTo(home); 
    }
}
