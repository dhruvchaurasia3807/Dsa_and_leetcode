package DSA.Level1.Stage7_TwoPointers;

public class sorted_two_Array_sum {
    public static void main(String[] args) {
        int[] firstArray = {1,3,5};
        int[] secondArray = {2,4,6};

        int[] mergedArray = new int[firstArray.length+secondArray.length];

        int firstIndex = 0;
        int secondIndex = 0;
        int mergedIndex = 0;

        while(firstIndex < firstArray.length && secondIndex < secondArray.length){
            if(firstArray[firstIndex] < secondArray[secondIndex]){
                mergedArray[mergedIndex] = firstArray[firstIndex];
                firstIndex++;
            }
            else{
                mergedArray[mergedIndex] = secondArray[secondIndex];
                secondIndex++;
            }
            mergedIndex++;
        }

        while(firstIndex < firstArray.length){
            mergedArray[mergedIndex] = firstArray[firstIndex];
            firstIndex++;
            mergedIndex++;
        }

        while(secondIndex < secondArray.length){
            mergedArray[mergedIndex] = secondArray[secondIndex];
            secondIndex++;
            mergedIndex++;
        }

        for(int index = 0;index < mergedArray.length;index++){
            System.out.print(mergedArray[index] + " ");
        }
    }
}


// output:1 2 3 4 5 6 