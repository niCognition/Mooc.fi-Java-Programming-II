public class Organism implements Movable {

    private int xLocation;
    private int yLocation;

    public Organism(int x, int y) {
        this.xLocation = x;
        this.yLocation = y;
    }

    @Override
    public void move(int dx, int dy) {
        this.xLocation += dx;
        this.yLocation += dy;
    }

    public String toString() {
        return "x: " + this.xLocation + "; y: " + this.yLocation;
    }
}
