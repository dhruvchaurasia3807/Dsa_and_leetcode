package java_collection_freamwork.ArrayList;

import java.util.ArrayList;

public class copyArrayListOneToAnother {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>(list1);

        System.out.println(list2);
    }
}

// output:[10, 20, 30]