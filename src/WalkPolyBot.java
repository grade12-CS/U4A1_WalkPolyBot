import becker.robots.*;

public class WalkPolyBot extends BetterRobot{
    private final Point home;

    public WalkPolyBot(City city, int y, int x) {
        super(city, y, x);
        home = new Point(x, y);
        print("my home is at: " + home.toString());
    }

    public void findThing() {
        while (frontIsClear()) {
            if (getCurrentPoint().equals(new Point(home.x, home.y - 1))) {
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

    public void goHome() {
        System.out.println("go home");
       goTo(home); 
    }
}
