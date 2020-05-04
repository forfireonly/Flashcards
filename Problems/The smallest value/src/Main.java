import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner scn =  new Scanner(System.in);
        Long longNumber = scn.nextLong();
        Long n = 1L;
        while (longNumber > 0) {
             longNumber /= ++n;
        }
        System.out.println(n);
    }
}