import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        // write your code here
        int count = 0;
        boolean flag = false;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count == 3) {
                    flag = true;
                    break;
                }
            }

        }
        return flag;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}