import java.util.*;

public class leet1436 {

    public static String destCity(List<List<String>> paths) {

        Map<String, Integer> mp = new HashMap<>();

        // Store all source cities
        for (List<String> path : paths) {

            String source = path.get(0); // source city

            mp.put(source, mp.getOrDefault(source, 0) + 1);
        }

        // Check all destination cities
        for (List<String> path : paths) {

            String dest = path.get(1); // destination city

            // If destination is not a source city
            if (mp.getOrDefault(dest, 0) == 0) {
                return dest;
            }
        }

        return "";
    }

    public static void main(String[] args) {

        // Create paths
        List<List<String>> paths = new ArrayList<>();

        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));

        // Call function
        String result = destCity(paths);

        // Print answer
        System.out.println("Destination City: " + result);
    }
}


// output:Destination City: Sao Paulo