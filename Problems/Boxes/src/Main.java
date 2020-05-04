import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String str1 = "Box 1 > Box 2";
        String str2 = "Box 1 < Box 2";
        Scanner scn = new Scanner(System.in);
        String firstBox = scn.nextLine();
        String secondBox = scn.nextLine();
        String[]firstBoxArrayString = firstBox.split(" ");
        String[]secondBoxArrayString = secondBox.split(" ");
        /*int[]firstBoxArrayInt = new int[firstBoxArrayString.length];
        int[]secondBoxArrayInt = new int[secondBoxArrayString.length];
        for (int i = 0; i < 3; i++) {
            firstBoxArrayInt[i] = Integer.parseInt(firstBoxArrayString[i]);
        }
        for (int i = 0; i < 3; i++) {
            secondBoxArrayInt[i] = Integer.parseInt(secondBoxArrayString[i]);
        }*/
        int max1 = Integer.parseInt(firstBoxArrayString[0]);
        int min1 = Integer.parseInt(firstBoxArrayString[0]);
        int max2 = Integer.parseInt(secondBoxArrayString[0]);
        int min2 = Integer.parseInt(secondBoxArrayString[0]);
        for (int i = 1; i < 3; i++) {
            if (Integer.parseInt(firstBoxArrayString[i]) > max1) {
                max1 = Integer.parseInt(firstBoxArrayString[i]);
            }
            if (Integer.parseInt(firstBoxArrayString[i]) < min1) {
                min1 = Integer.parseInt(firstBoxArrayString[i]);
            }
            if (Integer.parseInt(secondBoxArrayString[i]) > max2) {
                max2 = Integer.parseInt(secondBoxArrayString[i]);
            }
            if (Integer.parseInt(secondBoxArrayString[i]) < min2) {
                min2 = Integer.parseInt(secondBoxArrayString[i]);
            }
        }
        if (max1 > max2 & min1 > min2) {
            System.out.println(str1);
        } else if (max1 > max2 & min1 == min2) {
            System.out.println(str1);
        } else if (max1 == max2 & min1 > min2) {
            System.out.println(str1);
        } else if (max1 < max2 & min1 < min2) {
            System.out.println(str2);
        } else if (max1 < max2 & min1 == min2) {
            System.out.println(str2);
        } else if (max1 == max2 & min1 < min2) {
            System.out.println(str2);
        } else if (max1 == max2 & min1 == min2) {
            System.out.println("Box 1 = Box 2");
        } else {
            System.out.println("Incomparable");
        }

    }
}