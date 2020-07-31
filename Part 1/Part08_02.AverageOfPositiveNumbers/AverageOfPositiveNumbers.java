
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                double positiveSum = 0;
                for (int numbers : positiveNumbers) {
                    positiveSum += numbers;
                }
                if (positiveSum == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(positiveSum * 1.0 / positiveNumbers.size());
                }
                break;
            }

            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
    }
}
