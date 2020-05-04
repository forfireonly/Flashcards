import java.util.*;

class SetUtils {

    /**
     * @return symmetric difference between set1 and set2
     */
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        // write your code here
        Set<T> copy1 = new HashSet<>(set1);
        Set<T> copy2 = new HashSet<>(set2);
        set1.retainAll(set2);
        copy1.removeAll(set1);
        copy2.removeAll(set1);
        Set<T> mergedSet = new HashSet<>();
        mergedSet.addAll(copy1);
        mergedSet.addAll(copy2);
        return mergedSet;
    }

}

/* Do not change the code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strSet1 = scanner.nextLine();
        String strSet2 = scanner.nextLine();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        if (!Objects.equals(strSet1, "empty")) {
            Collections.addAll(set1, strSet1.split("\\s+"));
        }

        if (!Objects.equals(strSet2, "empty")) {
            Collections.addAll(set2, strSet2.split("\\s+"));
        }

        Set<String> resultSet = SetUtils.symmetricDifference(set1, set2);

        System.out.println(String.join(" ", resultSet));
    }
}