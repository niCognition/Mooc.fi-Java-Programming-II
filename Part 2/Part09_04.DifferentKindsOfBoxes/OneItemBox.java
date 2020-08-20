import java.util.ArrayList;

public class OneItemBox extends Box{

    private ArrayList<Item> itemsInBox;

    public OneItemBox() {
        this.itemsInBox = new ArrayList<>();
    }


    @Override
    public void add(Item item) {
        if (this.itemsInBox.isEmpty()) {
            itemsInBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.itemsInBox.contains(item);
    }
}
