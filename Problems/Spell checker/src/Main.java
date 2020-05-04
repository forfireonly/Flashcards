import java.util.*;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        String[]words = new String[number];

        for (int i = 0; i < number; i++) {
            words[i] = (scn.next() + scn.nextLine()).toLowerCase();
        }

        scn.nextInt();
        ArrayList<String> textArray = new ArrayList<>();
        while (scn.hasNext()) {
            textArray.add(scn.next().toLowerCase());
        }

        textArray.removeAll(Arrays.asList(words));
        Set<String> textSet = new HashSet<>(textArray);
        for (String s : textSet) {
            System.out.println(s);
        }
    }
}