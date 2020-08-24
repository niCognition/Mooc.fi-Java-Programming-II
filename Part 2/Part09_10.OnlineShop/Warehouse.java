import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        return this.price.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int currentValue = this.stock.getOrDefault(product, 0);
        if (currentValue > 0) {
            this.stock.put(product, currentValue - 1);

            return true;
        }

        return false;
    }

    public Set<String> products() {
        Set<String> productKeys = new HashSet<>();
        for (String key : this.stock.keySet()) {
            productKeys.add(key);
        }

        return productKeys;
    }
}
