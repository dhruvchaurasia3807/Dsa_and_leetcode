package Dsa_with_basic_question.Array;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        int[] box = new int[5];

        Scanner sc = new Scanner(System.in);
        int[] round_box = { 1, 2, 3 };
        box[0] = sc.nextInt();
        box[1] = sc.nextInt();
        box[2] = sc.nextInt();

        System.out.println("phy : " + box[0]);
        System.out.println("chem : " + box[1]);
        System.out.println("math : " + box[2]);

        System.out.println(round_box[0]);

    }
}


// output:
// 70
// 80
// 85
// phy : 70
// chem : 80
// math : 85
// 1