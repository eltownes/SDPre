import java.util.Scanner;

public class Objective4Lab2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;
        double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

        System.out.println("Enter the first integer: ");
        num1 = keyboard.nextInt();

        System.out.println("Enter the second integer: ");
        num2 = keyboard.nextInt();

        System.out.println("Enter the third integer: ");
        num3 = keyboard.nextInt();

        System.out.println("Enter the first double: ");
        dub1 = keyboard.nextDouble();

        System.out.println("Enter the second double: ");
        dub2 = keyboard.nextDouble();

        System.out.println("Enter the third double: ");
        dub3 = keyboard.nextDouble();

        System.out.printf("The sum of %s + %s + %s = %s %n",
                num1, num2, num3, num1+num2+num3);

        System.out.printf("The sum of %s + %s + %s = %s %n",
                dub1, dub2, dub3, dub1+dub2+dub3);

    }
}
