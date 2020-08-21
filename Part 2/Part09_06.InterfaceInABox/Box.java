import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> itemsInBox;
    private double capacity;

    public Box(double capacity) {
        this.itemsInBox = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= capacity) {
            this.itemsInBox.add(item);
        }

    }

    @Override
    public double weight() {
        double totalWeight = 0;

        for (Packable item : itemsInBox) {
            totalWeight += item.weight();
        }

        return totalWeight;
    }

    public String toString() {
        return "Box: " + this.itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }
}
