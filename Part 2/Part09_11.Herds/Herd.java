import java.util.ArrayList;
import java.util.stream.Collectors;

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : herd) {
            organism.move(dx, dy);
        }
    }

    public String toString() {
        return herd
                .stream()
                .map(Movable::toString)
                .collect(Collectors.joining("\n"));
    }
}
