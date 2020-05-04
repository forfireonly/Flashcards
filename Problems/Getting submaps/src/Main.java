import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String rangeString = scn.nextLine();
        String[] rangeArrayString = rangeString.split(" ");
        int[] rangeArrayInt = new int[rangeArrayString.length];
        rangeArrayInt[0] = Integer.parseInt(rangeArrayString[0]);
        rangeArrayInt[1] = Integer.parseInt(rangeArrayString[1]);
        scn.nextInt();
        TreeMap<Integer, String> keyValues = new TreeMap<>();
        while (scn.hasNext()) {
            int myKey = scn.nextInt();
            String myValue = scn.next();
            keyValues.put(myKey, myValue);
        }
        SortedMap<Integer, String> mapRange = new TreeMap<>();
        mapRange = keyValues.subMap(rangeArrayInt[0], rangeArrayInt[1] + 1);
        for (var entry : mapRange.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}