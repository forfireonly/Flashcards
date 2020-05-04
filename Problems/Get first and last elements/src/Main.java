import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] oldArray) {
        int[] newArray = new int[2];
        newArray[0] = oldArray[0];
        newArray[1] = oldArray[oldArray.length - 1];
        return newArray;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}