public class leet2582 {

    public int passThePillow(int n, int time) {
        int idx = 1;
        int dir = 1;

        while (time > 0) {
            if (idx + dir >= 1 && idx + dir <= n) {
                idx += dir;
                time--;
            } else {
                dir *= -1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        leet2582 obj = new leet2582();

        int n = 4;
        int time = 5;

        int result = obj.passThePillow(n, time);

        System.out.println("Person holding the pillow: " + result);
    }
}

// output:Person holding the pillow: 2