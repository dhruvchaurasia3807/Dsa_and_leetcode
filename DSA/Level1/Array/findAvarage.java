public class findAvarage {
   public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,9};
    double total = 0;
    for(int i=0;i<arr.length;i++){
        total += arr[i];
    }

    double avarage = total/(arr.length);
    System.out.println("avarage of the array is " + avarage);
   } 
}
  