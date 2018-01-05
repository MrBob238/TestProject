/**
 * Created by Vladimir on 29.05.2017.
 */
public class Robot {
    int x = 0;
    int y = 0;
    Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public void turnLeft() {
        switch (getDirection()){
            default:
            case DOWN: direction = Direction.RIGHT;
                break;
            case UP: direction = Direction.LEFT;
                break;
            case RIGHT: direction = Direction.UP;
                break;
            case LEFT: direction = Direction.DOWN;
        }
    }
    public void turnRight() {
        switch (getDirection()){
            default:
            case DOWN: direction = Direction.LEFT;
                break;
            case UP: direction = Direction.RIGHT;
                break;
            case RIGHT: direction = Direction.DOWN;
                break;
            case LEFT: direction = Direction.UP;
        }
    }

    public void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, -5,5);
        System.out.println(robot.x + ", " + robot.y);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) robot.turnRight();
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) robot.turnLeft();
        }
            while (robot.getX()!= toX) robot.stepForward();

        if (robot.getY()< toY) {
            while (robot.getDirection() != Direction.UP) robot.turnLeft();
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) robot.turnRight();
        }
            while (robot.getY() != toY) robot.stepForward();

    }
    java.lang.Double.
}

