import java.util.Arrays;

public class leet2037 {

    public static int minMovesToSeat(int[] seats, int[] students) {

        Arrays.sort(seats);
        Arrays.sort(students);

        int n = students.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += Math.abs(seats[i] - students[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};

        int result = minMovesToSeat(seats, students);

        System.out.println("Minimum moves: " + result);
    }
}

// output:Minimum moves: 4