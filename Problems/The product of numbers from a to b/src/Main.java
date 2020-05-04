import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        long a = scn.nextInt();
        long b = scn.nextInt();
        for (long i = a + 1; i < b; i++) {
            a = a * i;
        }
        System.out.println(a);
    }
}