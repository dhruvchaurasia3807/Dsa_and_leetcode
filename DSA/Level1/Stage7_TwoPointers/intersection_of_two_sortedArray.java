package DSA.Level1.Stage7_TwoPointers;

public class intersection_of_two_sortedArray {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,6};
        int[] secondArray = {2,4,6,8};

        int firstIndex = 0;
        int secondIndex = 0;

        while(firstIndex < firstArray.length && secondIndex < secondArray.length){
            if(firstArray[firstIndex] == secondArray[secondIndex]){
                System.out.print(firstArray[firstIndex] + " ");
                firstIndex++;
                secondIndex++;
            }
            else if(firstArray[firstIndex] < secondArray[secondIndex]){
                firstIndex++;
            }
            else{
                secondIndex++;
            }
        }
    }
}

// output:2 4 6 
