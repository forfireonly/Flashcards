import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = 0;
        int index = 0;

        for (int i = a; i <= b; i++) {
            Random rndm = new Random(i);
            int nStays = n;
            max = 0;
            while (nStays-- > 0) {
                int number = rndm.nextInt(k);
                if (number > max) {
                    max = number;
                }
            }
            if (max < min) {
                min = max;
                index = i;
            }
        }
        System.out.println(index);
        System.out.println(min);
    }
}