import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!this.shoppingCart.containsKey(product)) {
            this.shoppingCart.put(product, new Item(product, 1, price));
        } else {
            this.shoppingCart.get(product).increaseQuantity();
        }
    }

    public int price() {
        int price = 0;
        for (Item item : this.shoppingCart.values()) {
            price += item.price();
        }

        return price;
    }

    public void print() {
        for (Item item : this.shoppingCart.values()) {
            System.out.println(item);
        }
    }
}
