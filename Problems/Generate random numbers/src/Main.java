import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your code here
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //System.out.println(n+"," +a+","+ b);
        Random random = new Random(a + b);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int intervalLength = b - a + 1;
            sum += random.nextInt(intervalLength)  + a;
        }
        System.out.println(sum);
    }
}