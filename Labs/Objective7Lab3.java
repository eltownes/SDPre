public class Objective7Lab3 {

    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 20) {
            System.out.printf("%d is %s %n", counter, counter % 2 == 0 ? "even" : "odd");
            counter++;
        }

    }
}
