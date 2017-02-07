import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.println("Provide 3 integers to find out what kind of a △ is that.");
        System.out.println("--------------------------------------------------------");
        while (true) {
            System.out.print("3 ints: ");
            try {
                String potentialNumber1 = scanner.next();
                String potentialNumber2 = scanner.next();
                String potentialNumber3 = scanner.next();

                int num1 = Integer.parseInt(potentialNumber1);
                int num2 = Integer.parseInt(potentialNumber2);
                int num3 = Integer.parseInt(potentialNumber3);

                new Triangle(num1, num2, num3);
            } catch (NumberFormatException e) {
                System.out.println("All three values MUST be integers!");
            }
            System.out.println("--------------------------------------------------------");
        }
    }
}
