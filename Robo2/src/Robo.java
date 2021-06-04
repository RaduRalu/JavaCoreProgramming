import stanford.karel.Karel;

public class Robo extends Karel {
    @Override
    public void run() {

            turnRight();
        move();
        turnLeft();
            advance3();
        pickBeeper();
        turnLeft();
        turnLeft();
            advance3();
            turnRight();
        move();
        putBeeper();

    }
    private void advance3() {
        move();
        move();
        move();
    }
    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
