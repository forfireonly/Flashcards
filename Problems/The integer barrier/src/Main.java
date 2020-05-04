import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int sum = 0;
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()) {
            int number = scn.nextInt();
            if (number == 0) {
                break;
            } else {
                sum += number;
                if (sum >= 1000) {
                    sum = sum - 1000;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}