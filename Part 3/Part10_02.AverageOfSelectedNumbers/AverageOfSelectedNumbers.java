
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            inputs.add(input);
        }

        double averageOfPositives = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        double averageOfNegatives = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String row = scanner.nextLine();

        if (row.equals("p")) {
            System.out.println(averageOfPositives);
        } else if (row.equals("n")){
            System.out.println(averageOfNegatives);
        }
    }
}
