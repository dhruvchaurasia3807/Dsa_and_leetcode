package DSA.Level1.Searching_Sorting;

public class linearSearch {

    public static void main(String[] args) {

        int[] arr = {2, 45, 65, 77, 89};

        int target = 50;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                System.out.println("The element is found at index = " + i);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The element is not found");
        }
    }
}

// output:The element is not found