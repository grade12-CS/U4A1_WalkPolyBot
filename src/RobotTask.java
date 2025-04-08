import becker.robots.*;

public class RobotTask {

    public void run() {
        //change the path name or choose different map file 
        City maze = new City("../WalkRectangle.wld");
        Point robot_p = Point.createRandomPoint(0, 3, 0, 10);
        WalkPolyBot bot = new WalkPolyBot(maze, robot_p.y, robot_p.x);
        bot.goTo(3, 6);
        bot.turn(Direction.EAST);
        bot.findThing();
        bot.goHome();
    }

}
