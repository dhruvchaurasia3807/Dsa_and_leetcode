package java_collection_freamwork.Iterator;

import java.util.*;

public class remove {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {

            int value = it.next();

            if (value == 20) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}

// output:[10, 30, 40]