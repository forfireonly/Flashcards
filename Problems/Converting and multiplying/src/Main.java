import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()) {
            String myStr = scn.nextLine();
            try {
                int myInt = Integer.parseInt(myStr);
                if (myInt == 0) {
                    break;
                }
                System.out.println(myInt * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + myStr);
            }
        }
    }
}