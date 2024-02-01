import java.util.Scanner;

public class Objective5Lab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The number is " + (num % 2 == 0 ? "even" : "odd"));
    }
}
