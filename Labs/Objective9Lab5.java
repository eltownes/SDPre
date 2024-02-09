import java.util.Scanner;

public class Objective9Lab5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        double num1, num2;
        boolean keepGoing = true;
        int choice;
//        double answer = 0.0;

        System.out.print("Enter number: ");
        num1 = kb.nextDouble();

        System.out.print("Enter another number: ");
        num2 = kb.nextDouble();

        while (keepGoing) {
            printMenu();
            System.out.print("Which would you like to do? ");
            choice = kb.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("%s + %s = %s", num1, num2, findSum(num1, num2));
                    break;
                case 2:
                    System.out.printf("The average of %s and %s is: %s", num1, num2,
                            findAverage(num1, num2));
                    break;
                case 3:
                    System.out.printf("The amount in tax to be collected from a purchase of %s " +
                            "and %s is: %.3f", num1, num2, calcTax(num1, num2));
                    break;
                case 4:
                    keepGoing = false;
                    System.out.println("You've chosen to quit.");
                    break;
                default:
                    System.out.println("Invalid entry. Please try again.");
            }

        }
        kb.close();
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("========= MENU =========");
        System.out.println("|                      |");
        System.out.println("|   1. Add Numbers     |");
        System.out.println("|   2. Find Average    |");
        System.out.println("|   3. Calculate Tax   |");
        System.out.println("|   4. Exit            |");
        System.out.println("|                      |");
        System.out.println("========================");
        System.out.println();
    }

    public static double findSum(double x, double y) {
        double sum = x + y;
        return sum;
    }

    public static double findAverage(double x, double y) {
        return (x+y) * 0.5;
    }

    public static double calcTax(double x, double y) {
        double taxRate = 8.31/100;
        return (x+y) * taxRate;
    }

}
