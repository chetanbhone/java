
import java.util.*;

public class Activity {

    public static void getNumber(double[] numbers, Scanner scn) {

        System.out.println("Enter first number");
        numbers[0] = scn.nextDouble();
        System.out.println("Enter second number");
        numbers[1] = scn.nextDouble();

    }

    public static void cal(double[] numbers, double[] result, int choice) {
        switch (choice) {
            case 1:
                result[0] = numbers[0] + numbers[1];
                break;

            case 2:
                result[0] = numbers[0] - numbers[1];
                break;

            case 3:
                result[0] = numbers[0] * numbers[1];
                break;

            case 4:
                result[0] = numbers[0] / numbers[1];
                break;

        }
    }

    public static void dispResult(double[] result) {
        System.out.println("Result : " + result[0]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice;
        double[] numbers = new double[2];
        double[] result = new double[1];

        do {
            System.out.println("Enter 1 two perform addition");
            System.out.println("Enter 2 for perform substraction");
            System.out.println("Enter 3 for perform multiplication");
            System.out.println("Enter 4 for perform division");
            System.out.println("Enter 5 for Exit");
            choice = scn.nextInt();
            if (choice >= 1 && choice <= 4) {
                getNumber(numbers, scn);
                cal(numbers, result, choice);
                dispResult(result);
            } else if (choice == 5) {
                System.out.println("Thank you");
            } else {
                System.out.println("Invalid choice");
            }

        } while (choice >= 5);
    }
}
