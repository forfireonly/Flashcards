package flashcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static String choseNextAction(Scanner scn) {
        System.out.println("Input the action (add, remove, import, export, ask, exit)");
        return  scn.nextLine();
    }

    public static String add(Scanner scn, TreeMap<String, String> cards) {

            System.out.println("Enter the term for card");
            String term = scn.nextLine();
            if (cards.containsKey(term)) {
                System.out.println("The card \"" + term + "\" already exists.");
            } else {
                System.out.println("Enter the definition for card");
                String definition = scn.nextLine();
                if (cards.containsValue(definition)) {
                    System.out.println("The definition \"" + definition + "\" already exists.");
                } else {
                    cards.put(term, definition);
                    System.out.println("The pair (\"" + term + "\":\"" + definition + "\")" + " has been added.");
                }
            }
        return choseNextAction(scn);
    }

    public static String remove(Scanner scn, TreeMap<String,String> cards) {
      System.out.println("The card to be removed");
      String cardToRemove = scn.next() + scn.nextLine();
      if (cards.containsKey(cardToRemove)) {
          cards.remove(cardToRemove);
          System.out.println("The card has been removed.");
      } else {
          System.out.println("Can't remove \"" + cardToRemove + "\": there is no such card.");
      }
        return choseNextAction(scn);
    }

    public static String ask(Scanner scn, TreeMap<String,String> cards, TreeMap<String, Integer> hardestCard) {
        System.out.println("How many times to ask?");
        int timesToAsk = Integer.parseInt(scn.nextLine());

        while (timesToAsk > 0) {
            for (var entry : cards.entrySet()) {
                String q = "Print the definition of " + "\"" + entry.getKey() + "\":";
                System.out.println(q);
                String answr = "";
                answr =  scn.nextLine();
                String dif = "";
                if (answr.equals(entry.getValue())) {
                    System.out.println("Correct answer.");
                } else {
                    for (String key : cards.keySet()) {
                        if (answr.equals(cards.get(key))) {
                            dif = "\", `you've just written the definition of \"" + key + "\"";
                        }
                        if (hardestCard.containsKey(key)) {
                            int multipleMistakes = hardestCard.get(key) + 1;
                            hardestCard.put(key, multipleMistakes);
                        } else {
                            hardestCard.put(key, 1);
                        }

                    }
                    if (dif.equals("") || answr.isEmpty() || answr.equals(" ")) {
                        System.out.println("Wrong answer. The correct one is \"" + entry.getValue() +"\"");
                    } else {
                        System.out.println("Wrong answer. The correct one is \"" + entry.getValue() + dif);
                    }
                }
                timesToAsk--;
                if (timesToAsk == 0) {
                    break;
                }
            }
        }
        return choseNextAction(scn);
    }

    public static String export (Scanner scn, TreeMap<String, String> cards) {
        System.out.println("Please, provide name of the file:");
        String fileName = scn.next() + scn.nextLine();
        File file = new File(fileName);
        if (cards.size() == 0) {
            System.out.println("0 cards have been saved");
        } else {
            try (PrintWriter printWriter = new PrintWriter(file)) {
                int count = 0;
                for (var entry : cards.entrySet()) {
                    printWriter.println(entry.getKey() + "=" + entry.getValue());
                    count++;
                }
                System.out.println(count + " cards have been saved");
            } catch (IOException e) {
                System.out.printf("An exception occurs %s", e.getMessage());
            }
        }
        return choseNextAction(scn);
    }

    public static String hardestCardToAnswer(Scanner scn, TreeMap<String,Integer> hardestCard) {
        if (hardestCard.isEmpty()) {
            System.out.println("There are no cards with errors.");
        } else {
            System.out.println("The hardest card is \"" + hardestCard.firstKey() + "\". You have " + hardestCard.get(hardestCard.firstKey()) + " errors answering it.");
        }
        return choseNextAction(scn);
    }

    public static String resetStats (Scanner scn, TreeMap<String, Integer> hardestCard) {
        hardestCard.clear();
        return choseNextAction(scn);
    }

    public static String importFile(Scanner scn, TreeMap<String, String> cards, String nameOfFileToImport) throws IOException {

        if (Files.exists(Paths.get(nameOfFileToImport))) {
            try (Scanner scanner = new Scanner(Paths.get(nameOfFileToImport))){
                int count = 0;
                while (scanner.hasNext()) {
                    String input = scanner.nextLine();
                    //System.out.println(input);
                    String[]inputArray = input.split("=");
                    cards.put(inputArray[0], inputArray[1]);
                    count++;
                }
                System.out.println(count + " cards have been loaded");
            } catch (FileNotFoundException e) {
                System.out.println("No file found: ");} }
        else  {
            System.out.println("File not found.");
        }
        return choseNextAction(scn);
    }

    public static void export(TreeMap<String, String> cards, String fileName) {

        File file = new File(fileName);
        if (cards.size() == 0) {
            System.out.println("0 cards have been saved");
        } else {
            try (PrintWriter printWriter = new PrintWriter(file)) {
                int count = 0;
                for (var entry : cards.entrySet()) {
                    printWriter.println(entry.getKey() + "=" + entry.getValue());
                    count++;
                }
                System.out.println(count + " cards have been saved");
            } catch (IOException e) {
                System.out.printf("An exception occurs %s", e.getMessage());
            }
        }
    }
    public static void main(String[] args) throws IOException {
        TreeMap<String,String> cards = new TreeMap<>();
        TreeMap<String, Integer> hardestCard = new TreeMap<>();
        Scanner scn = new Scanner(System.in);
        String fileName = "";
        String action = "";
        boolean save = false;
        boolean done = false;
        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-import".toLowerCase())) {
                    String nameOfFileToImport = args[i + 1];
                    action = importFile(scn, cards, nameOfFileToImport);
                    done = true;
                }
                if (args[i].equals("-export".toLowerCase())){
                    fileName = args[i + 1];
                    save = true;
                }
            }
        }
        if (!done) {
            System.out.println("Input the action (add, remove, import, export, ask, exit)");
            action = scn.nextLine().trim();
        }


        while (!action.equals("exit")) {
            switch (action) {
                case ("add"):
                    action = add(scn, cards);
                    break;
                case ("remove"):
                    action = remove(scn, cards);
                    break;
                case ("import"):
                    action = importFile(scn,cards, args[1]);
                    break;
                case ("export"):
                    action = export(scn, cards);
                    break;
                case ("ask"):
                    action = ask(scn, cards, hardestCard);
                    break;
                case ("log"):

                    break;
                case ("hardest card"):
                    action = hardestCardToAnswer (scn, hardestCard);
                    break;
                case("reset stats"):
                    action = resetStats(scn, hardestCard);
                    break;
                default:
            }
        }

        System.out.println("Bye bye!");
        if (save) {
            export(cards, fileName);
        }
    }
}
