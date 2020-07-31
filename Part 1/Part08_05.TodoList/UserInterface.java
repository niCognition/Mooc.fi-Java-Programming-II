import java.util.Scanner;

public class UserInterface {
    private TodoList task;
    private Scanner scanner;

    public UserInterface(TodoList task, Scanner scanner) {
        this.task = task;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            inputProcessor(input);
        }
    }

    public void inputProcessor(String input) {
        switch (input) {
            case "add":
                System.out.println("To add:");
                String taskToAdd = scanner.nextLine();

                this.task.add(taskToAdd);
                break;

            case "list":
                this.task.print();
                break;

            case "remove":
                System.out.println("Which one is removed?");
                int taskToRemove = Integer.parseInt(scanner.nextLine());

                this.task.remove(taskToRemove);
                break;
        }
    }
}
