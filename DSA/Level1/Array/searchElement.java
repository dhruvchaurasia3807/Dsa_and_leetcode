public class searchElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        int target = 6;
        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                isPresent = true;
                break;
            } 
        }
        if (isPresent) {
            System.out.println("no is present  ");
        } else {
            System.out.println("no is not present");
        }
    }
}
