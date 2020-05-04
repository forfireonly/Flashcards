import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code heres
        Scanner scn = new Scanner(System.in);
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();

        if (x1 == x2 || y1 == y2 || y2 == x2 + y1 - x1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}