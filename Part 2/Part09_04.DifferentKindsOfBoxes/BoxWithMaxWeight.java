import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> itemsInBox;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsInBox = new ArrayList<>();
    }


    @Override
    public void add(Item item) {
        int weight = 0;
        for (Item itemInBox : itemsInBox) {
            weight += itemInBox.getWeight();
        }

        if (weight + item.getWeight() <= capacity) {
            this.itemsInBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item itemInBox : itemsInBox) {
            if (itemInBox.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
