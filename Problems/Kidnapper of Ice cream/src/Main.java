import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String newspaper = scn.nextLine();
        String note = scn.nextLine();
        String[] newspaperArray = newspaper.trim().split("\\s+");
        String[] noteArray = note.trim().split("\\s+");
        int count = 0;
        int track = 0;
        HashMap<String, Integer> newspaperWordAvailability = new HashMap<>();
        for (String s : newspaperArray) {
            count = 0;
            for (String value : newspaperArray) {
                if (s.equals(value)) {
                    count++;
                }
            }
            newspaperWordAvailability.put(s, count);
        }

        int countNote = 0;
        for (String s : noteArray) {
            countNote = 0;

            for (String value : noteArray) {
                if (s.equals(value)) {
                    countNote++;
                }
            }
            if (newspaperWordAvailability.containsKey(s) && countNote <= newspaperWordAvailability.get(s)) {
                track++;
            }
        }

        if (track == noteArray.length) {
            System.out.println("You get money");
        } else {
            System.out.println("You are busted");
        }
    }
}