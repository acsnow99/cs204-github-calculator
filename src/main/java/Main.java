import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        boolean running = true;
        Scanner scanner = new Scanner(System.in);


        while (running) {
            try {

                System.out.println("Enter a command:");
                String input = scanner.nextLine();

                // Split the input string into parts: command and parameters
                String[] parts = input.split(" ");
                String command = parts[0];
                switch (command) {
                    case "add":
                        int addResult = calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Result: " + addResult);
                        break;

                    case "subtract":
                        int subtractResult = calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Result: " + subtractResult);
                        break;

                    case "multiply":
                        int multiplyResult = calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Result: " + multiplyResult);
                        break;

                    case "divide":
                        int divideResult = calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Result: " + divideResult);
                        break;

                    case "fibonacciNumberFinder":
                        int fibonacciResult = calculator.fibonacciNumberFinder(Integer.parseInt(parts[1]));
                        System.out.println("Result: " + fibonacciResult);
                        break;

                    case "intToBinaryNumber":
                        String binaryResult = calculator.intToBinaryNumber(Integer.parseInt(parts[1]));
                        System.out.println("Result: " + binaryResult);
                        break;

                    case "exit":
                        running = false;
                        break;

                    default:
                        System.out.println("Unknown command.");
                }
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Invalid input format.");
            }
        }
        scanner.close();

    }
}
