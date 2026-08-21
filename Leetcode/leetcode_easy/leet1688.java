class leet1688 {

    static int numberOfMatches(int n) {

        int result = 0;

        while (n > 1) {

            if (n % 2 == 0) {
                result += n / 2;
                n = n / 2;

            } else {
                result += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    

        int n = 7;

        int result = numberOfMatches(n);

        System.out.println("Number of matches = " + result);
    }
}

// output:Number of matches = 6