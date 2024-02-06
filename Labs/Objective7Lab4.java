public class Objective7Lab4 {

    public static void main(String[] args) {
        int numNow = 1;
        int numEnd = 20;
        int sum = 0;

        do {
            sum += numNow;
            numNow++;
        } while (numNow <= numEnd);

        System.out.println(sum);

    }
}
