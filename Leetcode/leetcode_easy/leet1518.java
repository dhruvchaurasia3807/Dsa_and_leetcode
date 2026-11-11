
public class leet1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int consumed = 0;

        while (numBottles >= numExchange) {
            consumed = consumed + numExchange;
            numBottles = numBottles - numExchange;

            numBottles = numBottles + 1;
        }

        return consumed + numBottles;
    }

    public static void main(String[] args) {
        int numBottles = 15;
        int numExchange = 4;

        int result = numWaterBottles(numBottles, numExchange);

        System.out.println("Total bottles consumed: " + result);
    }
}


// output:
// Total bottles consumed: 19