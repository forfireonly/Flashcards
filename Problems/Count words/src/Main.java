import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            String myString = reader.readLine();
            myString = myString.trim();
            if (myString.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(myString.split("\\s+").length);
            }
        }
    }
}