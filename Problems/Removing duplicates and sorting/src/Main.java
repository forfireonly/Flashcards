import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int numberOfStrings = scn.nextInt();
        ArrayList<String> myArray = new ArrayList<>();
        for (int i = 0; i <= numberOfStrings; i++) {
            myArray.add(scn.nextLine());
        }
        Set<String> mySet = new HashSet<>(myArray);
        //System.out.println(mySet);
        ArrayList<String> myList = new ArrayList<>(mySet);

        for (int i = 0; i < myList.size() - 1; i++) {
            for (int j = i + 1; j <myList.size(); j++) {
                if (myList.get(i).compareTo(myList.get(j)) > 0) {
                    String temp = myList.get(i);
                    myList.set(i, myList.get(j));
                    myList.set(j, temp);
                }
            }
        }
        for (String each: myList) {
            System.out.println(each);
        }
    }

}

