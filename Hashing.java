import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Hashing {
    public static void main(String[] args) {
        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180); // Updates(If already exists)
        System.out.println(map);

        // Search
        if (map.containsKey("China")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("China")); // Key exists
        System.out.println(map.get("Indinesia")); // Key doesn't exist

        System.out.println();
        System.out.println();

        int arr[] = { 12, 15, 18 };
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        for (int val : arr) {
            System.out.println(val + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println();
        System.out.println();

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println();
        System.out.println();

        map.remove("China");
        System.out.println(map);
    }
}