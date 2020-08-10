import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.registry.containsKey(licensePlate)) {
            this.registry.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            return this.registry.get(licensePlate);
        }

        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);

            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licencePlate : this.registry.keySet()) {
            System.out.println(licencePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();

        for (String owners : this.registry.values()) {
            if (!printedOwners.contains(owners)) {
                System.out.println(owners);
                printedOwners.add(owners);
            }
        }
    }
}
