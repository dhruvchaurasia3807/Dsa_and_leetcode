package java_collection_freamwork.TreeSet;
import java.util.TreeSet;

public class method3 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Higher than 20: " + set.higher(20));

        System.out.println("Lower than 20: " + set.lower(20));

        System.out.println("Ceiling of 25: " + set.ceiling(25));

        System.out.println("Floor of 25: " + set.floor(25));
    }
}

// output:
// Higher than 20: 30
// Lower than 20: 10
// Ceiling of 25: 30
// Floor of 25: 20