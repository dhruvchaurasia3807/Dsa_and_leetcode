public class leet1700 {
    public static int countStudents(int[] students, int[] sandwiches) {

        int n = students.length;
        int[] preferenceCount = new int[2];

        for (int i = 0; i < n; i++) {
            preferenceCount[students[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (preferenceCount[sandwiches[i]] == 0) {
                return n - i;
            }

            preferenceCount[sandwiches[i]]--;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] students = {1, 1, 1, 0};
        int[] sandwiches = {0, 1, 0, 1};

        System.out.println(countStudents(students, sandwiches));
    }
}

// output:2