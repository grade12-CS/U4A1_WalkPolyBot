
import java.util.Random;

public class Point {
    public final int x, y; 
    private static final Random r = new Random();

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public static Point createRandomPoint(int x_min, int x_max, int y_min, int y_max) {
        int x = r.nextInt(x_max) + x_min;
        int y = r.nextInt(y_max) + y_min;
        return new Point(x, y);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return "x: " + this.x + " y: "+ this.y;
    }
}
