import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String firstWord = scn.nextLine();
        String secondWord = scn.nextLine();
        Map<Character, Integer> numberOfLetters1 = new HashMap<>();
        int count = 0;
        for (int j = 0; j < firstWord.length(); j++) {
            count = 0;
            for (int i = 0; i < firstWord.length(); i++) {
                 if (Character.toLowerCase(firstWord.charAt(j)) == Character.toLowerCase(firstWord.charAt(i))) {
                     count++;
                 }
            }
            numberOfLetters1.put(Character.toLowerCase(firstWord.charAt(j)), count);
        }
        Map<Character, Integer> numberOfLetters2 = new HashMap<>();
        for (int j = 0; j < secondWord.length(); j++) {
            count = 0;
            for (int i = 0; i < secondWord.length(); i++) {
                if (Character.toLowerCase(secondWord.charAt(j)) == Character.toLowerCase(secondWord.charAt(i))) {
                    count++;
                }
            }
            numberOfLetters2.put(Character.toLowerCase(secondWord.charAt(j)), count);
        }
       if (Objects.equals(numberOfLetters1, numberOfLetters2)) {
           System.out.println("yes");
       } else {
           System.out.println("no");
       }
    }
}