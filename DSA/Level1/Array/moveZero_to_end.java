package DSA.Level1.Array;

public class moveZero_to_end {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 4, 0, 6 };
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for(int item : arr){
            System.out.print(item+" ");
        }
    }

}
