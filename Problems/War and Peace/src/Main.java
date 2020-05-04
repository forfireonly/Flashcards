import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        HashMap<String, Integer> wordCount = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        String myLine = scn.nextLine();
        String[] myLineWords = myLine.split(" ");
        int count = 1;
        for (int i = 0; i < myLineWords.length; i++) {
            count = 1;
            for (int j = i + 1; j < myLineWords.length; j++) {
                if (myLineWords[i].toLowerCase().equals(myLineWords[j].toLowerCase())) {
                    count++;
                }
            }
                if (!wordCount.containsKey(myLineWords[i].toLowerCase())) {
                    wordCount.put(myLineWords[i].toLowerCase(), count);
                }
        }
        for (var each: wordCount.entrySet()){
            System.out.println(each.getKey() + " " + each.getValue());
        }

    }
}