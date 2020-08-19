public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        this.changeHistory.add(this.getBalance() - amount);

        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        System.out.println(
                "Product: " + this.getName() +
                "\nHistory: " + this.history() +
                "\nLargest amount of product: " + this.changeHistory.maxValue() +
                "\nSmallest amount of product: " + this.changeHistory.minValue() +
                "\nAverage: " + this.changeHistory.average());
    }

    public String history() {
        return this.changeHistory.toString();
    }
}
