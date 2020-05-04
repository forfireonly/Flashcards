import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] myArray = new int [arraySize];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scn.nextInt();
        }
        for (int each : myArray) {
            System.out.print(each);
        }
    }
}