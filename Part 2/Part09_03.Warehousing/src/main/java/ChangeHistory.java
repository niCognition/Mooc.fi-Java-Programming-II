
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    public double maxValue() {
        if (!changeHistory.isEmpty()) {
            double maxValue = changeHistory.get(0);
            for (Double entry : changeHistory) {
                if (entry > maxValue) {
                    maxValue = entry;
                }
            }

            return maxValue;
        }

        return 0;
    }

    public double minValue() {
        if (!changeHistory.isEmpty()) {
            double minValue = changeHistory.get(0);
            for (Double entry : changeHistory) {
                if (entry < minValue) {
                    minValue = entry;
                }
            }

            return minValue;
        }

        return 0;
    }

    public double average() {
        if (!changeHistory.isEmpty()) {
            double total = 0;
            for (Double entry : changeHistory) {
                total += entry;
            }

            return total / changeHistory.size();
        }

        return 0;
    }

    public String toString() {
        return this.changeHistory.toString();
    }
}
