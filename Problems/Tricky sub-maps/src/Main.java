import java.util.*;

class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {

        // Write your code here

                int fk = map.firstKey();
                int lk = map.lastKey();
                NavigableMap<Integer, String> myMap;
                if (fk % 2 != 0) {
                    int lKey = fk + 5;
                    myMap = (NavigableMap<Integer, String>) map.headMap(lKey);
                    return myMap.descendingMap();
                } else {
                    int fKey = lk - 4;
                    myMap = (NavigableMap<Integer, String>) map.tailMap(fKey);
                    return myMap.descendingMap();
        }
    }
}

/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}