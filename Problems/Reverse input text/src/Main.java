import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws Exception {
            Reader reader = new BufferedReader(new InputStreamReader(System.in));
            // start coding here
            ArrayList<Character> text = new ArrayList<>();
            int j;
            while ((j = reader.read()) != -1) {
                text.add((char) j);
            }
            reader.close();

            for (int i = text.size() - 1; i >= 0; i--) {
                System.out.print(text.get(i));
            }
        }
    }

