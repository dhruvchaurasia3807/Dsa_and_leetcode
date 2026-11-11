class Main {
    public static void main(String[] args) {

        int arr[] = {4, 2, 1, 7, 3};
        int k = 2;

        int sum = 0;
        int min = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        min = sum;

        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i-k];

            if (sum < min) {
                min = sum;
            }
        }

        System.out.println(min);
    }
}