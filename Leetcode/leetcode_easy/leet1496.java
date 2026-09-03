import java.util.HashSet;
import java.util.Set;

public class leet1496 {

    public static boolean isPathCrossing(String path) {

        Set<String> set = new HashSet<>();

        int x = 0;
        int y = 0;

        // Starting position
        String key = x + "_" + y;
        set.add(key);

        // Normal for loop
        for (int i = 0; i < path.length(); i++) {

            char ch = path.charAt(i);

            if (ch == 'E') {
                x++;
            }
            else if (ch == 'W') {
                x--;
            }
            else if (ch == 'N') {
                y++;
            }
            else {
                y--;
            }

            // New position
            key = x + "_" + y;

            // Check if position was already visited
            if (set.contains(key)) {
                return true;
            }

            // Add new position
            set.add(key);
        }

        return false;
    }

    public static void main(String[] args) {

        String path = "NESW";

        boolean result = isPathCrossing(path);

        System.out.println("Path Crossing: " + result);
    }
}

// output:
// Path Crossing: true