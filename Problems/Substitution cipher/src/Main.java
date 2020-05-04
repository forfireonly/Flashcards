import java.util.LinkedHashMap;
import java.util.Scanner;
class Main {
    static void codeEncode(String line, LinkedHashMap<Character, Character> keyEncoding) {
        Character[] processed = new Character[line.length()];
        for (int i = 0; i < line.length(); i++) {
            processed[i] = keyEncoding.get(line.charAt(i));
        }
        for (char c : processed) {
            System.out.print(c);
        }
        System.out.println();
    }
    static LinkedHashMap<Character, Character> createKey(String original, String resulting) {
        LinkedHashMap<Character, Character> key = new LinkedHashMap<>();
        for (int i = 0; i < original.length(); i++) {
            key.put(original.charAt(i), resulting.charAt(i));
        }
        return key;
    }
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String original = scn.nextLine();
        String resulting = scn.nextLine();
        String needEncoding = scn.nextLine();
        String needDecoding = scn.nextLine();
        LinkedHashMap<Character, Character> keyEncoding = createKey(original, resulting);
        LinkedHashMap<Character, Character> keyDecoding = createKey(resulting, original);
        codeEncode(needEncoding, keyEncoding);
        codeEncode(needDecoding, keyDecoding);

    }
}