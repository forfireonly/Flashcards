import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> myArrayList = new ArrayList<>();
        String[]line = scn.nextLine().split(" ");
        int number = scn.nextInt();
        int[] lineIntegers = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            lineIntegers[i] = Integer.parseInt(line[i]);
        }
        int minDistance = Math.abs(lineIntegers[0] - number);
        for (int each : lineIntegers) {
            if (Math.abs(each - number) <= minDistance) {
                minDistance = Math.abs(each - number);
            }
        }

        for (int each : lineIntegers) {
            if (Math.abs(each - number) == minDistance) {
                myArrayList.add(each);
            }
        }
        Collections.sort(myArrayList);
        for (int each : myArrayList) {
            System.out.print(each + " ");
        }
    }

}