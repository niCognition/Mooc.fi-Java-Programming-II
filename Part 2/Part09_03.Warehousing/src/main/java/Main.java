

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes

        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);

        System.out.println(juice.history());
    }

}
