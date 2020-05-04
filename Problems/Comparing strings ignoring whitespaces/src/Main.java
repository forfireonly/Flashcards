import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");
        if (str1.equals(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}