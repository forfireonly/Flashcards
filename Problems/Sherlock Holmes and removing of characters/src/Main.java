import java.util.HashMap;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String wordOne = scn.nextLine();
        String wordTwo = scn.nextLine();
        char[] wordOneArray = wordOne.toLowerCase().toCharArray();
        char[] wordTwoArray = wordTwo.toLowerCase().toCharArray();
        HashMap<Character, Integer> wordOneChar = new HashMap<>();
        HashMap<Character, Integer> wordTwoChar = new HashMap<>();
        int numberToDelete = 0;
        int letterCountOne = 0;
        for (char each : wordOneArray) {
            letterCountOne = 0;
            for (char c : wordOneArray) {
                if (each == c) {
                    letterCountOne++;
                }
            }
            wordOneChar.put(each, letterCountOne);
        }
        int letterCountTwo = 0;
        for (char each : wordTwoArray) {
            letterCountTwo = 0;
            for (Character c : wordTwoArray) {
                if (each == c) {
                    letterCountTwo++;
                }
            }
            wordTwoChar.put(each, letterCountTwo);
        }

        for (Character each  : wordOneChar.keySet()) {
            if (wordTwoChar.containsKey(each) && !wordOneChar.get(each).equals(wordTwoChar.get(each))) {
                int dif = Math.abs(wordOneChar.get(each) - wordTwoChar.get(each));
                numberToDelete += dif;
            } else if (!wordTwoChar.containsKey(each)) {
                numberToDelete += wordOneChar.get(each);
            }
        }
        for (Character each : wordTwoChar.keySet()) {
            if (!wordOneChar.containsKey(each)) {
                numberToDelete += wordTwoChar.get(each);
            }
        }
        System.out.println(numberToDelete);
    }
}